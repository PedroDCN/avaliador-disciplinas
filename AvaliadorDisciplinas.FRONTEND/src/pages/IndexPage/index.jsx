import React, { useEffect, useState } from 'react';
import styles from './IndexPage.module.css';
import { Routes, Route, useNavigate } from 'react-router-dom';
import CadeiraIcon from '../../assets/icons/chair_icon.svg';
import UserImage from '../../assets/icons/user_anonimous.svg';
import NavMenu from '../../components/NavMenu';
import { useAuth } from '../../contexts/AuthContext';
import DisciplinaIndex from '../Disciplina';
import HomePage from '../HomePage';

function IndexPage() {
    const [selectedItem, setSelectedItem] = useState("");
    const { user, loadUser } = useAuth();
    const navigate = useNavigate();

    useEffect(() => {
        loadUser();
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
                    <Route path="/disciplinas" element={<DisciplinaIndex />} />
                    <Route path="/professores" element={<h1>Professores</h1>} />
                </Routes>
            </div>
        </div>
    );
}

export default IndexPage;