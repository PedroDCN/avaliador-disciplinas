import React from 'react';
import styles from './LandingPage.module.css';
import colors from '../../styles/colorsConfig.json';

import CadeiraIcon from '../../assets/icons/chair_icon.svg';
import SearchIcon from '../../assets/icons/search_icon.svg';
import LoginIcon from '../../assets/icons/login_icon.svg';
import Button from '../../components/Button';
import ButtonWithIcon from '../../components/ButtonWithIcon';


function LandingPage() {
    return (
        <div className={styles.container}>
            <div className={styles.header}>
                <div className={styles.logo}>
                    <img src={CadeiraIcon} alt="" />
                    <h1>RASGANDO CADEIRAS</h1>
                </div>
                <div className={styles.login}>
                    <ButtonWithIcon 
                        title="login" 
                        icon={LoginIcon} 
                        backgroundcolor={colors.theme.terciary} />
                </div>
            </div>
            <div className={styles.content}>
                <h1>Compartilhe sua jornada para ajudar quem está começando</h1>
                <p>Faça avaliações de cadeiras que já pagou. Comente e compartilhe suas experiências. Monte seu conjunto de disciplinas e analise cada cadeira antes de começar o período.</p>
                <div className={styles.buttons}>
                    <Button 
                        title="AVALIAR" 
                        backgroundcolor={colors.theme.primary} 
                        width="16rem"
                        color={colors.theme.white} />
                    <Button 
                        title="SIMULAR" 
                        backgroundcolor={colors.theme.primary} 
                        width="16rem"
                        color={colors.theme.white} />
                </div>
            </div>
            <footer>
                <ButtonWithIcon 
                    title="EXPLORAR" 
                    icon={SearchIcon} 
                    style={{textDecoration: 'underline'}} />
            </footer>
        </div>
    );
}

export default LandingPage;