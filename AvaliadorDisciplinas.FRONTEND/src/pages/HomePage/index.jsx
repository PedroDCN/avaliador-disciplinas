import React from 'react';
import styles from './HomePage.module.css';

import UserImage from '../../assets/icons/user_anonimous.svg';
import WelcomeImage from '../../assets/icons/people_rating.svg';
import NavMenu from '../../components/NavMenu';
import { useAuth } from '../../contexts/AuthContext';


//MY IMPORTS
import ButtonWithIcon from '../../components/ButtonWithIcon';
import Button from '../../components/Button';
import Header from '../../components/Header';
import LeftIcon from '../../assets/icons/left_arrow_icon.svg';
import colors from '../../styles/colorsConfig.json';

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
            {false ? 
            
            <div className={styles.content}>
                {/* Esta div será trocada de acordo com o conteúdo que o usuário escolher */}
                <div className={styles.welcomeBox}>
                    <img src={WelcomeImage} alt="People rating other people through a window" />
                    <span>Selecione uma das opções ao lado para conferir as disciplinas, professores ou simular o período.</span>
                </div>
            </div> 
            :
            <div className={styles.MYcontent}>
                <Header headerTitle="Página da Disciplina" />

                <div className={styles.MYmain}> {/* Main */}

                    <div className={styles.MYheaderMain}> {/* header's main */}
                        <ButtonWithIcon
                            buttontitle="" 
                            icon={LeftIcon} 
                            boxShadow="none"
                            alignItems="center"
                            hasTitle={false}
                            /* onClick={handleLoginButton} */
                        />
                        <p className={styles.MYclassTitle} >Laboratório de Organização e Arquitetura de Computadores</p>
                        <Button 
                            buttontitle="AVALIAR"
                            backgroundcolor={colors.theme.secondary} 
                            width="10rem"
                            color={colors.theme.white}
                            borderRadius="10rem"
                            /* onClick={handleLoginButton} */
                        />
                    </div>

                    <hr className={styles.MYDivisor}/>

                    <div className={styles.MYCourseContent}> {/* Course Content */}
                        <div className={styles.MYCourseContentDetails}>

                            <select className={styles.MYSelectBar} >
                                <option value="2021.2">2021.2</option>
                                <option value="2021.1">2021.1</option>
                                <option selected value="2020.2">2020.2</option>
                                <option value="2020.1">2020.1</option>
                                <option value="2020.0">2020.0</option>
                            </select>

                            <p className={styles.MYColumnLabel}>Professores do período</p>

                            <div className={styles.MYProfessorContent}>
                                <img 
                                    src='https://lh3.googleusercontent.com/a-/AOh14GjL6s9Fu4UmogiPNFJMJ-sm8OQQ0Zrsd8qd1ts=s288-p-no' 
                                    height={38} 
                                    width={38}
                                    border
                                />
                                <p>Elmar Melcher</p>
                            </div>

                        </div>

                        <div className={styles.MYmainScore}>
                            <p className={styles.MYmainScorePoint}>1/10</p>
                            <p>Média geral</p>
                            <br/>
                            <p className={styles.MYmainScorePoint}>2/10</p>
                            <p>Média no último período</p>
                        </div>

                        <div className={styles.MYdetailedScore}>
                            <p>Metodologia: 2/10</p>
                            <p>Material: 2/10</p>
                            <p>Carga de trabalho: 2/10</p>
                            <p>Planejamento: 2/10</p>
                            <p>Sistema de avaliação: 2/10</p>
                        </div>
                    </div>

                    <hr className={styles.MYDivisor}/>

                    <div className={styles.MYCommentContent}> {/* Comment Content */}
                        <textarea 
                            maxlength="280"
                            type="text"
                            id="comment"
                            placeholder="Deixe seu comentário sobre essa disciplina"
                        />
                        
                        <Button 
                            buttontitle="enviar"
                            backgroundcolor={colors.theme.secondary} 
                            width="6rem"
                            color={colors.theme.white}
                            borderRadius="0rem 0rem 1rem 1rem"
                            className={styles.MYSubmmit}
                            /* onClick={handleLoginButton} */
                        />
                    </div>
                    <div className={styles.MYCommentList}>
                        <div> 
                                1
                        </div>
                        <div> 
                                2
                        </div>
                        <div> 
                                3
                        </div>
                        <div> 
                                4
                        </div>
                        <div> 
                                5
                        </div>
                        <div> 
                                6
                        </div>
                        <div> 
                                7
                        </div>
                        <div> 
                                8
                        </div>
                        <div> 
                                9
                        </div>
                    </div>

                </div>
            </div>
            
            }
        </div>
    );
}

export default HomePage;