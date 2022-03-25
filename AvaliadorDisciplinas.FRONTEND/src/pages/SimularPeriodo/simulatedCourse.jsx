import External from "../../assets/icons/external.svg";
import DeleteIcon from "../../assets/icons/delete_icon.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import styles from "./simulatedCourse.module.css";

export function renderSimulatedCourse(item, navigate, onClickDelete) {

  function handleExternalClick() {
    navigate(`/disciplina/${item.id}`);
  }

  function handleDeleteClick() {
    onClickDelete(item);
  }

  return (
    <div className={styles.itemContainer}>
      <div className={styles.itemNota}>{item.grade.toFixed(1)}</div>
      <div className={styles.itemConteudo}>
        <span>{item.name}</span>
        <span>Professor: {item.nameTeacher}</span>
      </div>
      <div className={styles.itemButton}>
        <ButtonWithIcon 
          className={styles.buttonExternal}
          icon={External}
          onClick={handleExternalClick} 
          transparent="true" 
        />
        <ButtonWithIcon
          className={styles.buttonDelete} 
          icon={DeleteIcon}
          onClick={handleDeleteClick} 
          transparent="true" 
        />
      </div>
    </div>
  );
}
