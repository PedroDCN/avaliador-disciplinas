import React, { useState } from "react";
import styles from "./Disciplina.module.css";
import DataList from "../../components/DataList";
import Dropdown from "../../components/Dropdown";
import { atributosDisciplina } from "../../services/DadosEstaticos";
import { renderItem } from "./itemListagem";
import useStore from "../../store/disciplinaIndexStore";

function DisciplinaIndex() {
  const { user } = useAuth();
  const [text, setText] = useState();
  const [attribute, setAttribute] = useState("name");

  const { loading, error, data } = useStore(text, attribute);

  return (
    <div className={styles.container}>
      <div className={styles.content}>
        <div className={styles.header}>
          <span>Lista de Disciplinas</span>
        </div>
        <div className={styles.filter}>
          <input
            type="text"
            id="nome"
            placeholder={
              "Procure por " +
              atributosDisciplina()
                .find((item) => item.value === attribute)
                .text.toLowerCase()
            }
            onChange={(e) => {
              setText(e.target.value);
            }}
          />
          <div className={styles.dropdown}>
            <Dropdown
              data={atributosDisciplina()}
              placeholder={"Selecione um filtro"}
              value="value"
              label="text"
              onChange={setAttribute}
              default={"name"}
            />
          </div>
        </div>
        <div className={styles.indexContent}>
          <DataList
            data={data}
            loading={loading}
            render={(item) =>
              RenderItem({
                item,
                isAdmin: user === undefined ? false : user.isAdmin,
              })
            }
          />
        </div>
      </div>
    </div>
  );
}

export default DisciplinaIndex;
