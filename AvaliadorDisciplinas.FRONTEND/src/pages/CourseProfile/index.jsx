import React, { useEffect, useState } from 'react';

import styles from './CourseProfile.module.css';
import ButtonWithIcon from '../../components/ButtonWithIcon';
import Button from '../../components/Button';
import Header from '../../components/Header';
import LeftIcon from '../../assets/icons/left_arrow_icon.svg';
import UpIcon from '../../assets/icons/up_arrow_icon.svg';
import DownIcon from '../../assets/icons/down_arrow_icon.svg';
import PointsIcon from '../../assets/icons/three_points_icon.svg';

import colors from '../../styles/colorsConfig.json';
import { useParams } from 'react-router-dom';

function CourseProfile() {
    const { id } = useParams();

    useEffect(() => {
        //get medias da diciplina
        //get comentarios
        //get avaliaçoes de cada comentario
        //get periodos


        console.log(id);
    },[]);

    
    return(
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
                                    alt="Professor"
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
                        <div className={styles.MYSubmmit}>
                            <Button 
                                buttontitle="enviar"
                                backgroundcolor={colors.theme.secondary} 
                                width="6rem"
                                color={colors.theme.white}
                                borderRadius="0rem 0rem 1rem 1rem"
                                /* onClick={handleLoginButton} */
                            />
                        </div>
                    </div>
                    <div className={styles.MYCommentList}>
                        
                        <div className={styles.MYCommentListItem}> 
                            <img 
                                src='https://lh3.googleusercontent.com/a-/AOh14GjL6s9Fu4UmogiPNFJMJ-sm8OQQ0Zrsd8qd1ts=s288-p-no' 
                                height={40} 
                                width={40}
                                alt="User's comment"
                            />
                            <div className={styles.MYCommentTextArea}>
                                <h4>Girafa Anônima</h4>
                                <p>É verdade essa fita aí.</p>
                                <div className={styles.ReactContainer}>
                                    <span>
                                        <img 
                                            src={UpIcon} 
                                            alt={`Up Arrow icon`} 
                                            height={20} 
                                            width={20}
                                        />
                                        53
                                    </span>
                                    <span>
                                        <img 
                                            src={DownIcon} 
                                            alt={`Down Arrow icon`} 
                                            height={20} 
                                            width={20}
                                        />
                                        10
                                    </span>
                                </div>
                            </div>
                            <ButtonWithIcon
                                buttontitle="" 
                                icon={PointsIcon} 
                                boxShadow="none"
                                alignItems="center"
                                hasTitle={false}
                                /* onClick={handleLoginButton} */
                            />
                        </div>
                    </div>

                </div>
            </div>
    );
}

export default CourseProfile;