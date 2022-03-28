import React, { useEffect, useState } from 'react';
import { useAuth } from '../../contexts/AuthContext';
import styles from './UserAvaliacoes.module.css';
import { useNavigate } from 'react-router-dom';
import { renderItem } from "./avaliacaoListagem";
import { getAllUser } from "../../services/userAvaliacoesService";
import DataList from '../../components/DataList';

function UserAvaliacoes() {
    const { user } = useAuth();
    const [loading, setLoading] = useState(false);
    const navigate = useNavigate();

    const [disc, setDisc] = useState([]);
    const [per, setPer] = useState([]);

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

    // grade: 0
    // id: 10
    // idTeacher: 5
    // name: "Laboratório de programação 2"

    return (
        <div className={styles.container}>
            <div className={styles.content}>
                <div className={styles.header}>
                    <ul className={styles.userNav}>
                        <li className={styles.active}><span onClick={() =>
                            navigate("/userAvaliacoes")}>Avaliações</span></li>
                        <li><span onClick={() =>
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

export default UserAvaliacoes;