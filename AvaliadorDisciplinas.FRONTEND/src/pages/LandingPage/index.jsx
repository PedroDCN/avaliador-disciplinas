import React, { useEffect, useState } from 'react';
import styles from './LandingPage.module.css';
import colors from '../../styles/colorsConfig.json';

import CadeiraIcon from '../../assets/icons/chair_icon.svg';
import ExploreIcon from '../../assets/icons/compass_icon.svg';
import LoginIcon from '../../assets/icons/login_icon.svg';
import Button from '../../components/Button';
import ButtonWithIcon from '../../components/ButtonWithIcon';
import { useNavigate } from 'react-router-dom';
import { useAuth } from '../../contexts/AuthContext';
import LoginModal from '../../components/LoginModal';
import { checkAuthToken } from '../../utils/tokenUtil';


function LandingPage() {
    const { loginSetUser } = useAuth();
    const navigate = useNavigate();
    const [show,setShow] = useState(false);

    function handleLoginButton() {
        setShow(true);
    }

    function handleCloseLoginModal() {
        setShow(false);
    }

    function handleAnonimousButton() {
        loginSetUser(undefined);
        navigate('/home');
    }

    useEffect(() => {   
        function redirectWhileValidToken() {
            const token = checkAuthToken();
            if (token) {
                navigate('/home');
            }
        }
        redirectWhileValidToken();
    }, []);

    return (
        <>
            <div className={`${styles.container}`}>
                <div className={styles.header}>
                    <div className={styles.logo}>
                        <img src={CadeiraIcon} alt="" />
                        <h1>RASGANDO CADEIRAS</h1>
                    </div>
                    <div className={styles.login}>
                        <ButtonWithIcon 
                            buttontitle="login" 
                            icon={LoginIcon} 
                            backgroundcolor={colors.theme.terciary} 
                            onClick={handleLoginButton}
                            hastitle={"true"}
                        />
                    </div>
                </div>
                <div className={styles.content}>
                    <h1>Compartilhe sua jornada para ajudar quem está começando</h1>
                    <p>Faça avaliações de cadeiras que já pagou. Comente e compartilhe suas experiências. Monte seu conjunto de disciplinas e analise cada cadeira antes de começar o período.</p>
                    <div className={styles.buttons}>
                        <Button 
                            buttontitle="AVALIAR" 
                            backgroundcolor={colors.theme.primary} 
                            width="16rem"
                            color={colors.theme.white} 
                            onClick={handleLoginButton}
                        />
                        <Button 
                            buttontitle="SIMULAR" 
                            backgroundcolor={colors.theme.primary} 
                            width="16rem"
                            color={colors.theme.white} 
                            onClick={handleAnonimousButton}
                        />
                    </div>
                </div>
                <footer>
                    <ButtonWithIcon 
                        buttontitle="EXPLORAR" 
                        icon={ExploreIcon} 
                        color={colors.theme.primary}
                        backgroundcolor={colors.theme.background} 
                        onClick={handleAnonimousButton}
                        hastitle={"true"}
                    />
                </footer>
            </div>
            <LoginModal show={show} handleClose={handleCloseLoginModal} />
        </>
    );
}

export default LandingPage;