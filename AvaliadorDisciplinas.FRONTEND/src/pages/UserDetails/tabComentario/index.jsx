import React, { useEffect, useState } from "react";
import DataList from "../../../components/DataList";
//import { renderItem } from "./itemListagem";
import { useNavigate } from "react-router-dom";
import styles from "./TabComentario.module.css";

const TabComentario = (props) => {
  const navigate = useNavigate();
  const [loading, setLoading] = useState(false);
  const [coment, setComent] = useState([]);

  return (
    <div className={styles.content}>
      <DataList data={coment} loading={loading} />
    </div>
  );
};
export default TabComentario;
