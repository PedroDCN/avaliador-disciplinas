<<<<<<< HEAD
import React, { useEffect, useState } from 'react';
import colors from '../../styles/colorsConfig.json';
import Button from '../../components/Button';
import { useAuth } from '../../contexts/AuthContext';
import UserImage from '../../assets/icons/user_anonimous.svg';
import styles from './UserPage.module.css';
import { useNavigate } from 'react-router-dom';
import { getUser, updateNickUser } from '../../services/userAvaliacoesService';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

function UserPage() {
    const { user } = useAuth();
    const [loading, setLoading] = useState(false);
    const navigate = useNavigate();

    const [student, setEstudent] = useState([]);
    const [nick, setNick] = useState([]);

    const notifySucess = (message) => toast.success(message);
    const notifyFailure = (message) => toast.error(message);

    useEffect(() => {
        async function fetchData() {
            if (user) {
                setLoading(true);
                const data = (await getUser(user.id)).data;

                setEstudent(data);
                setNick(data.nick);
                setLoading(false);

            }
        }
        fetchData();
    }, [user]);

    function handleNickButton() {
        updateNickUser(student.email, nick).then(() => {
            notifySucess("NickName editado com sucesso!")
        }).catch(e => {
            notifyFailure("Erro na edição");
        });
    }
    return (
        <div className={styles.container}>
            <div className={styles.content}>
                <div className={styles.header}>
                    <ul className={styles.userNav}>
                        <li><span onClick={() =>
                            navigate("/userAvaliacoes")}>Avaliações</span></li>
                        <li><span onClick={() =>
                            navigate("/userComentarios")}>Comentários</span></li>
                        <li className={styles.active}><span onClick={() =>
                            navigate("/user")}>Perfil</span></li>
                    </ul>
                </div>
                <div className={styles.itens}>

                    <div className={styles.userPhot}>
                        <img
                            src={user === undefined ? UserImage : user.photo}
                            alt="User Logged"
                            height={96}
                            width={96}
                            referrerPolicy="no-referrer"
                        />
                    </div>

                    <div className={styles.inputs}>
                        <input type="email" placeholder={student ? student.email : 'email@ccc.ufcg.edu.br'} disabled />
                        <input type="userName" placeholder={student ? student.name : 'Name Surname'} disabled />
                        <input type="nickName" placeholder={student ? student.nick : 'nickname'}
                            onChange={(e) => { setNick(e.target.value) }} />
                    </div>
                    <div className={styles.buttons}>

                        <Button
                            buttontitle="SALVAR"
                            backgroundcolor={colors.theme.secondary}
                            width="14rem"
                            color={colors.theme.white}
                            onClick={handleNickButton}
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
            </div>
        </div>
    );
}

export default UserPage;
