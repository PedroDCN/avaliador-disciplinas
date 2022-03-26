import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { useAuth } from "../../contexts/AuthContext";
import TabAvaliacao from "./tabAvaliacao";
import TabComentario from "./tabComentario";
import { changeBanUser, getUserById } from "../../services/userService";
import Button from "../../components/Button";
import ConfirmModal from "../../components/ConfirmModal";
import styles from "./UserDetails.module.css";
import colors from "../../styles/colorsConfig.json";
import anonimous from "../../assets/icons/user_anonimous.svg";
import cancel from "../../assets/icons/cancel.svg";
import check from "../../assets/icons/check.svg";
import { LineWave, Oval } from "react-loader-spinner";

function UserDetails() {
  const { user } = useAuth();
  const params = useParams();

  const [show, setShow] = useState(false);
  const [loading, setLoading] = useState(false);
  const [activeTab, setActiveTab] = useState(1);
  const [userDetails, setUserDetails] = useState();

  const banned = userDetails && userDetails.banned;

  useEffect(() => {
    (async () => {
      if (params.id) {
        setLoading(true);
        setUserDetails(await getUserById(params.id));
        setLoading(false);
      }
    })();
  }, [params.id]);

  const handleCloseModal = () => {
    setShow(false);
  };

  const handleConfirmModal = async () => {
    const response = await changeBanUser(userDetails.id, !userDetails.banned);
    setUserDetails(response.data);
    setShow(false);
  };

  let content = (
    <div className={styles.container}>
      <div className={styles.profile}>
        <div className={styles.imgProfile}>
          <img
            src={
              userDetails && userDetails.picture
                ? userDetails.picture
                : anonimous
            }
            alt="User icon"
          />
        </div>
        <div className={styles.infoProfile}>
          {userDetails ? (
            <>
              <span
                className={`${styles.nomeProfile} ${
                  banned ? styles.banned : ""
                }`}
              >
                {userDetails.name}
              </span>
              <span className={styles.emailProfile}>{userDetails.email}</span>
            </>
          ) : (
            <LineWave color={colors.theme.secondary} />
          )}
        </div>
        <div className={styles.btnProfile}>
          <Button
            buttontitle={banned ? "DESBANIR" : "BANIR"}
            backgroundcolor={colors.theme.secondary}
            color={colors.theme.white}
            onClick={() => setShow(true)}
          />
          <spam>
            Denúncias: {userDetails ? userDetails.reportedComments : 0}
          </spam>
        </div>
      </div>
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
              Comentários
            </li>
          </ul>
          <div className={styles.tabsContent}>
            {loading ? (
              <Oval
                width={40}
                height={40}
                color={colors.theme.terciary}
                secondaryColor={colors.theme.background}
                strokeWidth={5}
              />
            ) : (
              <>
                <TabAvaliacao user={userDetails} show={activeTab === 1} />
                <TabComentario user={userDetails} show={activeTab === 2} />
              </>
            )}
          </div>
        </div>
      </div>
      <ConfirmModal
        show={show}
        handleClose={handleCloseModal}
        handleConfirm={handleConfirmModal}
        icon={banned ? check : cancel}
        message={
          banned
            ? "Quer realmente desbanir o usuário?"
            : "Quer realmente banir o usuário por tempo inderterminado?"
        }
        confirmText={banned ? "DESBANIR" : "BANIR"}
        confirmColor={
          banned ? colors.theme["green-500"] : colors.theme["red-400"]
        }
      />
    </div>
  );
  return <>{user && user.isAdmin && content}</>;
}

export default UserDetails;
