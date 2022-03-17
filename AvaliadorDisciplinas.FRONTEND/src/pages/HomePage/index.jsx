import React from 'react';
import styles from './HomePage.module.css';
import colors from '../../styles/colorsConfig.json';
import Button from '../../components/Button';
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
                    <span>{user === undefined ? "Usuário Anônimo" : user.name}</span>
                </div>
                <div className={styles.menuItems}>
                    <NavMenu />
                </div>

            </div>
            {false ?
                <div className={styles.content}>
                    {/* Esta div será trocada de acordo com o conteúdo que o usuário escolher */}
                    <div className={styles.welcomeBox}>
                        <img src={WelcomeImage} alt="People rating other people through a window" />
                        <span>Selecione uma das opções ao lado para conferir as disciplinas, professores ou simular o período.</span>
                    </div>
                </div>
                :
                //perfil
                <div className={styles.a}>
                    <div className={styles.b}>
                        <ul className={styles.userBox}>
                            <li><a>Avaliações</a></li>
                            <li><a>Comentários</a></li>
                            <li><a>Perfil</a></li>
                        </ul>
                        <div className={styles.informs}>
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
                                    width="16rem"
                                    color={colors.theme.white}
                                // onClick={handleLoginButton}
                                />
                            </div>
                        </div>

                    </div >
                </div >
                //listagem
                /*<div className={styles.a}>
                    <div className={styles.b}>
                        <ul className={styles.userBox}>
                            <li><a>Avaliações</a></li>
                            <li><a>Comentários</a></li>
                            <li><a>Perfil</a></li>
                        </ul>
                        <div>

                        </div>

                    </div>
                </div>*/


            }
        </div >
    );
}

export default HomePage;