import External from "../../assets/icons/external.svg";
import EditIcon from "../../assets/icons/edit_icon.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import styles from "./Item.module.css";

export function renderItem({ item, isAdmin, navigate }) {
  const icon = isAdmin ? EditIcon : External;

  function handleClick() {
    if (isAdmin) {
      navigate(`/disciplina/edicao/${item.id}`);
    } else {
      navigate(`/disciplina/${item.id}`);
    }
  }

  return (
    <div className={styles.itemContainer}>
      <div className={styles.itemNota}>5/5</div>
      <div className={styles.itemConteudo}>
        <span>{item.name}</span>
        <span>Professor: {item.nameTeacher}</span>
      </div>
      <div className={styles.itemButton}>
        <ButtonWithIcon icon={icon} onClick={handleClick} transparent="true" />
      </div>
    </div>
  );
}
