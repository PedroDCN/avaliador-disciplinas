import React, { useEffect, useState } from 'react';
import styles from './IndexPage.module.css';
import { Routes, Route, useNavigate } from 'react-router-dom';
import CadeiraIcon from '../../assets/icons/chair_icon.svg';
import UserImage from '../../assets/icons/user_anonimous.svg';
import NavMenu from '../../components/NavMenu';
import { useAuth } from '../../contexts/AuthContext';
import DisciplinaIndex from '../Disciplina';
import ProfessorIndex from '../Professor';
import HomePage from '../HomePage';
import CadastrarDisciplina from '../CadastrarDisciplina';
import CadastrarProf from '../CadastrarProfessor';
import UserPage from '../UserPage';
import UserComentarios from '../UserComentarios';
import UserAvaliacoes from '../UserAvaliacoes';
import LoginModal from '../../components/LoginModal';
import SimularPeriodo from '../SimularPeriodo';
import AdminRoute from '../../components/AdminRoute';
import ErrorPage from '../ErrorPage';
import AuthenticatedRoute from '../../components/AuthenticatedRoute';
import BannedModal from '../../components/BannedModal';
import UserDetails from '../UserDetails';
import CourseProfile from '../CourseProfile';
import ReportsList from '../ReportsList';

import { getUserToken } from '../../utils/tokenUtil';

function IndexPage() {
  const [selectedItem, setSelectedItem] = useState("");
  const { user, loadUser, logout, logged } = useAuth();
  const navigate = useNavigate();
  const [show, setShow] = useState(false);
  const [showBanned, setShowBanned] = useState(false);

  useEffect(() => {
    function checkTokenInvalid() {
      if (user === undefined && !logged) {
        const tokenInvalid = loadUser();
        if (tokenInvalid) {
          navigate("/");
        }
      }
    }

    function checkBanned() {
      const user = getUserToken();
      if (user && user.banned) {
        setShowBanned(true);
      }
    }

    checkTokenInvalid();
    checkBanned();
  }, [navigate, user, loadUser, logged]);

  function handleLogoClick() {
    setSelectedItem("");
    navigate("/home");
  }

  function handleUserImageClick() {
    if (user !== undefined) {
      navigate("/user");
    } else {
      setShow(true);
    }
  }

  return (
    <div className={styles.container}>
      <div className={styles.navMenu}>
        <div className={styles.userBox}>
          <img
            src={user === undefined ? UserImage : user.photo}
            alt="User Logged"
            height={96}
            width={96}
            onClick={handleUserImageClick}
            referrerPolicy="no-referrer"
          />
          <span>{user === undefined ? "Usuário Anônimo" : user.name}</span>
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
          <Route path="/simular" element={<SimularPeriodo />} />
          <Route path="/disciplinas" element={<DisciplinaIndex />} />
          <Route path="/professores" element={<ProfessorIndex />} />
          <Route path="/disciplina/:id" element={<CourseProfile />} />
          <Route
            path="/disciplina/cadastro"
            element={
              <AdminRoute>
                <CadastrarDisciplina />
              </AdminRoute>
            }
          />
          <Route 
            path="/professor/cadastro" 
            element={
              <AdminRoute>
                <CadastrarProf />
              </AdminRoute>
            }
          />
          <Route 
            path="/disciplina/edicao/:id" 
            element={
              <AdminRoute>
                <CadastrarDisciplina />
              </AdminRoute>
            }
          />
          <Route 
            path="/professor/edicao/:id" 
            element={
              <AdminRoute>
                <CadastrarProf />
              </AdminRoute>
            }
          />
          <Route
            path="/user" 
            element={
              <AuthenticatedRoute>
                <UserPage />
              </AuthenticatedRoute>
            } 
          />
          <Route
            path="/userAvaliacoes" 
            element={
              <AuthenticatedRoute>
                <UserAvaliacoes />
              </AuthenticatedRoute>
            } 
          />
          <Route
            path="/userComentarios" 
            element={
              <AuthenticatedRoute>
                <UserComentarios />
              </AuthenticatedRoute>
            } 
          />
          <Route 
            path="/adm/user/:id" 
            element={
              <AdminRoute>
                <UserDetails />
              </AdminRoute>
            }
          />
          <Route 
            path="/denuncias"
            element={
              <AdminRoute>
                <ReportsList />
              </AdminRoute>
            }
          />
          <Route path="*" element={<ErrorPage />} />
        </Routes>
      </div>
      <LoginModal show={show} handleClose={() => setShow(false)} />
      <BannedModal 
        show={showBanned}
        handleClose={() => {
          setShowBanned(false);
          logout();
          window.location.reload();
        }}
      />
    </div>
  );
}

export default IndexPage;
