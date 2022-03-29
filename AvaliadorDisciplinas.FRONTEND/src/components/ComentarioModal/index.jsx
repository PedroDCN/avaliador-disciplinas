import styles from "./ComentarioModal.module.css";
import icon from "../../assets/icons/user_image_prof.svg";
import { useEffect, useState } from "react";
import { newProfessor } from "../../services/DadosEstaticos";
import { getComentariosById } from "../../services/comentariosServide";
import Button from "../Button";
import { Oval } from "react-loader-spinner";
import colors from "../../styles/colorsConfig.json";
import { useNavigate } from "react-router-dom";

function ComentarioModal({ show, handleClose, handleDelete, idComentario }) {
  const displayClassname = show ? styles.show : styles.hide;

  const navigate = useNavigate();
  const [loading, setLoading] = useState(false);
  const [comentario, setComentario] = useState(newProfessor());

  function handleClickOutside(e) {
    const classes = e.target.classList;
    if (classes.contains("outside")) {
      handleClose();
    }
  }

  function handleClickName() {
    navigate(`/adm/user/${comentario.idStudent}`);
  }

  useEffect(() => {
    (async () => {
      setLoading(true);

      const { data } = await getComentariosById(idComentario);
      setComentario(data);

      setLoading(false);
    })();
  }, [idComentario]);

  return (
    <div
      className={`${styles.modal} ${displayClassname} outside`}
      onClick={handleClickOutside}
    >
      {loading ? (
        <Oval
          width={40}
          height={40}
          color={colors.theme.terciary}
          secondaryColor={colors.theme.background}
          strokeWidth={5}
        />
      ) : (
        <div className={styles.container} onClick={() => {}}>
          <div className={styles.header}>
            <img
              src={comentario.photoStudent ? comentario.photoStudent : icon}
              alt=""
              referrerPolicy="no-referrer"
            />
            <div className={styles.infoContainer}>
              <span className={styles.nameInfo} onClick={handleClickName}>
                {comentario.nameStudent}
              </span>
              <span className={styles.numInfo}>
                Denúncias sobre este comentário: {comentario.complaints}
              </span>
            </div>
            <div className={styles.btnContainer}>
              <Button
                onClick={() => handleDelete(idComentario)}
                buttontitle={"DELETAR COMENTÁRIO"}
                backgroundcolor={colors.theme["red-400"]}
                width="12rem"
                color={colors.theme.white}
              />
            </div>
          </div>
          <div className={styles.content}>
            <span className={styles.displayComentario}>
              {comentario.description}
            </span>
          </div>
        </div>
      )}
    </div>
  );
}

export default ComentarioModal;
