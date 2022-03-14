import styles from './ButtonWithIcon.module.css';

function ButtonWithIcon(props) {
    return (
        <div 
            className={styles.container}
            style={{
                backgroundColor: props.backgroundcolor, 
                color: props.color,
                boxShadow: props.boxShadow,
                justifySelf: props.alignItems,
            }}
            {...props}
        >
            {props.hasTitle ? <p>{props.buttontitle}</p> : <></>}
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