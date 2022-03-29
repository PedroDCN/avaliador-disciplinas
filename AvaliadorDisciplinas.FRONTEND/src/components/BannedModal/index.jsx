import styles from './BannedModal.module.css';
import BannedGif from '../../assets/icons/ednaldo-gif.mp4';
import Button from '../../components/Button';
import colors from '../../styles/colorsConfig.json';

function BannedModal({show, handleClose}) {
    const displayClassname = show ? styles.show : styles.hide;

    function handleClickOutside(e) {
        const classes = e.target.classList;
        if (classes.contains('outside')) {
            handleClose();
        }
    }
    
    return (
        <div className={`${styles.modal} ${displayClassname} outside`} 
            onClick={handleClickOutside}>
            <div className={styles.container}>
                <div className={styles.content}>
                    <video preload="auto" muted autoPlay={true}>
                        <source src={BannedGif} type="video/mp4" />
                    </video>
                    <h3>Seu usuário foi banido</h3>
                    <Button 
                        buttontitle="VOLTAR" 
                        backgroundcolor={colors.theme.primary} 
                        width="8rem"
                        color={colors.theme.white} 
                        onClick={handleClose}
                    />
                </div>
            </div>
        </div>
    );
}

export default BannedModal;