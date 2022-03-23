import React, { useState } from "react";
import styles from "./Disciplina.module.css";
import DataList from "../../components/DataList";
import { atributosDisciplina } from "../../services/DadosEstaticos";
import useStore from "../../store/disciplinaIndexStore";
import { renderItem } from "./itemListagem";
import { useAuth } from "../../contexts/AuthContext";
import Select from "react-select";
import { useNavigate } from "react-router-dom";

const customStyles = {
  control: (provided, state) => ({
    ...provided,
    textAlign: "center",
    border: 0,
    fontSize: "1.5rem",
    color: "#1e1e1e",
    fontWeight: "400",
    backgroundColor: "#e5e5e5",
    height: "100%",
    width: "100%",
    borderRadius: "0.75rem",
    boxShadow: 0,
  }),
  placeholder: (provided, state) => ({
    ...provided,
    textAlign: "center",
    fontSize: "1.5rem",
    color: "#6a6a6a",
    fontWeight: "500",
  }),
};

function DisciplinaIndex() {
  const { user } = useAuth();
  const navigate = useNavigate();

  const [text, setText] = useState();
  const [attribute, setAttribute] = useState({ value: "name", label: "Nome" });

  const { loading, error, data } = useStore(text, attribute.value);

  return (
    <div className={styles.container}>
      <div className={styles.content}>
        <div className={styles.header}>
          <span>Lista de Disciplinas</span>
        </div>
        <div className={styles.filter}>
          <input
            className={styles.input}
            type="text"
            placeholder={
              "Procure por " +
              atributosDisciplina()
                .find((item) => item.value === attribute.value)
                .label.toLowerCase()
            }
            onChange={(e) => {
              setText(e.target.value);
            }}
          />
          <div className={styles.dropdown}>
            <Select
              className={styles.select}
              styles={customStyles}
              value={attribute}
              options={atributosDisciplina()}
              onChange={setAttribute}
              placeholder={"Selecione um filtro"}
            />
          </div>
        </div>
        <div className={styles.indexContent}>
          <DataList
            data={data}
            loading={loading}
            render={(item) =>
              renderItem({
                item,
                isAdmin: user === undefined ? false : user.isAdmin,
                navigate,
              })
            }
          />
        </div>
      </div>
    </div>
  );
}

export default DisciplinaIndex;
