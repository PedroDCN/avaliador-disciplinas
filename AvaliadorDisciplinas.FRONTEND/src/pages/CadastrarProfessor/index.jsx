import styles from './CadastrarProf.module.css';
import colors from '../../styles/colorsConfig.json';
import UserImageProf from '../../assets/icons/user_image_prof.svg';
import Input from '../../components/Input';
import Button from '../../components/Button';
import { createProfessor, getProfessorById, updateProfessor } from '../../services/professorService';
import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';

import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import { newProfessorRegister } from '../../services/DadosEstaticos';

function CadastrarProf() {
    const [professor, setProfessor] = useState(newProfessorRegister());
    const params = useParams();
    const isEditing = params.id !== undefined;

    const notifySucess = (message) => toast.success(message);
    const notifyFailure = (message) => toast.error(message);

    function handleCadastrarButton() {
        createProfessor(professor).then(() => {
            notifySucess("Professor criado com sucesso!");
            setProfessor(newProfessorRegister());
        }).catch(e => {
            notifyFailure("Erro no cadastro");
        });
    }

    function handleSalvarButton() {
        console.log(professor);
        updateProfessor(params.id, professor).then(() => {
            notifySucess("Professor editado com sucesso!");
        }).catch(e => {
            notifyFailure("Erro na edição");
        })
    }

    useEffect(() => {
        (async() => {
            if (params.id) {
                const professor = await getProfessorById(params.id);
                setProfessor(professor);
            } else {
                setProfessor(newProfessorRegister());
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
                    placeholderText='URL da imagem (opcional)' 
                    text={professor.photo} 
                    onTextChange={value => setProfessor({...professor, photo: value})}
                />
                <Input 
                    placeholderText='Nome do professor' 
                    text={professor.name} 
                    onTextChange={value => setProfessor({...professor, name: value})}
                />
                <Button 
                    buttontitle={`${isEditing ? 'SALVAR' : 'CADASTRAR'}`}
                    backgroundcolor={colors.theme.secondary} 
                    width="12rem"
                    height="3.25rem"
                    color={colors.theme.white}
                    onClick={isEditing ? handleSalvarButton : handleCadastrarButton}
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

export default CadastrarProf;