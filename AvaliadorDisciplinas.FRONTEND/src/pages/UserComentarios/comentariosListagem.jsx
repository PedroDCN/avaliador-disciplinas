import Three_points_icon from "../../assets/icons/three_points_icon.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import styles from "./comentariosListagem.module.css";
import Menu, { Item as MenuItem } from "rc-menu";
import Dropdown from "rc-dropdown";
import icon from "../../assets/icons/three_points_icon.svg";

export function renderItem(item, removeComent) {
    const menu = (
        <Menu selectedKeys={[]} onSelect={() => removeComent(item.id)}>
            <MenuItem>Apagar comentário</MenuItem>
        </Menu>
    );

    return (
        <div className={styles.itemContainer}>
            <div className={styles.itemConteudo}>
                <span className={styles.comentario}>{item.description}</span>
                <span>{item.nomeCourse}</span>
            </div>
            <div className={styles.itemButton}>
                <Dropdown trigger={["click"]} overlay={menu} animation="slide-up">
                    <div>
                        <ButtonWithIcon icon={icon} transparent="true" />
                    </div>
                </Dropdown>


            </div>
        </div>
    );
}
