import { LineWave } from "react-loader-spinner";
import Dropdown from "rc-dropdown";
import Menu, { Item as MenuItem } from "rc-menu";
import ButtonWithIcon from "../../../components/ButtonWithIcon";
import "rc-dropdown/assets/index.css";
import icon from "../../../assets/icons/three_points_icon.svg";
import colors from "../../../styles/colorsConfig.json";
import styles from "./Item.module.css";

export function renderItem(item, removeComent) {
  const menu = (
    <Menu selectedKeys={[]} onSelect={() => removeComent(item.id)}>
      <MenuItem>Apagar comentário</MenuItem>
    </Menu>
  );
  return (
    <div className={styles.itemContainer}>
      <div className={styles.itemConteudo}>
        <span className={styles.itemComentario}>{item.description}</span>
        <span className={styles.itemDisciplina}>
          {item.disciplina ? (
            item.disciplina.name
          ) : (
            <LineWave color={colors.theme.secondary} />
          )}
        </span>
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
