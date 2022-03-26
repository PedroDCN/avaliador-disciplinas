import React, { useEffect, useState } from 'react';

import styles from './CourseProfile.module.css';
import ButtonWithIcon from '../../components/ButtonWithIcon';
import Button from '../../components/Button';
import Header from '../../components/Header';
import DataList from "../../components/DataList";
import LeftIcon from '../../assets/icons/left_arrow_icon.svg';
import UserImage from '../../assets/icons/user_anonimous.svg';
import Select from 'react-select';
import { renderItem } from './comentarioListagem';

import { getAllPeriodos, getDisciplinaById, getAverageFeedbacksfromCourse, getAverageByCourseSemester, getAllCommentsfromCourse, createComment } from "../../services/disciplinaService";
import { getProfessorById } from "../../services/professorService";

import colors from '../../styles/colorsConfig.json';
import { useNavigate, useParams } from 'react-router-dom';

const customStyles = {
    control: (provided ) => ({
      ...provided,
      textAlign: "center",
      border: 0,
      fontSize: "1.5rem",
      fontWeight: "400",
      backgroundColor: "var(--background-input)",
      borderRadius: "0.75rem",
      boxShadow: 0,
    }),
    placeholder: (provided ) => ({
      ...provided,
      textAlign: "center",
      fontSize: "1.5rem",
      color: "var(--gray-700)",
      fontWeight: "500",
    }),
  };

function CourseProfile() {
    const { id } = useParams();

    const navigate = useNavigate();
    const [semesterValue, setSemesterValue] = useState({ value: "Período", label: "Periodo" });
    const [semester, setSemester] = useState([]);
    const [course, setCouser] = useState({});
    const [professor, setProfessor] = useState({});
    const [loading, setLoading] = useState(false);
    const [averageFeedback, setAverageFeedbacks] = useState({});
    const [feedbackSemester, setFeedbackSemester] = useState({});
    const [localComment, setLocalComment] = useState("");
    const [comments, setComments] = useState();
    const [lastAverage, setLastAverage] = useState();
    
    function newComment() {
        return {
            "description": `${localComment}`,
            "idCourse": parseInt(id),
            "idSemester": parseInt(semesterValue),
            "idStudent": parseInt(13)                   // tem q mudar
        }
    }

    function submitCommentButton() {
        //enviar comentário
        if(localComment !== '') {
            createComment(newComment());
            setLocalComment('');
            updateComments(); 
        }
    }

    function handleGoBackButton() {
        navigate(`/disciplinas`);
    }

    async function updateComments() {
            setLoading(true);
            const response = await getAllCommentsfromCourse(0, id);
            setComments(response);
            setLoading(false);
    }

    useEffect(() => {
        (async function fetchSemester() {
            setLoading(true);
            const data = await getAllPeriodos();
            setSemester(data.map(semester => ({value: semester.id, label: semester.name})));
            setLoading(false);
        })();

        (async function fetchCourse() {
            setLoading(true);
            const couseData = await getDisciplinaById(id);
            const professorData = await getProfessorById(couseData.idTeacher);
            setProfessor(professorData);
            setCouser(couseData);

            setLoading(false);
        })();

        (async function fetchAverage(){
            setLoading(true);
            const response = await getAverageFeedbacksfromCourse(id);
            setAverageFeedbacks(response);
            setLoading(false);
        })();

        (async function fetchComments() {
            updateComments();
        })();

    }, []);

    useEffect(() => {
        async function fetchAverageSemester() {
            if(feedbackSemester.value !== "Período") {
                setLoading(true);
                const response = await getAverageByCourseSemester(semesterValue.value, id);
                setFeedbackSemester(response);
                setLoading(false);
            }
        };

        fetchAverageSemester();
    },[semesterValue]);

    useEffect(() => {
        (async function getLastAverage() {
            if( semester && typeof semester !== 'undefined') {
                console.log('testes')
                const response = await getAverageByCourseSemester(semester[0].value, id);
                setLastAverage(response.averageTotal);
            } else {
                setLastAverage(100000);
            }
        })();
    },[semester]);

    return(
        <div className={styles.container}>
                <Header headerTitle="Página da Disciplina" />

                {loading ? <span>Carregando...</span> // discutir carregamento
                :
                <div className={styles.MYmain}>

                    <div className={styles.MYheaderMain}>
                        <ButtonWithIcon
                            buttontitle="" 
                            icon={LeftIcon} 
                            boxShadow="none"
                            alignItems="center"
                            hasTitle={false}
                            onClick={handleGoBackButton}
                        />
                        <p className={styles.MYclassTitle}>{course.name}</p>
                        <Button 
                            buttontitle="AVALIAR"
                            backgroundcolor={colors.theme.secondary} 
                            width="10rem"
                            color={colors.theme.white}
                            borderRadius="10rem"
                            /* onClick={handleFeedBackButton} */
                        />
                    </div>

                    <hr className={styles.MYDivisor}/>

                    <div className={styles.MYCourseContent}>
                        <div className={styles.MYCourseContentDetails}>

                            <Select
                                className={styles.MYSelectBar}
                                styles={customStyles}
                                value={semesterValue}
                                options={semester}
                                onChange={setSemesterValue}
                                placeholder={"Selecione um período"}
                                isSearchable={false}
                            />

                            <p className={styles.MYColumnLabel}>Professores do período</p>

                            <div className={styles.MYProfessorContent}>
                                <img 
                                    src={professor.photo === '' ? UserImage : professor.photo}
                                    height={38} 
                                    width={38}
                                    alt="Professor"
                                />
                                <p>{professor ? professor.name : ""}</p>
                            </div>

                        </div>

                        <div className={styles.MYmainScore}>
                            <p className={styles.MYmainScorePoint}>{averageFeedback.averageTotal}/10</p>
                            <p>Média geral</p>
                            <br/>
                            <p className={styles.MYmainScorePoint}>{lastAverage}/10</p>
                            <p>Média no último período</p>
                        </div>

                        {semesterValue.value === "Período" ?
                            <div className={styles.MYdetailedScore}>
                                <p>Didática: {averageFeedback ? averageFeedback.averageDidactic : "?"} /10</p>
                                <p>Material: {averageFeedback ? averageFeedback.averageCourseware : "?"} /10</p>
                                <p>Carga de trabalho: {averageFeedback ? averageFeedback.averageWorkload : "?"} /10</p>
                                <p>Organização: {averageFeedback ? averageFeedback.averageOrganization : "?"} /10</p>
                                <p>Sistema de avaliação: {averageFeedback ? averageFeedback.averageEvaluationSystem : "?"} /10</p>
                            </div>
                        :
                            <div className={styles.MYdetailedScore}>
                                <p>Didática: {feedbackSemester ? feedbackSemester.averageDidactic : "?"} /10</p>
                                <p>Material: {feedbackSemester ? feedbackSemester.averageCourseware : "?"} /10</p>
                                <p>Carga de trabalho: {feedbackSemester ? feedbackSemester.averageWorkload : "?"} /10</p>
                                <p>Organização: {feedbackSemester ? feedbackSemester.averageOrganization : "?"} /10</p>
                                <p>Sistema de avaliação: {feedbackSemester ? feedbackSemester.averageEvaluationSystem : "?"} /10</p>
                            </div>
                        }
                    </div>

                    <hr className={styles.MYDivisor}/>

                    <div className={styles.MYCommentContent}>
                        <textarea 
                            maxLength="280"
                            type="text"
                            id="comment"
                            placeholder="Deixe seu comentário sobre essa disciplina"
                            onChange={(e) => {
                                setLocalComment(e.target.value);
                            }}
                        />
                        <div className={styles.MYSubmmit}>
                            <Button 
                                buttontitle="enviar"
                                backgroundcolor={colors.theme.secondary} 
                                width="6rem"
                                color={colors.theme.white}
                                borderRadius="0rem 0rem 1rem 1rem"
                                onClick={submitCommentButton}
                            />
                        </div>
                    </div>
                    <div className={styles.MYCommentList}>
                        {comments ? 
                            <DataList
                                data={comments}
                                loading={loading}
                                render={(item) =>
                                renderItem({ item })
                                }
                            />
                        :
                        <></>
                        }
                    </div>

                </div>}
            </div>
    );
}

export default CourseProfile;