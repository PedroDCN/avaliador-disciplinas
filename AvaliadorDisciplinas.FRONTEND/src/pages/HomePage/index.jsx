import React from 'react';
import styles from './HomePage.module.css';
import { Routes, Route } from 'react-router-dom';

import CadeiraIcon from '../../assets/icons/chair_icon.svg';
import UserImage from '../../assets/icons/user_anonimous.svg';
import WelcomeImage from '../../assets/icons/people_rating.svg';
import NavMenu from '../../components/NavMenu';
import { useAuth } from '../../contexts/AuthContext';

function HomePage() {
    const { user } = useAuth();

    return (
        <div className={styles.container}>
            <div className={styles.navMenu}>
                <div className={styles.userBox}>
                    <img 
                        src={user === undefined ? UserImage : user.photo} 
                        alt="User Logged" 
                        height={96} 
                        width={96} />
                    <span>{user === undefined ? "Usuário Anônimo" : user.name }</span>
                </div> 
                <div className={styles.menuItems}>
                    <NavMenu />
                    <div className={styles.logo}>
                        <img src={CadeiraIcon} alt="" />
                        <h1>RASGANDO CADEIRAS</h1>
                    </div>
                </div>
            </div>
            <div className={styles.content}>
                {/* Esta div será trocada de acordo com o conteúdo que o usuário escolher */}
                <div className={styles.welcomeBox}>
                    <img src={WelcomeImage} alt="People rating other people through a window" />
                    <span>Selecione uma das opções ao lado para conferir as disciplinas, professores ou simular o período.</span>
                </div>
                <Routes>
                    <Route path="/disciplinas" element={<h1>Disciplinas</h1>} />
                    <Route path="/professores" element={<h1>Professores</h1>} />
                </Routes>
            </div>
        </div>
    );
}

export default HomePage;