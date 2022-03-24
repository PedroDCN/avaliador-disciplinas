import React, { useEffect, useState } from "react";
import DataList from "../../../components/DataList";
import { getFeedbacksfromUser } from "../../../services/feedbackService";
import { renderItem } from "./itemListagem";
import { getDisciplinaById } from "../../../services/disciplinaService";
import { getSemestreById } from "../../../services/semestreService";
import { useNavigate } from "react-router-dom";
import styles from "./TabAvaliacao.module.css";

const TabAvaliacao = (props) => {
  const navigate = useNavigate();
  const [loading, setLoading] = useState(false);
  const [aval, setAval] = useState([]);

  useEffect(() => {
    (async () => {
      setLoading(true);

      const avaliacoes = await getFeedbacksfromUser(props.user.id);
      await Promise.all(
        avaliacoes.map(async (item) => {
          item.disciplina = await getDisciplinaById(item.idCourse);
          item.periodo = await getSemestreById(item.idSemester);
          return item;
        })
      );

      setAval(avaliacoes);
      setLoading(false);
    })();
  }, [props.user.id]);

  return (
    <div className={styles.content}>
      <DataList
        data={aval}
        loading={loading}
        render={(item) =>
          renderItem({
            item,
            navigate,
          })
        }
      />
    </div>
  );
};

export default TabAvaliacao;
