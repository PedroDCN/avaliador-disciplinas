import styles from './ProfessorModal.module.css';
import ProfessorIcon from '../../assets/icons/user_image_prof.svg';
import { useEffect, useState } from 'react';
import DataList from '../DataList';
import { renderItem } from '../../pages/Disciplina/itemListagem';
import { newProfessor } from '../../services/DadosEstaticos';
import { useNavigate } from 'react-router-dom';
import { getProfessorById } from '../../services/professorService';
import { getCourseByNameTeacher } from '../../services/disciplinaService';

function ProfessorModal({show, isAdmin, handleClose, idProfessor}) {
    const displayClassname = show ? styles.show : styles.hide;
    const [loading, setLoading] = useState(false);
    const [professor, setProfessor] = useState(newProfessor());
    const navigate = useNavigate();

    useEffect(() => {
        (async () => {
            if (idProfessor) {
                const data = await getProfessorById(idProfessor);
                const courses = (await getCourseByNameTeacher(data.name));
                const coursesNameTeacher = courses.map(course => {
                    return {
                        id: course.id,
                        name: course.name,
                        grade: course.grade,
                        nameTeacher: data.name
                    }
                });
                setProfessor({...data, courses: coursesNameTeacher});
            }
        })()
    },[show]);

    function gradeTeacher() {
        if (professor.courses.length === 0) {
            return "?";
        }
        const mean = professor.courses
            .map(course => course.grade)
            .reduce((prev, act) => {
                return prev + act;
            }, 0);
        return (mean/(2*professor.courses.length)).toFixed(0);
    }

    function handleClickOutside(e) {
        const classes = e.target.classList;
        if (classes.contains('outside')) {
            handleClose();
        }
    }
    
    return (
        <div className={`${styles.modal} ${displayClassname} outside`} 
            onClick={handleClickOutside}>
            <div className={styles.container} onClick={()=>{}}>
                <div className={styles.header}>
                    <img src={professor.photo === '' ? ProfessorIcon : professor.photo} alt="" />
                    <p>{professor.name}</p>
                    <span>{`${gradeTeacher()}/5`}</span>
                </div>
                <div className={styles.content}>
                    <h1>Disciplinas lecionadas</h1>
                    <div className={styles.disciplinas}>
                        {professor.courses.length > 0 ? 
                            (
                                <DataList 
                                    data={professor.courses} 
                                    loading={loading} 
                                    render={item => renderItem({item, isAdmin, navigate})} 
                                />
                            ) : (
                                <p>Este professor não tem disciplinas cadastradas</p>
                            )
                        }
                    </div>
                </div>
            </div>
        </div>
    );
}

export default ProfessorModal;