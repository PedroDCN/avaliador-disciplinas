import icon from "../../../assets/icons/external.svg";
import ButtonWithIcon from "../../../components/ButtonWithIcon";
import styles from "./Item.module.css";

export function renderItem({ item, navigate }) {
  function handleClick() {
    navigate(`/disciplina/${item.id}`);
  }

  return (
    <div className={styles.itemContainer}>
      <div className={styles.itemConteudo}>
        <span className={styles.nomeDisciplina}>
          {item.disciplina ? item.disciplina.name : "carregando k"}
        </span>
        <span className={styles.nomeperiodo}>
          {item.periodo ? "Período: " + item.periodo.name : "carregando k"}
        </span>
      </div>
      <div className={styles.itemButton}>
        <ButtonWithIcon icon={icon} onClick={handleClick} transparent="true" />
      </div>
    </div>
  );
}
