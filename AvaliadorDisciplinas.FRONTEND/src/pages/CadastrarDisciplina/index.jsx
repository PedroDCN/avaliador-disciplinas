import styles from './CadastrarDisciplina.module.css';
import colors from '../../styles/colorsConfig.json';
import Button from '../../components/Button';
import Input from '../../components/Input';
import { useEffect, useState } from 'react';
import { createDisciplina, getDisciplinaById, updateDisciplina } from '../../services/disciplinaService';
import { useParams } from 'react-router-dom';

const emptyCourse = {
    name: '',
    code: '',
    nameTeacher: ''
};

function CadastrarDisciplina() {
    const [disciplina,setDisciplina] = useState(emptyCourse);
    const params = useParams();
    const isEditing = params.id !== undefined;

    function setAttributeDisciplina(attribute, value) {
        disciplina[attribute] = value;
        setDisciplina({...disciplina});
    }

    function handleCadastrarButton() {
        createDisciplina(disciplina).then(() => {
            console.log('disciplina criada!');
        }).catch(e => {
            console.log(e, 'erro ao cadastrar disciplina');
        }).then(() => setDisciplina(emptyCourse));
    }

    function handleSalvarButton() {
        (async() => {
            await updateDisciplina(params.id, disciplina);
        })();
    }

    useEffect(() => {
        (async() => {
            if (params.id) {
                const {name, code, teacher} = await getDisciplinaById(params.id);
                setDisciplina({...disciplina, name,code,nameTeacher: teacher.name});
            }
        })();
    },[params]);

    return (
        <div className={styles.container}>
            <div className={styles.header}>
                <span>{isEditing ? 'Edição' : 'Cadastro'} de Disciplinas</span>
            </div>
            <div className={styles.content}>
                <div className={styles.inputs}>
                    <Input 
                        placeholderText='Nome da disciplina' 
                        text={disciplina.name} 
                        setText={v => setAttributeDisciplina('name',v)}
                        styleName={styles.name}
                    />
                    <Input
                        placeholderText='Código' 
                        text={disciplina.code} 
                        setText={v => setAttributeDisciplina('code',v)}
                        styleName={styles.code}
                    />
                    <Input 
                        className={styles.professorName}
                        placeholderText='Nome do professor' 
                        text={disciplina.nameTeacher} 
                        setText={v => setAttributeDisciplina('nameTeacher',v)}
                        styleName={styles.prof}
                    />
                    {/* <Input 
                        className={styles.initTime}
                        placeholderText='Período inicial' 
                        text={disciplina.semester} 
                        setText={v => setAttributeDisciplina('semester',v)}
                        styleName={styles.initTime}
                    />
                    <Input 
                        className={styles.endTime}
                        placeholderText='Período final' 
                        text={disciplina.finalSemester}
                        setText={v => setAttributeDisciplina('finalSemester',v)}
                        styleName={styles.endTime}
                    /> */}
                </div>
                <Button 
                    buttontitle={`${isEditing ? 'SALVAR' : 'CADASTRAR'}`} 
                    backgroundcolor={colors.theme.secondary} 
                    width="12rem"
                    color={colors.theme.white}
                    onClick={isEditing ? handleSalvarButton : handleCadastrarButton}
                    fontSize={"large"}
                />
            </div>
        </div>
    );
}

export default CadastrarDisciplina;