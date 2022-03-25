import styles from "./ConfirmModal.module.css";
import colors from "../../styles/colorsConfig.json";
import Button from "../Button";

function ConfirmModal({
  show,
  handleClose,
  handleConfirm,
  message,
  cancelText,
  cancelTextColor,
  cancelColor,
  confirmText,
  confirmTextColor,
  confirmColor,
  icon,
}) {
  const displayClassname = show ? styles.show : styles.hide;

  function handleClickOutside(e) {
    const classes = e.target.classList;
    if (classes.contains("outside")) {
      handleClose();
    }
  }

  return (
    <div
      className={`${styles.modal} ${displayClassname} outside`}
      onClick={handleClickOutside}
    >
      <div className={styles.container} onClick={() => {}}>
        <div className={styles.header}>
          <img src={icon} alt={`Modal icon`} height={24} width={24} />
          <span>Tem certeza?</span>
        </div>
        <div className={styles.content}>
          <span>{message}</span>
          <div className={styles.buttons}>
            <Button
              buttontitle={cancelText ? cancelText : "CANCELAR"}
              onClick={handleClose}
              color={cancelTextColor ? cancelTextColor : colors.theme.white}
              backgroundcolor={
                cancelColor ? cancelColor : colors.theme["gray-500"]
              }
            />
            <Button
              buttontitle={confirmText ? confirmText : "CONFIRMAR"}
              onClick={handleConfirm}
              color={confirmTextColor ? confirmTextColor : colors.theme.white}
              backgroundcolor={
                confirmColor ? confirmColor : colors.theme["green-500"]
              }
            />
          </div>
        </div>
      </div>
    </div>
  );
}

export default ConfirmModal;
