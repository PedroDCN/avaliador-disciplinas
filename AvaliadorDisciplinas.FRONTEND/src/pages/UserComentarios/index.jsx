import React, { useEffect, useState } from "react";
import styles from "./UserComentarios.module.css";
import { useAuth } from "../../contexts/AuthContext";
import DataList from "../../components/DataList";
import { getAllUser } from "../../services/comentService";
import { renderItem } from "./comentariosListagem";
import { useNavigate } from "react-router-dom";
import {
    deleteComentarioById,
    getComentariosByUser,
} from "../../services/comentariosServide";
import { getDisciplinaById } from "../../services/disciplinaService";
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';


function UserComentarios(props) {
    const { user } = useAuth();
    const [loading, setLoading] = useState(false);
    const [coments, setComents] = useState([]);
    const [response, setResponse] = useState([]);

    const navigate = useNavigate();
    const notifySucess = (message) => toast.success(message);

    useEffect(() => {
        async function fetchData() {
            if (user) {
                setLoading(true);
                const response = (await getComentariosByUser(user.id)).data;
                await Promise.all(
                    response.map(async (item) => {
                        item.disciplina = await getDisciplinaById(item.idCourse);
                        return item;
                    })
                );

                setComents(response);

                setLoading(false);
            }
        }

        fetchData();
    }, [user]);
    const removeComent = async (id) => {
        setLoading(true);

        const response = await deleteComentarioById(id);
        setComents(
            coments.filter((item) => {
                return item.id !== id;
            }));
        notifySucess("comentario apagado com sucesso!");

        setLoading(false);

    };


    return (
        <div className={styles.container}>
            <div className={styles.content}>
                <div className={styles.header}>
                    <ul className={styles.userNav}>
                        <li><span onClick={() =>
                            navigate("/userAvaliacoes")}>Avaliações</span></li>
                        <li className={styles.active}><span onClick={() =>
                            navigate("/userComentarios")}>Comentários</span></li>
                        <li><span onClick={() =>
                            navigate("/user")}>Perfil</span></li>
                    </ul>
                </div>

                <div className={styles.itens}>
                    <DataList data={coments} loading={loading} render={(item) => renderItem(item, removeComent)}
                    />
                </div>
                <div>
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
                    /> </div>
            </div>
        </div>

    );
}

export default UserComentarios;
