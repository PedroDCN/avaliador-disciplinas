import styles from './ButtonWithIcon.module.css';

function ButtonWithIcon(props) {
    return (
        <div 
            className={styles.container}
            style={{backgroundColor: props.backgroundcolor}}
            {...props}
        >
            <p>{props.title}</p>
            <img src={props.icon} alt="" height={24} width={24}/>
        </div>
    );
}

export default ButtonWithIcon;