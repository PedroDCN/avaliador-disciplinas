import External from "../../assets/icons/external.svg";
import ButtonWithIcon from "../../components/ButtonWithIcon";
import UserImage from '../../assets/icons/user_anonimous.svg';
import styles from "./item.module.css";

export function renderItem({ item, navigate }) {

  function handleClick() {
      navigate(`/disciplina/8`);
  }

  return (
    <div className={styles.itemContainer}>
      <div className={styles.itemPhoto}>
        <img 
            src={item.photoStudent ? item.photoStudent : UserImage}
            height={64}
            width={64}
            alt="userPhoto"
        />
      </div>

      <div className={styles.itemContent}>
        <h3>{item.nameStudent}</h3>
        <span>{item.description}</span>
      </div>

      <div className={styles.itemReports}>
          <h3>{item.complaints}</h3>
          <span>denuncias</span>
      </div>

      <div className={styles.itemButton}>
        <ButtonWithIcon 
          icon={External} 
          onClick={handleClick}
          boxShadow="none"
        />
      </div>
    </div>
  );
}

/* {
    'photo':"",
    'nome': "Rodrigo",
    'comment': "comentario feio q n pode",
    'numDenuncias': 2,
    'id':23
}, */