import React, { useEffect, useState } from "react";
import styles from "./Disciplina.module.css";
import UserImage from "../../assets/icons/user_anonimous.svg";
import NavMenu from "../../components/NavMenu";
import { useAuth } from "../../contexts/AuthContext";
import DataList from "../../components/DataList";
import { getAll } from "../../services/disciplinaService";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import External from "../../assets/icons/external.svg";
import Dropdown from "../../components/Dropdown";
import { atributosDisciplina } from "../../services/DadosEstaticos";

function DisciplinaIndex() {
  const { user } = useAuth();
  const [disc, setDisc] = useState([]);
  const [loading, setLoading] = useState(false);
  const [atributo, setAtributo] = useState();

  useEffect(() => {
    setLoading(true);
    getAll().then((data) => {
      setDisc(data);
      setLoading(false);
    });
  }, []);

  function renderItem(item) {
    return (
      <div className={styles.itemContainer}>
        <div className={styles.itemNota}>{item.nota}/5</div>
        <div className={styles.itemConteudo}>
          <span>{item.nome}</span>
          <span>Periodo: {item.periodo}</span>
        </div>
        <div className={styles.itemButton}>
          <ButtonWithIcon
            icon={External}
            onClick={() => console.log(item.nome)}
            transparent
          />
        </div>
      </div>
    );
  }

  return (
    <div className={styles.container}>
      <div className={styles.navMenu}>
        <div className={styles.userBox}>
          <img
            src={user === undefined ? UserImage : user.photo}
            alt="User Logged"
            height={96}
            width={96}
          />
          <span>{user === undefined ? "Usuário Anônimo" : user.name}</span>
        </div>
        <div className={styles.menuItems}>
          <NavMenu />
        </div>
      </div>
      <div className={styles.content}>
        <div className={styles.header}>
          <span>Lista de Disciplinas</span>
        </div>

        <div className={styles.filter}>
          <input
            type="text"
            id="nome"
            placeholder="Procure por uma disciplina"
          />
          <div className={styles.dropdown}>
            <Dropdown
              data={atributosDisciplina()}
              placeholder={"Selecione um filtro"}
              value="value"
              label="text"
              onChange={setAtributo}
            />
          </div>
        </div>

        <div className={styles.indexContent}>
          <DataList data={disc} loading={loading} render={renderItem} />
        </div>
      </div>
    </div>
  );
}

export default DisciplinaIndex;
