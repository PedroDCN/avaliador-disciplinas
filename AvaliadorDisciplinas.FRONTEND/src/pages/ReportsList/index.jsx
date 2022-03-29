import React, { useEffect, useState } from 'react';
import { useNavigate } from "react-router-dom";
import styles from "./ReportsList.module.css";

import { useAuth } from "../../contexts/AuthContext";

import Header from '../../components/Header';
import DataList from "../../components/DataList";
import { renderItem } from "./itemListagem";

import { getCommentWithComplaints } from "../../services/commentService";

function ReportList() {
    const { user } = useAuth();
    const navigate = useNavigate();

    const [loading, setLoading] = useState(false);
    const [reports, setReports] = useState();

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
            console.log(reports);
        }
    }, [reports]);

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
                                        renderItem({
                                            item,
                                            navigate,
                                        })
                                    }
                                />
                        :
                        <span>Não há denuncias</span>
                        }
                    </div>
            </div>
        </div>
    );
}

export default ReportList;