import styles from './ProfessorModal.module.css';
import ProfessorIcon from '../../assets/icons/user_image_prof.svg';
import { useState } from 'react';
import DataList from '../DataList';
import { RenderItem } from '../../pages/Disciplina/itemListagem';
import { newProfessor } from '../../services/DadosEstaticos';

function ProfessorModal({show, isAdmin, handleClose}) {
    const displayClassname = show ? styles.show : styles.hide;
    const [loading, setLoading] = useState(false);
    const [professor, setProfessor] = useState(newProfessor());

    function handleClickOutside(e) {
        const classes = e.target.classList;
        if (classes.contains('outside')) {
            console.log('outisde');
            handleClose();
        }
    }
    
    return (
        <div className={`${styles.modal} ${displayClassname} outside`} 
            onClick={handleClickOutside}>
            <div className={styles.container} onClick={()=>{}}>
                <div className={styles.header}>
                    <img src={ProfessorIcon} alt="" />
                    <p>{professor.name}</p>
                    <span>{`${professor.profGrade}/5`}</span>
                </div>
                <div className={styles.content}>
                    <h1>Disciplinas lecionadas</h1>
                    <div className={styles.disciplinas}>
                        <DataList 
                            data={professor.courses} 
                            loading={loading} 
                            render={item => RenderItem({item, isAdmin })} 
                        />
                    </div>
                </div>
            </div>
        </div>
    );
}

export default ProfessorModal;