import React from "react";
import styles from "./Disciplina.module.css";

import UserImage from "../../assets/icons/user_anonimous.svg";
import NavMenu from "../../components/NavMenu";
import { useAuth } from "../../contexts/AuthContext";

function DisciplinaIndex() {
  const { user } = useAuth();

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

        {/* Esta div será trocada de acordo com o conteúdo que o usuário escolher */}
        <div className={styles.indexContent}>
          <span>
            Selecione uma das opções ao lado para conferir as disciplinas,
            professores ou simular o período.
          </span>
        </div>
      </div>
    </div>
  );
}

export default DisciplinaIndex;
