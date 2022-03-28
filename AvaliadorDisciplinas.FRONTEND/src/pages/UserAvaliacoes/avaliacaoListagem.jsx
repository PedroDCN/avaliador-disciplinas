import External from "../../assets/icons/external.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import styles from "./avaliacaoListagem.module.css";

export function renderItem(item) {
    return (
        <div className={styles.itemContainer}>
            <div className={styles.itemConteudo}>
                <span className={styles.cadeiraNome}>{item.nomeCourse}</span>
                <span>Periodo: {item.nomeSemester}</span>
            </div>
            <div className={styles.itemButton}>
                <ButtonWithIcon icon={External} onClick={() => { }} transparent="true" />
            </div>
        </div>
    );
}
