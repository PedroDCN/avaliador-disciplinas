import styles from "./DataList.module.css";
import colors from '../../styles/colorsConfig.json';
import { Oval } from "react-loader-spinner";

function DataList(props) {

  return (
    <div className={styles.container}>
      {props.loading && 
        <Oval 
          width={40}        
          height={40}
          color={colors.theme.terciary}
          secondaryColor={colors.theme.background}
          strokeWidth={5}
        />
      }
      {!props.loading && (
        <ul>
          {props.data.map((item, index) => {
            return <li key={index}>{props.render(item)}</li>;
          })}
        </ul>
      )}
    </div>
  );
}

export default DataList;
