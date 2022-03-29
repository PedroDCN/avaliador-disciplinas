import styles from "./ReportModal.module.css";
import colors from "../../styles/colorsConfig.json";
import Button from "../Button";
import UserImage from '../../assets/icons/user_anonimous.svg';

function ReportModal({
    show,
    handleClose,
    handleConfirm,
    confirmText,
    confirmColor,
    modalContent,
    confirmTextColor
}) {
    const displayClassname = show ? styles.show : styles.hide;

    function handleClickOutside(e) {
        const classes = e.target.classList;
        if (classes.contains("outside")) {
          handleClose();
        }
      }
    
    return(
        <div
            className={`${styles.modal} ${displayClassname} outside`}
            onClick={handleClickOutside}
        >
            <div className={styles.container} onClick={() => {}}>
                
                <div className={styles.header}>
                    <div className={styles.image}>
                        <img 
                            src={modalContent.photoStudent ? modalContent.photoStudent : UserImage}
                            height={64}
                            width={64}
                            alt="userPhoto"
                            referrerPolicy="no-referrer"
                        />
                    </div>
                    <div className={styles.userData}>
                        <h3>{modalContent.nameStudent}</h3>
                        <p>Número de denuncias: {modalContent.complaints}</p>
                    </div>
                    <div className={styles.button}>
                        <Button
                            buttontitle={"Apagar comentário"}
                            onClick={handleConfirm}
                            color={confirmTextColor ? confirmTextColor : colors.theme.white}
                            backgroundcolor={
                                confirmColor ? confirmColor : colors.theme["green-500"]
                            }
                        />
                    </div>
                </div>

                <hr className={styles.divisor}/>

                <div className={styles.textArea}>
                    <p>{modalContent.description}</p>
                </div>
            </div>
        </div>
    );
}

export default ReportModal;