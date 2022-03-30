import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import styles from "./ReportsList.module.css";
import colors from "../../styles/colorsConfig.json";

import { useAuth } from "../../contexts/AuthContext";

import Header from '../../components/Header';
import DataList from "../../components/DataList";
import { renderItem } from "./itemListagem";

import { getCommentWithComplaints } from "../../services/commentService";
import { deleteComentarioById } from "../../services/comentariosServide";
import ComentarioModal from "../../components/ComentarioModal";

function ReportList() {
    const { user } = useAuth();

    const [show, setShow] = useState(false);
    const [loading, setLoading] = useState(false);
    const [reports, setReports] = useState();
    const [modalContent, setModalContent] = useState({});

    const showModal = async (value) => {
        setModalContent(value);
        setShow(true);
      };

    useEffect(()=> {
        (async function fetchReports() {
            setLoading(true);
            const data = await getCommentWithComplaints();
            setReports(data);
            setLoading(false);
        })();

    }, []);

    const handleCloseModal = () => {
        setShow(false);
    };

    const handleDeleteModal = async () => {
        setLoading(true);
        await deleteComentarioById(modalContent.id);
        const data = await getCommentWithComplaints();
        setReports(data);
        setModalContent({});
        setShow(false);
        setLoading(false);
    };

    return(
        <div className={styles.container}>
            <div className={styles.listContainer}>
                <Header headertitle="Lista de denúncias" />
                    <div className={styles.listContent}>
                        { reports ?
                                <DataList
                                    data={reports}
                                    loading={loading}
                                    render={(item) =>
                                        renderItem({ item, showModal})
                                    }
                                />
                        :
                        <span>Não há denuncias</span>
                        }
                    </div>
            </div>
            <ComentarioModal 
                show={show}
                handleClose={handleCloseModal}
                handleDelete={handleDeleteModal}
                idComentario={modalContent.id}
            />
        </div>
    );
}

export default ReportList;