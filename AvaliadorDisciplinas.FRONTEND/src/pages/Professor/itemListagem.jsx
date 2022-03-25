import External from "../../assets/icons/external.svg";
import EditIcon from "../../assets/icons/edit_icon.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import styles from "./Item.module.css";
import UserImageProf from '../../assets/icons/user_image_prof.svg';

export function renderItem({ item, isAdmin, navigate }) {
  const icon = isAdmin ? EditIcon : External;

  function handleClick() {
    if (isAdmin) {
      navigate(`/professor/edicao/${item.id}`);
    } else {
      debugger;
      navigate(`/professor/${item.id}`);
    }
  }

  return (
    <div className={styles.itemContainer}>
      <div className={styles.itemImg}>
        <img
          src={ item.photo === "" ? UserImageProf : item.photo }
          height={64}
          width={64}
          alt="Professor icon"
          referrerPolicy="no-referrer"
        />
      </div>
      <div className={styles.itemConteudo}>
        <span>{item.name}</span>
      </div>
      <div className={styles.itemButton}>
        <ButtonWithIcon icon={icon} onClick={handleClick} transparent="true" />
      </div>
    </div>
  );
}
