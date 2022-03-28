import EditIcon from "../../assets/icons/edit_icon.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import styles from "./comentariosListagem.module.css";

export function renderItem(item) {
    return (
        <div className={styles.itemContainer}>
            <div className={styles.itemConteudo}>
                <span className={styles.comentario}>{item.description}</span>
                <span>{item.nomeCourse}</span>
            </div>
            <div className={styles.itemButton}>
                <ButtonWithIcon icon={EditIcon} onClick={() => { }} transparent="true" />
            </div>
        </div>
    );
}
