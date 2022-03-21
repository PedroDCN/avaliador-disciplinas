import External from "../../assets/icons/external.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import styles from "./comentariosListagem.module.css";

export function renderItem(item) {
    return (
        <div className={styles.itemContainer}>
            <div className={styles.itemConteudo}>
                <span className={styles.comentario}>{item.comentario}</span>
                <span>{item.nome}</span>
            </div>
            <div className={styles.itemButton}>
                <ButtonWithIcon icon={External} onClick={() => { }} transparent="true" />
            </div>
        </div>
    );
}
