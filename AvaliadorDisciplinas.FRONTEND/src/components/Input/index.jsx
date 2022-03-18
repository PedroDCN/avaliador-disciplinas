import styles from './Input.module.css';

function Input(props) {

    function handleOnChange(event) {
        props.setText(event.target.value);
    }

    return (
        <div className={`${styles.container} ${props.styleName || ''}`} >
            <input 
                type="text" 
                placeholder={props.placeholderText} 
                value={props.text} 
                onChange={handleOnChange}
            />
        </div>
    )
}

export default Input;