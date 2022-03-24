import React, { useEffect, useState } from "react";
import { useAuth } from "../../contexts/AuthContext";
import styles from "./UserDetails.module.css";
import TabAvaliacao from "./tabAvaliacao";
import TabComentario from "./tabComentario";
import { useParams } from "react-router-dom";
import { getUserById } from "../../services/userService";

function UserDetails() {
  const { user } = useAuth();
  const params = useParams();

  const [loading, setLoading] = useState(false);
  const [activeTab, setActiveTab] = useState(1);
  const [userDetails, setUserDetails] = useState();

  useEffect(() => {
    (async () => {
      if (params.id) {
        setLoading(true);
        setUserDetails(await getUserById(params.id));
        setLoading(false);
      }
    })();
  }, [params.id]);

  let content = (
    <div className={styles.container}>
      <div className={styles.content}>
        <div className={styles.tabs}>
          <ul className={styles.tabsHeader}>
            <li
              className={activeTab === 1 ? styles.active : ""}
              onClick={() => setActiveTab(1)}
            >
              Avaliações
            </li>
            <li
              className={activeTab === 2 ? styles.active : ""}
              onClick={() => setActiveTab(2)}
            >
              Comentarios
            </li>
          </ul>
          <div className={styles.tabsContent}>
            {loading ? (
              <>carregando kkkk</>
            ) : activeTab === 1 ? (
              <TabAvaliacao user={userDetails} />
            ) : (
              <TabComentario user={userDetails} />
            )}
          </div>
        </div>
      </div>
    </div>
  );
  return <>{user && !user.isAdmin && content}</>;
}

export default UserDetails;
