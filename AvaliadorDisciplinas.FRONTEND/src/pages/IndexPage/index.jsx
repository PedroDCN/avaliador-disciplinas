import React, { useEffect, useState } from 'react';
import styles from './IndexPage.module.css';
import { Routes, Route, useNavigate } from 'react-router-dom';
import CadeiraIcon from '../../assets/icons/chair_icon.svg';
import UserImage from '../../assets/icons/user_anonimous.svg';
import NavMenu from '../../components/NavMenu';
import { useAuth } from '../../contexts/AuthContext';
import DisciplinaIndex from '../Disciplina';
import HomePage from '../HomePage';
import CadastrarDisciplina from '../CadastrarDisciplina';
import CadastrarProf from '../CadastrarProfessor';

function IndexPage() {
    const [selectedItem, setSelectedItem] = useState("");
    const { user, loadUser } = useAuth();
    const navigate = useNavigate();

    useEffect(() => {
        function checkTokenInvalid() {
            const tokenInvalid = loadUser();
            if (tokenInvalid) {
                navigate('/');
            }
        }
        checkTokenInvalid();
    }, []);

    function handleLogoClick() {
        setSelectedItem("");
        navigate('/home');
    }

    return (
        <div className={styles.container}>
            <div className={styles.navMenu}>
                <div className={styles.userBox}>
                    <img 
                        src={user === undefined ? UserImage : user.photo} 
                        alt="User Logged" 
                        height={96} 
                        width={96} />
                    <span>{user === undefined ? "Usuário Anônimo" : user.name }</span>
                </div> 
                <div className={styles.menuItems}>
                    <NavMenu 
                        selectedItem={selectedItem} 
                        setSelectedItem={setSelectedItem} 
                    />
                    <div className={styles.logo} onClick={handleLogoClick}>
                        <img src={CadeiraIcon} alt="" />
                        <h1>RASGANDO CADEIRAS</h1>
                    </div>
                </div>
            </div>
            <div className={styles.content}>
                <Routes>
                    <Route path="/home" element={<HomePage />} />
                    <Route path="/avaliar" element={<h1>Avaliar</h1>} />
                    <Route path="/simular" element={<h1>Simular</h1>} />
                    <Route path="/disciplinas" element={<DisciplinaIndex />} />
                    <Route path="/professores" element={<h1>Professores</h1>} />
                    <Route path="/cadastrar_disc" element={<CadastrarDisciplina /> } />
                    <Route path="/cadastrar_prof" element={<CadastrarProf /> } />
                    <Route path="/cadastrar_disc/:id" element={<CadastrarDisciplina /> } />
                    <Route path="/cadastrar_prof/:id" element={<CadastrarProf /> } />
                    <Route path="/denuncias" element={<h1>Denúncias</h1>} />
                </Routes>
            </div>
        </div>
    );
}

export default IndexPage;