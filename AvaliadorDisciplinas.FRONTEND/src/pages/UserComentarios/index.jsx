import DataList from '../../components/DataList';
import React, { useEffect, useState } from 'react';

import colors from '../../styles/colorsConfig.json';
import Button from '../../components/Button';
import { useAuth } from '../../contexts/AuthContext';
import UserImage from '../../assets/icons/user_anonimous.svg';
import styles from './UserComentarios.module.css';
import NavMenu from '../../components/NavMenu';
import { useNavigate } from 'react-router-dom';
import { renderItem } from "../Disciplina/itemListagem";
import { getAll } from "../../services/disciplinaService";


function UserComentarios() {
    const { user } = useAuth();
    const navigate = useNavigate();

    const [disc, setDisc] = useState([]);
    const [loading, setLoading] = useState(false);
    const [atributo, setAtributo] = useState();
    const [text, setText] = useState("");
    useEffect(() => {
        async function fetchData() {
            setLoading(true);
            const data = await getAll(atributo, text);
            setDisc(data);
            setLoading(false);
        }

        fetchData();
    }, [atributo, text]);


    return (
        <>
            <div className={styles.container}>
                <div className={styles.navMenu}>
                    <div className={styles.userBox}>
                        <a href="">
                            <img
                                src={user === undefined ? UserImage : user.photo}
                                alt="User Logged"
                                height={96}
                                width={96} />
                        </a>

                        <span>{user === undefined ? "Usuário Anônimo" : user.name}</span>
                    </div>
                    <div className={styles.menuItems}>
                        <NavMenu />
                    </div>
                    <div className={styles.b}>
                        <ul className={styles.userBox}>
                            <li><a onClick={() =>
                                navigate("/userAvaliacoes")}>Avaliações</a></li>
                            <li><a onClick={() =>
                                navigate("/userComentarios")}>Comentários</a></li>
                            <li><a onClick={() =>
                                navigate("/user")}>Perfil</a></li>
                        </ul>
                        {/* <div className={styles.itens}>

                        </div> */}
                    </div>

                </div>
            </div>


        </>

    )

}

export default UserComentarios;