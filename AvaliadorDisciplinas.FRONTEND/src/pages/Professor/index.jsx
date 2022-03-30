import React, { useState } from "react";
import styles from "./Professor.module.css";
import { useAuth } from "../../contexts/AuthContext";
import DataList from "../../components/DataList";
import { atributosProfessor } from "../../services/DadosEstaticos";
import { renderItem } from "./itemListagem";
import useStore from "../../store/professorIndexStore";
import Select from "react-select";
import { useNavigate } from "react-router-dom";
import ProfessorModal from '../../components/ProfessorModal';

const customStyles = {
  control: (provided, state) => ({
    ...provided,
    textAlign: "center",
    border: 0,
    fontSize: "1.5rem",
    color: "var(--black)",
    fontWeight: "400",
    backgroundColor: "var(--background-input)",
    height: "100%",
    width: "100%",
    borderRadius: "0.75rem",
    boxShadow: 0,
  }),
  placeholder: (provided, state) => ({
    ...provided,
    textAlign: "center",
    fontSize: "1.5rem",
    color: "var(--gray-700)",
    fontWeight: "500",
  }),
};

function ProfessorIndex() {
  const { user } = useAuth();
  const navigate = useNavigate();

  const [show, setShow] = useState(false);
  const [idProfessor, setIdProfessor] = useState();
  const [text, setText] = useState();
  const [attribute, setAttribute] = useState({ value: "name", label: "Nome" });

  const { loading, data } = useStore(text, attribute.value);

  function handleClickModal(id) {
    setShow(true);
    setIdProfessor(id);
  }

  return (
    <div className={styles.container}>
      <div className={styles.content}>
        <div className={styles.header}>
          <span>Lista de Professores</span>
        </div>

        <div className={styles.filter}>
          <input
            className={styles.input}
            type="text"
            placeholder={
              "Procure por " +
              atributosProfessor()
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
              options={atributosProfessor()}
              onChange={setAttribute}
              placeholder={"Selecione um filtro"}
              isSearchable={false}
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
                handleClickModal: handleClickModal
              })
            }
          />
        </div>
      </div>
      <ProfessorModal 
        idProfessor={idProfessor}
        show={show}
        handleClose={() => setShow(false)}
        isAdmin={user === undefined ? false : user.isAdmin}
      />
    </div>
  );
}

export default ProfessorIndex;
