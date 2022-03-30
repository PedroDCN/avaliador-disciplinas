import styles from "./ButtonWithIcon.module.css";

function ButtonWithIcon(props) {
    return (
        <div 
            className={`${styles.container} ${
              props.transparent ? styles.transparent : styles.colored
            }`}
            style={{
                backgroundColor: props.backgroundcolor, 
                color: props.color,
                boxshadow: props.boxShadow,
                justifySelf: props.alignitems,
            }}
            {...props}
        >
            {props.hastitle ? <p>{props.buttontitle}</p> : <></>}
            <img 
                src={props.icon} 
                alt={`${props.title} icon`} 
                height={24} 
                width={24}
            />
        </div>
    );
}

export default ButtonWithIcon;
