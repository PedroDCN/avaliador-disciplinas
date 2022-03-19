import External from "../../assets/icons/external.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import styles from "./Item.module.css";

export function renderItem(item) {
  return (
    <div className={styles.itemContainer}>
      <div className={styles.itemImg}>
        <img src={item.foto} height={64} width={64} alt="Professor icon" />
      </div>
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
