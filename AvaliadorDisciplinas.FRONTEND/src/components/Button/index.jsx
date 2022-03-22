import styles from './Button.module.css';

function Button(props) {
    return (
        <div className={styles.container} {...props} style={{
            backgroundColor: props.backgroundcolor,
            color: props.color,
            width: props.width,
            height: props.height || 'auto',
            fontSize: props.fontSize || 'larger'
        }}>
            <p className={styles.buttonTitle}>
                {props.buttontitle}
            </p>
        </div>
    );
}

export default Button;