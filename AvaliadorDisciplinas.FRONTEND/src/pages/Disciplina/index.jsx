import React, { useState } from "react";
import styles from "./Disciplina.module.css";
import UserImage from "../../assets/icons/user_anonimous.svg";
import NavMenu from "../../components/NavMenu";
import { useAuth } from "../../contexts/AuthContext";
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
      <div className={styles.navMenu}>
        <div className={styles.userBox}>
          <img
            src={user === undefined ? UserImage : user.photo}
            alt="User Logged"
            height={96}
            width={96}
          />
          <span>{user === undefined ? "Usuário Anônimo" : user.name}</span>
        </div>
        <div className={styles.menuItems}>
          <NavMenu />
        </div>
      </div>
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
          <DataList data={data} loading={loading} render={renderItem} />
        </div>
      </div>
    </div>
  );
}

export default DisciplinaIndex;
