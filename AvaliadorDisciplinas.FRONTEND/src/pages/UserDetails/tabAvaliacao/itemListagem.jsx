import { LineWave } from "react-loader-spinner";
import icon from "../../../assets/icons/external.svg";
import ButtonWithIcon from "../../../components/ButtonWithIcon";
import colors from "../../../styles/colorsConfig.json";
import styles from "./Item.module.css";

export function renderItem({ item, navigate }) {
  function handleClick() {
    navigate(`/disciplina/${item.id}`);
  }

  return (
    <div className={styles.itemContainer}>
      <div className={styles.itemConteudo}>
        <span className={styles.nomeDisciplina}>
          {item.disciplina ? (
            item.disciplina.name
          ) : (
            <LineWave color={colors.theme.secondary} />
          )}
        </span>
        <span className={styles.nomeperiodo}>
          {item.periodo ? (
            "Período: " + item.periodo.name
          ) : (
            <LineWave color={colors.theme.secondary} />
          )}
        </span>
      </div>
      <div className={styles.itemButton}>
        <ButtonWithIcon icon={icon} onClick={handleClick} transparent="true" />
      </div>
    </div>
  );
}
