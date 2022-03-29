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
import { useAuth } from '../../contexts/AuthContext';

import { getAllPeriodos, getDisciplinaById, getAverageFeedbacksfromCourse, getAverageByCourseSemester, getAllCommentsfromCourse, createComment } from "../../services/disciplinaService";
import { getProfessorById } from "../../services/professorService";
import { reportComentario } from "../../services/comentariosServide";

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
    const { user } = useAuth();

    const navigate = useNavigate();
    const [semesterValue, setSemesterValue] = useState({ value: "Período", label: "Periodo" });
    const [semester, setSemester] = useState([]);
    const [course, setCouser] = useState({});
    const [professor, setProfessor] = useState({});
    const [loading, setLoading] = useState(false);
    const [averageFeedback, setAverageFeedbacks] = useState({
        "averageWorkload": 0.0,
        "averageDidactic": 0.0,
        "averageOrganization": 0.0,
        "averageEvaluationSystem": 0.0,
        "averageCourseware": 0.0,
        "averageTotal": 0.0
      });
    const [localComment, setLocalComment] = useState("");
    const [comments, setComments] = useState();
    const [lastAverage, setLastAverage] = useState(0);

    const reportComent = async (id) => {
        await reportComentario(id, user.id);
      };

      const updatReaction = async () => {
        updateComments();
      };
    
    function newComment() {
        return {
            "description": `${localComment}`,
            "idCourse": parseInt(id),
            "idSemester": parseInt(semesterValue),
            "idStudent": parseInt(user.id)
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
            setLoading(true);
            const response = await getAverageByCourseSemester(semesterValue.value, id);
            setAverageFeedbacks(response);


            setLoading(false);
        };

        fetchAverageSemester();
    },[semesterValue]);

    useEffect(() => {
        (async function getLastAverage() {
            const response = await getAverageByCourseSemester(semester[0].value, id);
            setLastAverage(response.averageTotal);
        })();
    },[semester]);

    return(
        <div className={styles.container}>
                <Header headertitle="Página da Disciplina" />

                <div className={styles.content}>

                    <div className={styles.headersContent}>
                        <ButtonWithIcon
                            buttontitle="" 
                            icon={LeftIcon} 
                            boxshadow="none"
                            alignitems="center"
                            hastitle={false}
                            onClick={handleGoBackButton}
                            transparent="true"
                        />
                        <p className={styles.courseName}>{course.name}</p>
                        <Button 
                            buttontitle="AVALIAR"
                            backgroundcolor={colors.theme.secondary} 
                            width="10rem"
                            color={colors.theme.white}
                            borderRadius="10rem"
                            /* onClick={handleFeedBackButton} */
                        />
                    </div>

                    <hr className={styles.divisor}/>

                    <div className={styles.courseContent}>
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
                                    referrerPolicy='no-referrer'
                                />
                                <p>{professor ? professor.name : ""}</p>
                            </div>

                        </div>

                        <div className={styles.MYmainScore}>
                            <p className={styles.MYmainScorePoint}>{averageFeedback.averageTotal.toFixed(1)}/10</p>
                            <p>Média geral</p>
                            <br/>
                            <p className={styles.MYmainScorePoint}>{lastAverage.toFixed(1)}/10</p>
                            <p>Média no último período</p>
                        </div>
                        
                        <div className={styles.MYdetailedScore}>
                            <p>Didática: {averageFeedback.averageDidactic.toFixed(1)} /10</p>
                            <p>Material: {averageFeedback.averageCourseware.toFixed(1)} /10</p>
                            <p>Carga de trabalho: {averageFeedback.averageWorkload.toFixed(1)} /10</p>
                            <p>Organização: {averageFeedback.averageOrganization.toFixed(1)} /10</p>
                            <p>Sistema de avaliação: {averageFeedback.averageEvaluationSystem.toFixed(1)} /10</p>
                        </div>
                    </div>

                    <hr className={styles.divisor}/>

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
                                renderItem({ item, loading, reportComent, updatReaction})
                                }
                            />
                        :
                        <></>
                        }
                    </div>

                </div>
            </div>
    );
}

export default CourseProfile;