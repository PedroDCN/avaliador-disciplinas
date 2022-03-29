import Slider from 'rc-slider';
import styles from './AvaliacaoModal.module.css';
import 'rc-slider/assets/index.css';
import colors from '../../styles/colorsConfig.json';
import Button from '../Button';
import { useState } from 'react';
import { createFeedback } from '../../services/feedbackService';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import {marks, newFeedback} from '../../services/DadosEstaticos'

function AvaliacaoModal({handleClose, show, idStudent, idCourse, idSemester}) {
    const displayClassname = show ? styles.show : styles.hide;
    const [feedback, setFeedback] = useState(newFeedback());

    const notifySucess = (message) => toast.success(message);
    const notifyFailure = (message) => toast.error(message);

    function handleClickOutside(e) {
        const classes = e.target.classList;
        if (classes.contains('outside')) {
            handleClose();
        }
    }

    function handleAvaliarModal() {
        createFeedback({...feedback, idCourse: 8, idSemester: 1, idStudent: 22})
            .then(() => {
                notifySucess("Avaliação enviada com sucesso!");
            }).catch(() => {
                notifyFailure("Erro no envio da avaliação");
            });
    }

    function handleSetFeedbackAttribute(attribute, newValue){
        setFeedback({...feedback, [attribute]: newValue});
    }

    return (
        <div className={`${styles.modal} ${displayClassname} outside`} 
            onClick={handleClickOutside}>
            <div className={styles.container} onClick={()=>{}}>
                <div className={styles.content}>
                    <div className={styles.metrica}>
                        <h2>Carga horária</h2>
                        <Slider
                            onChange={e => {
                                handleSetFeedbackAttribute('workload', e)
                            }}
                            activeDotStyle={{borderColor: 'var(--secondary)'}}
                            trackStyle={{backgroundColor: 'var(--secondary)'}}
                            min={0} 
                            defaultValue={feedback.workload} 
                            max={10}
                            marks={marks} 
                            step={1}
                        />
                    </div>
                    <div className={styles.metrica}>
                        <h2>Metodologia</h2>
                        <Slider
                            onChange={e => {
                                handleSetFeedbackAttribute('didactic', e)
                            }}
                            activeDotStyle={{borderColor: 'var(--secondary)'}}
                            trackStyle={{backgroundColor: 'var(--secondary)'}}
                            min={0} 
                            defaultValue={feedback.didactic} 
                            max={10}
                            marks={marks} 
                            step={1} 
                        />
                    </div>
                    <div className={styles.metrica}>
                        <h2>Planejamento</h2>
                        <Slider
                            onChange={e => {
                                handleSetFeedbackAttribute('organization', e)
                            }}
                            activeDotStyle={{borderColor: 'var(--secondary)'}}
                            trackStyle={{backgroundColor: 'var(--secondary)'}}
                            min={0} 
                            defaultValue={feedback.organization} 
                            max={10}
                            marks={marks} 
                            step={1} 
                        />
                    </div>
                    <div className={styles.metrica}>
                        <h2>Sistema de avaliação</h2>
                        <Slider
                            onChange={e => {
                                handleSetFeedbackAttribute('evaluationSystem', e)
                            }}
                            activeDotStyle={{borderColor: 'var(--secondary)'}}
                            trackStyle={{backgroundColor: 'var(--secondary)'}}
                            min={0} 
                            defaultValue={feedback.evaluationSystem} 
                            max={10}
                            marks={marks} 
                            step={1} 
                        />
                    </div>
                    <div className={styles.metrica}>
                        <h2>Material didático</h2>
                        <Slider
                            onChange={e => {
                                handleSetFeedbackAttribute('courseware', e)
                            }}
                            activeDotStyle={{borderColor: 'var(--secondary)'}}
                            trackStyle={{backgroundColor: 'var(--secondary)'}}
                            min={0} 
                            defaultValue={feedback.courseware} 
                            max={10}
                            marks={marks} 
                            step={1} 
                        />
                    </div>
                    <div className={styles.modalidade}>
                        <h3>Modalidade da disciplina</h3>
                        <div className={styles.radioButtons}>
                            <input 
                                id='presencial' 
                                type="radio" 
                                name='modality' 
                                value='PRESENTIAL'
                                checked={feedback.modality==='PRESENTIAL'} 
                                onChange={e => 
                                    setFeedback({...feedback, modality: e.target.value})}
                            />
                            <label htmlFor="presencial">Presencial</label>
                            <input 
                                id='remoto' 
                                type="radio" 
                                name='modality' 
                                value='REMOTE'
                                checked={feedback.modality==='REMOTE'} 
                                onChange={e => 
                                    setFeedback({...feedback, modality: e.target.value})}
                            />
                            <label htmlFor="remoto">Remoto</label>
                        </div>
                    </div>
                    <div className={styles.avaliarButton}>
                        <Button 
                            buttontitle="ENVIAR" 
                            backgroundcolor={colors.theme.primary} 
                            width="8rem"
                            color={colors.theme.white} 
                            onClick={() => handleAvaliarModal()}
                        />
                    </div>
                </div>
            </div>
            <ToastContainer 
                position="top-right"
                autoClose={1500}
                hideProgressBar={false}
                closeButton={false}
                newestOnTop={false}
                closeOnClick
                rtl={false}
                pauseOnFocusLoss                    
                draggable
                pauseOnHover={false}
            />
        </div>
    );
}

export default AvaliacaoModal;