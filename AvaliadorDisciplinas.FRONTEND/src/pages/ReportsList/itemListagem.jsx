import External from "../../assets/icons/external.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import UserImage from '../../assets/icons/user_anonimous.svg';
import styles from "./item.module.css";

export function renderItem({ item, showModal }) {


  async function openModal() {
    await showModal(item);
  }

  return (
    <div className={styles.itemContainer}>
      <div className={styles.itemPhoto}>
        <img 
            src={item.photoStudent ? item.photoStudent : UserImage}
            height={64}
            width={64}
            alt="userPhoto"
            referrerPolicy="no-referrer"
        />
      </div>

      <div className={styles.itemContent}>
        <h3>{item.nameStudent}</h3>
        <span><p>{item.description}</p></span>
      </div>

      <div className={styles.itemReports}>
          <h3>{item.complaints}</h3>
          <span>denuncias</span>
      </div>

      <div className={styles.itemButton}>
        <ButtonWithIcon 
          icon={External} 
          onClick={openModal}
          boxshadow="none"
          transparent="true"
        />
      </div>
    </div>
  );
}