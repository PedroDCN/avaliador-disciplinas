import styles from './Button.module.css';

function Button(props) {
    return (
        <div className={styles.container} style={{
            backgroundColor: props.backgroundcolor,
            color: props.color,
            width: props.width
        }} {...props}>
            <p>
                {props.buttontitle}
            </p>
        </div>
    );
}

export default Button;