import React, { useEffect, useState } from "react";
import DataList from "../../../components/DataList";
import { renderItem } from "./itemListagem";
import styles from "./TabComentario.module.css";
import {
  deleteComentarioById,
  getComentariosByUser,
} from "../../../services/comentariosServide";
import { getDisciplinaById } from "../../../services/disciplinaService";

const TabComentario = (props) => {
  const [loading, setLoading] = useState(false);
  const [coments, setComents] = useState([]);

  useEffect(() => {
    (async () => {
      setLoading(true);

      const response = (await getComentariosByUser(props.user.id)).data;

      await Promise.all(
        response.map(async (item) => {
          item.disciplina = await getDisciplinaById(item.idCourse);
          return item;
        })
      );

      setComents(response);
      setLoading(false);
    })();
  }, [props.user]);

  const removeComent = async (id) => {
    const response = await deleteComentarioById(id);

    if (response.status === 200) {
      setComents(
        coments.filter((item) => {
          return item.id !== id;
        })
      );
    }
  };

  let content = (
    <div className={styles.content}>
      <DataList
        data={coments}
        loading={loading}
        render={(item) => renderItem(item, removeComent)}
      />
    </div>
  );

  return <>{props.show ? content : <></>}</>;
};
export default TabComentario;
