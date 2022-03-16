import External from "../../assets/icons/external.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import styles from "./Item.module.css";

export function renderItem(item) {
  return (
    <div className={styles.itemContainer}>
      <div className={styles.itemNota}>{item.nota}/5</div>
      <div className={styles.itemConteudo}>
        <span>{item.nome}</span>
        <span>Periodo: {item.periodo}</span>
      </div>
      <div className={styles.itemButton}>
        <ButtonWithIcon icon={External} onClick={() => {}} transparent="true" />
      </div>
    </div>
  );
}
