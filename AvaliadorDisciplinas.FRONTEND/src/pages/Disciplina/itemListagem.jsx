import External from "../../assets/icons/external.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import styles from "./Item.module.css";

export function renderItem(item) {
  return (
    <div className={styles.itemContainer}>
      <div className={styles.itemNota}>5/5</div>
      <div className={styles.itemConteudo}>
        <span>{item.name}</span>
        <span>Professor: {item.nameTeacher}</span>
      </div>
      <div className={styles.itemButton}>
        <ButtonWithIcon icon={External} onClick={() => {}} transparent="true" />
      </div>
    </div>
  );
}
