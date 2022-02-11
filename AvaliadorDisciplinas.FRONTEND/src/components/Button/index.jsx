import styles from './Button.module.css';

function Button(props) {
    return (
        <div className={styles.container} style={{
            backgroundColor: props.backgroundcolor,
            color: props.color,
            width: props.width
        }}>
            <p>
                {props.title}
            </p>
        </div>
    );
}

export default Button;