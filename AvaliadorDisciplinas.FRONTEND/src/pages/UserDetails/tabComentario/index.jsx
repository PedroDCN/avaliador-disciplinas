import React, { useEffect, useState } from "react";
import DataList from "../../../components/DataList";
import { renderItem } from "./itemListagem";
import { useNavigate } from "react-router-dom";
import styles from "./TabComentario.module.css";

const TabComentario = (props) => {
  const navigate = useNavigate();
  const [loading, setLoading] = useState(false);
  const [coments, setComents] = useState([]);

  useEffect(() => {
    (async () => {
      setLoading(true);

      //const response = await getFeedbacksfromUser(props.user.id);
      //await Promise.all(
      //  response.map(async (item) => {
      //    item.disciplina = await getDisciplinaById(item.idCourse);
      //    item.periodo = await getSemestreById(item.idSemester);
      //    return item;
      //  })
      //);

      //setComents(response);
      setLoading(false);
    })();
  }, [props.user]);

  let content = (
    <div className={styles.content}>
      <DataList data={coments} loading={loading} />
    </div>
  );

  return <>{props.show ? content : <></>}</>;
};
export default TabComentario;
