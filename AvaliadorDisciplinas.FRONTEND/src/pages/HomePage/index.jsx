import React from 'react';
import styles from './HomePage.module.css';
import WelcomeImage from '../../assets/icons/people_rating.svg';

function HomePage() {
    return (
        <div className={styles.container}>
            <div className={styles.welcomeBox}>
                <img src={WelcomeImage} alt="People rating other people through a window" />
                <span>Selecione uma das opções ao lado para conferir as disciplinas, professores ou simular o período.</span>
            </div>
        </div >
    );
}

export default HomePage;