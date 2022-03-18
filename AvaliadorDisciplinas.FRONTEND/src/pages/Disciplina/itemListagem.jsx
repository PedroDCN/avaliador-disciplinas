import External from "../../assets/icons/external.svg";
import EditIcon from "../../assets/icons/edit_icon.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import styles from "./Item.module.css";
import { useNavigate } from "react-router-dom";

export function RenderItem({ item, isAdmin }) {
  const icon = isAdmin ? EditIcon : External;
  const navigate = useNavigate();

  function handleClick() {
    const id = '2';
    if (isAdmin) {
      navigate(`/cadastrar_disc/${id}`); // não esquecer de mudar isso para generalizar
    } else {
      navigate(`/disciplina/${2}`);
    }
  }

  return (
    <div className={styles.itemContainer}>
      <div className={styles.itemNota}>{item.nota}/5</div>
      <div className={styles.itemConteudo}>
        <span>{item.nome}</span>
        <span>Periodo: {item.periodo}</span>
      </div>
      <div className={styles.itemButton}>
        <ButtonWithIcon 
          icon={icon}
          onClick={handleClick} 
          transparent="true" 
        />
      </div>
    </div>
  );
}
