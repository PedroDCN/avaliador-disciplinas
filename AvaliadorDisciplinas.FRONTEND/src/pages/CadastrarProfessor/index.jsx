import styles from './CadastrarProf.module.css';
import colors from '../../styles/colorsConfig.json';
import UserImageProf from '../../assets/icons/user_image_prof.svg';
import Input from '../../components/Input';
import Button from '../../components/Button';
import { createProfessor, getProfessorById } from '../../services/professorService';
import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';

function CadastrarProf() {
    const [professorName,setProfessorName] = useState('');
    const params = useParams();
    const isEditing = params.id !== undefined;

    function handleCadastrarButton() {
        const professor = {name: professorName};
        createProfessor(professor).then(() => {
            console.log('professor cadastrado');
            setProfessorName('');
        }).catch(e => {
            console.log(e, 'erro no cadastro');
        });
    }

    function handleSalvarButton() {
        //
    }

    useEffect(() => {
        (async() => {
            if (params.id) {
                const { name } = await getProfessorById(params.id);
                setProfessorName(name);
            } else {
                setProfessorName("");
            }
        })();
    },[params]);

    return (
        <div className={styles.container}>
            <div className={styles.header}>
                <span>{isEditing ? 'Edição' : 'Cadastro'} de Professores</span>
            </div>
            <div className={styles.content}>
                <img
                    src={UserImageProf} 
                    alt="Input for professor" 
                />
                <Input 
                    placeholderText='Nome do professor' 
                    text={professorName} 
                    setText={setProfessorName}
                />
                <Button 
                    buttontitle={`${isEditing ? 'SALVAR' : 'CADASTRAR'}`}
                    backgroundcolor={colors.theme.secondary} 
                    width="12rem"
                    height="3.25rem"
                    color={colors.theme.white}
                    onClick={isEditing ? handleSalvarButton : handleCadastrarButton}
                />
            </div>
        </div>
    );
}

export default CadastrarProf;