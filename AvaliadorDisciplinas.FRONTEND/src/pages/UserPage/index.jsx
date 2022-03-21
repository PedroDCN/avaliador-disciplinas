import React, { useEffect, useState } from 'react';
import colors from '../../styles/colorsConfig.json';
import Button from '../../components/Button';
import { useAuth } from '../../contexts/AuthContext';
import UserImage from '../../assets/icons/user_anonimous.svg';
import styles from './UserPage.module.css';
import NavMenu from '../../components/NavMenu';
import { useNavigate } from 'react-router-dom';
import { getAll } from "../../services/disciplinaService";


function UserPage() {
    const { user } = useAuth();
    const navigate = useNavigate();

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
                        <li><span onClick={() =>
                            navigate("/userAvaliacoes")}>Avaliações</span></li>
                        <li><span onClick={() =>
                            navigate("/userComentarios")}>Comentários</span></li>
                        <li className={styles.active}><span onClick={() =>
                            navigate("/user")}>Perfil</span></li>
                    </ul>
                </div>
                <div className={styles.itens}>

                    <div className={styles.userPhot}>
                        <img
                            src={user === undefined ? UserImage : user.photo}
                            alt="User Logged"
                            height={96}
                            width={96} />
                    </div>

                    <div className={styles.inputs}>
                        <input type="email" placeholder='email@ccc.ufcg.edu.br' disabled />
                        <input type="userName" placeholder='Name Surname' disabled />
                        <input type="nickName" placeholder='nickname' />
                    </div>
                    <div className={styles.buttons}>

                        <Button
                            buttontitle="SALVAR"
                            backgroundcolor={colors.theme.secondary}
                            width="14rem"
                            color={colors.theme.white}
                        // onClick={}
                        />
                    </div>
                </div>
            </div>
        </div>
    );



}

export default UserPage;