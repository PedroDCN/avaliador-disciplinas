import React, { useEffect, useState } from "react";
import styles from "./Professor.module.css";
import UserImage from "../../assets/icons/user_anonimous.svg";
import NavMenu from "../../components/NavMenu";
import { useAuth } from "../../contexts/AuthContext";
import DataList from "../../components/DataList";
import { getAll } from "../../services/professorService";
import Dropdown from "../../components/Dropdown";
import { atributosProfessor } from "../../services/DadosEstaticos";
import { renderItem } from "./itemListagem";

function ProfessorIndex() {
  const { user } = useAuth();
  const [profs, setProfs] = useState([]);
  const [loading, setLoading] = useState(false);
  const [atributo, setAtributo] = useState();
  const [text, setText] = useState("");

  useEffect(() => {
    async function fetchData() {
      setLoading(true);
      const data = await getAll(atributo, text);
      debugger;
      setProfs(data);
      setLoading(false);
    }

    fetchData();
  }, [atributo, text]);

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
          <span>Lista de Professores</span>
        </div>

        <div className={styles.filter}>
          <input
            type="text"
            id="nome"
            placeholder="Procure por uma professor"
            onChange={(e) => {
              setText(e.target.value);
            }}
          />
          <div className={styles.dropdown}>
            <Dropdown
              data={atributosProfessor()}
              placeholder={"Selecione um filtro"}
              value="value"
              label="text"
              onChange={setAtributo}
            />
          </div>
        </div>

        <div className={styles.indexContent}>
          <DataList data={profs} loading={loading} render={renderItem} />
        </div>
      </div>
    </div>
  );
}

export default ProfessorIndex;
