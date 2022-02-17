import React from 'react';
import styles from './HomePage.module.css';

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
                </div>
            </div>
            <div className={styles.content}>
                {/* Esta div será trocada de acordo com o conteúdo que o usuário escolher */}
                <div className={styles.welcomeBox}>
                    <img src={WelcomeImage} alt="People rating other people through a window" />
                    <span>Selecione uma das opções ao lado para conferir as disciplinas, professores ou simular o período.</span>
                </div>
            </div>
        </div>
    );
}

export default HomePage;