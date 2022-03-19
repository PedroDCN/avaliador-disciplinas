import React, { useEffect, useState } from "react";
import styles from "./UserComentarios.module.css";
import UserImage from "../../assets/icons/user_anonimous.svg";
import NavMenu from "../../components/NavMenu";
import { useAuth } from "../../contexts/AuthContext";
import DataList from "../../components/DataList";
import { getAll } from "../../services/comentariosService";
import { renderItem } from "./comentariosListagem";
import { useNavigate } from "react-router-dom";

function DisciplinaIndex() {
    const { user } = useAuth();
    const [disc, setDisc] = useState([]);
    const [loading, setLoading] = useState(false);
    const [atributo, setAtributo] = useState();
    const [text, setText] = useState("");
    const navigate = useNavigate();
    useEffect(() => {
        async function fetchData() {
            setLoading(true);
            const data = await getAll(atributo, text);
            setDisc(data);
            setLoading(false);
        }

        fetchData();
    }, [atributo, text]);

    return (
        <div className={styles.container}>
            <div className={styles.navMenu}>
                <div className={styles.userBox}>
                    <img
                        src={user === undefined ? UserImage : user.photo}
                        alt="User Logged"
                        height={96}
                        width={96}
                    />
                    <span>{user === undefined ? "Usuário Anônimo" : user.name}</span>
                </div>
                <div className={styles.menuItems}>
                    <NavMenu />
                </div>
            </div>
            <div className={styles.content}>
                <div className={styles.header}>
                    <ul className={styles.userNav}>
                        <li><a onClick={() =>
                            navigate("/userAvaliacoes")}>Avaliações</a></li>
                        <li className={styles.active}><a onClick={() =>
                            navigate("/userComentarios")}>Comentários</a></li>
                        <li><a onClick={() =>
                            navigate("/user")}>Perfil</a></li>
                    </ul>
                </div>

                <div className={styles.itens}>
                    <DataList data={disc} loading={loading} render={renderItem} />
                </div>
            </div>
        </div>
    );
}

export default DisciplinaIndex;
