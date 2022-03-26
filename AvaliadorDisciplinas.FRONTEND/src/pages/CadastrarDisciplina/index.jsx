import styles from './CadastrarDisciplina.module.css';
import colors from '../../styles/colorsConfig.json';
import Button from '../../components/Button';
import Input from '../../components/Input';
import { useEffect, useState } from 'react';
import { createDisciplina, getDisciplinaById, updateDisciplina } from '../../services/disciplinaService';
import { useParams } from 'react-router-dom';
import Select from 'react-select';
import { getAllProfessores } from '../../services/professorService';
import { newDisciplina } from '../../services/DadosEstaticos';

import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

const customStyles = {
    control: (provided, state) => ({
      ...provided,
      border: 0,
      color: 'var(--black)',
      fontWeight: '500',
      backgroundColor: 'var(--gray-300)',
      height: '100%',
      width: '100%',
      borderRadius: '0.75rem',
      boxShadow: 0
    }),
    placeholder: (provided,state) => ({
        ...provided,
        color: '#6a6a6a',
        fontWeight: '500'
    })
}

function CadastrarDisciplina() {
    const [disciplina,setDisciplina] = useState(newDisciplina());
    const params = useParams();
    const isEditing = params.id !== undefined;
    const [options, setOptions] = useState([]);

    const notifySucess = (message) => toast.success(message);
    const notifyFailure = (message) => toast.error(message);

    function setAttributeDisciplina(attribute, value) {
        disciplina[attribute] = value;
        setDisciplina({...disciplina});
    }

    function handleCadastrarButton() {
        if (disciplina.code === '' || disciplina.name === '' 
            || disciplina.nameTeacher === '') {
            notifyFailure("Preencha os campos obrigatórios!");
        } else {
            createDisciplina(disciplina).then(() => {
                notifySucess("Disciplina criada com sucesso!");
                setDisciplina(newDisciplina());
            }).catch(e => {
                notifyFailure("Erro no cadastro");
            });
        }
    }

    function handleSalvarButton() {
        updateDisciplina(params.id, disciplina).then(() => {
           notifySucess("Disciplina editada com sucesso!")     
        }).catch(e => {
            notifyFailure("Erro na edição");
        });
    }

    function handleSelectChange(e) {
        setAttributeDisciplina('nameTeacher', e.value);
    }

    function professorValue() {
        let result = null;
        if (isEditing || disciplina.nameTeacher !== '') {
            result = options.find(({value}) => value === disciplina.nameTeacher);
        }
        return result;
    }

    useEffect(() => {
        (async function loadDisciplina() {
            if (params.id) {
                const {name, code, teacher} = await getDisciplinaById(params.id);
                setDisciplina({name,code,nameTeacher: teacher.name});
            } else {
                setDisciplina(newDisciplina());
            }
        })();
        (async function loadProfessors() {
            const profs = await getAllProfessores();
            setOptions(profs.map(prof => ({value: prof.name, label: prof.name})));
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
                        onTextChange={v => setAttributeDisciplina('name',v)}
                        styleName={styles.name}
                    />
                    <Input
                        placeholderText='Código' 
                        text={disciplina.code} 
                        onTextChange={v => setAttributeDisciplina('code',v)}
                        styleName={styles.code}
                    />
                    <Select
                        className={styles.prof}
                        styles={customStyles}
                        value={professorValue()}
                        options={options}
                        onChange={handleSelectChange}
                        placeholder={`Professor`}
                        components={{ DropdownIndicator:() => null, 
                                        IndicatorSeparator:() => null }}
                    />
                </div>
                <Button 
                    buttontitle={`${isEditing ? 'SALVAR' : 'CADASTRAR'}`} 
                    backgroundcolor={colors.theme.secondary} 
                    width="12rem"
                    color={colors.theme.white}
                    onClick={isEditing ? handleSalvarButton : handleCadastrarButton}
                    fontSize={"large"}
                />
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
        </div>
    );
}

export default CadastrarDisciplina;