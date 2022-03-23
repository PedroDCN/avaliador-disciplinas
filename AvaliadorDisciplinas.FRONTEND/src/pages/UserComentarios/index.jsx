import React, { useEffect, useState } from "react";
import styles from "./UserComentarios.module.css";
import { useAuth } from "../../contexts/AuthContext";
import DataList from "../../components/DataList";
import { getAll } from "../../services/comentariosService";
import { renderItem } from "./comentariosListagem";
import { useNavigate } from "react-router-dom";

function UserComentarios() {
    const { user } = useAuth();
    const [disc, setDisc] = useState([]);
    const [loading, setLoading] = useState(false);
    const navigate = useNavigate();
    useEffect(() => {
        async function fetchData() {
            setLoading(true);
            const data = await getAll();
            setDisc(data);
            setLoading(false);
        }

        fetchData();
    }, []);

    return (
        <div className={styles.container}>
            <div className={styles.content}>
                <div className={styles.header}>
                    <ul className={styles.userNav}>
                        <li><span onClick={() =>
                            navigate("/userAvaliacoes")}>Avaliações</span></li>
                        <li className={styles.active}><span onClick={() =>
                            navigate("/userComentarios")}>Comentários</span></li>
                        <li><span onClick={() =>
                            navigate("/user")}>Perfil</span></li>
                    </ul>
                </div>

                <div className={styles.itens}>
                    <DataList data={disc} loading={loading} render={renderItem} />
                </div>
            </div>
        </div>
    );
}

export default UserComentarios;
