import React, { useEffect, useState } from "react";
import styles from "./Disciplina.module.css";
import UserImage from "../../assets/icons/user_anonimous.svg";
import NavMenu from "../../components/NavMenu";
import { useAuth } from "../../contexts/AuthContext";
import DataList from "../../components/DataList";
import { getAll } from "../../services/disciplinaService";
import Dropdown from "../../components/Dropdown";
import { atributosDisciplina } from "../../services/DadosEstaticos";
import { renderItem } from "./itemListagem";

function DisciplinaIndex() {
  const { user } = useAuth();

  const [loadedDisc, setLoadedDisc] = useState([]);
  const [filteredDisc, setFilteredDisc] = useState([]);

  const [loading, setLoading] = useState(false);
  const [atributo, setAtributo] = useState();
  const [text, setText] = useState("");

  useEffect(() => {
    async function fetchData() {
      setLoading(true);

      const response = await getAll();
      setLoadedDisc(response.data);
      setFilteredDisc(response.data);

      setLoading(false);
    }

    fetchData();
  }, []);

  useEffect(() => {
    async function filter() {
      setLoading(true);

      if (atributo && text) {
        setFilteredDisc(
          loadedDisc.filter((disciplina) =>
            disciplina[atributo]
              .toString()
              .toLowerCase()
              .includes(text.toLowerCase())
          )
        );
      } else {
        setFilteredDisc(loadedDisc);
      }

      setLoading(false);
    }

    filter();
  }, [atributo, text, loadedDisc]);

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
            placeholder="Procure por uma disciplina"
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
              onChange={setAtributo}
            />
          </div>
        </div>

        <div className={styles.indexContent}>
          <DataList data={filteredDisc} loading={loading} render={renderItem} />
        </div>
      </div>
    </div>
  );
}

export default DisciplinaIndex;
