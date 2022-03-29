import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import styles from "./ReportsList.module.css";
import colors from "../../styles/colorsConfig.json";

import { useAuth } from "../../contexts/AuthContext";

import Header from '../../components/Header';
import DataList from "../../components/DataList";
import { renderItem } from "./itemListagem";

import { getCommentWithComplaints } from "../../services/commentService";
import ReportModal from "../../components/ReportModal";

function ReportList() {
    const { user } = useAuth();
    const navigate = useNavigate();

    const [show, setShow] = useState(false);
    const [loading, setLoading] = useState(false);
    const [reports, setReports] = useState();
    const [modalContent, setModalContent] = useState({});

    const showModal = async (value) => {
        //console.log(value);
        setModalContent(value);
        setShow(true);
        /* await reportComentario(id, user.id); */
      };

    useEffect(()=> {
        (async function fetchReports() {
            setLoading(true);
            const data = await getCommentWithComplaints();
            setReports(data);
            setLoading(false);
        })();

    }, []);

    useEffect(() => {
        if (reports) {
            //console.log(reports);
        }
    }, [reports]);

    const handleCloseModal = () => {
        setShow(false);
    };

    const handleDeleteModal = async () => {
        /* const response = await changeBanUser(userDetails.id, !userDetails.banned);
        setUserDetails(response.data);
        setShow(false); */
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
            <ReportModal
                show={show}
                handleClose={handleCloseModal}
                handleConfirm={handleDeleteModal}
                confirmText={"Deletar Comentário"}
                confirmColor={colors.theme["red-400"]}
                modalContent={modalContent}
            />
        </div>
    );
}

export default ReportList;