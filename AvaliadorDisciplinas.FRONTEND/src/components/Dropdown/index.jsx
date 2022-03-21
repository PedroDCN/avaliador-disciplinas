import styles from "./Dropdown.module.css";

function Dropdown(props) {
  function _innerOnChange(e) {
    props.onChange(e.target.value);
  }

  return (
    <div className={styles.container}>
      <select
        defaultValue={props.default ? props.default : "default"}
        onChange={_innerOnChange}
      >
        <option value="default" disabled hidden>
          {props.placeholder}
        </option>
        {props.data.map((item, index) => {
          return (
            <option key={index} value={item[props.value]}>
              {item[props.label]}
            </option>
          );
        })}
      </select>
    </div>
  );
}

export default Dropdown;
