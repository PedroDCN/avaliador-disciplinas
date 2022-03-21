import React, { useEffect, useState } from 'react';
import { useAuth } from '../../contexts/AuthContext';
import UserImage from '../../assets/icons/user_anonimous.svg';
import styles from './UserAvaliacoes.module.css';
import NavMenu from '../../components/NavMenu';
import { useNavigate } from 'react-router-dom';
import { renderItem } from "./avaliacaoListagem";
import { getAll } from "../../services/disciplinaService";
import DataList from '../../components/DataList';


function UserAvaliacoes() {
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