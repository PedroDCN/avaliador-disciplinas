import React, { useEffect, useState } from "react";
import styles from "./UserComentarios.module.css";
import { useAuth } from "../../contexts/AuthContext";
import DataList from "../../components/DataList";
import { getAllUser } from "../../services/comentService";
import { renderItem } from "./comentariosListagem";
import { useNavigate } from "react-router-dom";

function UserComentarios() {
    const { user } = useAuth();
    const [loading, setLoading] = useState(false);
    const navigate = useNavigate();

    const [disc, setDisc] = useState([]);

    useEffect(() => {
        async function fetchData() {
            if (user) {
                setLoading(true);
                const data = (await getAllUser(user.id)).data;
                setDisc(data);
                setLoading(false);
            }

        }

        fetchData();
    }, [user]);

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
