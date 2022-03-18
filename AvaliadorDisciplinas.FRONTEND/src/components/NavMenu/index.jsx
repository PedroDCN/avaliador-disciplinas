import { useEffect } from "react";
import styles from "./NavMenu.module.css";

import AvaliarIcon from '../../assets/icons/star_icon.svg';
import SimularIcon from '../../assets/icons/analysis_icon.svg';
import DisciplinasIcon from '../../assets/icons/books_icon.svg';
import ProfessorIcon from '../../assets/icons/professor_icon.svg';
import LogoutIcon from '../../assets/icons/logout_icon.svg';
import LoginIcon from '../../assets/icons/login_menu_icon.svg';
import DenunciasIcon from '../../assets/icons/complaint_icon.svg';
import { useState } from 'react';
import { useAuth } from '../../contexts/AuthContext';
import { useNavigate } from 'react-router-dom';
import LoginModal from '../../components/LoginModal';

const menuItems = {
  avaliar: { title: "Avaliar cadeiras", icon: AvaliarIcon },
  simular: { title: "Simular período", icon: SimularIcon },
  disciplinas: { title: "Disciplinas", icon: DisciplinasIcon },
  professores: { title: "Professores", icon: ProfessorIcon },
  logout: { title: "Logout", icon: LogoutIcon },
  login: { title: "Login", icon: LoginIcon },
  cadastrar_disc: { title: "Cadastrar disciplina", icon: DisciplinasIcon },
  cadastrar_prof: { title: "Cadastrar professor", icon: ProfessorIcon },
  denuncias: { title: "Denúncias", icon: DenunciasIcon },
};

function NavMenu(props) {
  const {selectedItem, setSelectedItem} = props;
  let [listItems, setListItems] = useState([]);
  const [show, setShow] = useState(false);

  const { user, logout } = useAuth();
  const navigate = useNavigate();

  useEffect(() => {
    function settingMenuItems() {
      if (user === undefined) {
        setListItems(["disciplinas", "simular", "professores", "login"]);
      } else if (user.isAdmin === true) {
        setListItems([
          "disciplinas",
          "professores",
          "cadastrar_disc",
          "cadastrar_prof",
          "denuncias",
          "logout",
        ]);
      } else {
        setListItems([
          "avaliar",
          "simular",
          "disciplinas",
          "professores",
          "logout",
        ]);
      }
    }
    settingMenuItems();
  }, [user]);

  function handleItemMenuClick(item) {
    setSelectedItem(item);   
    if (item === "login") {
        setShow(true);
    } else if (item === "logout") {
        logout();
        navigate('/');
    } else {
        navigate(`/${item}`);
    }
  }

  return (
    <>
      <div className={styles.container}>
        <ul>
          {listItems.map((item, index) => {
            const menuItem = menuItems[item];
            return (
              <li
                key={index}
                className={selectedItem === item ? styles.selected : ""}
                onClick={() => handleItemMenuClick(item)}
              >
                <img
                  src={menuItem.icon}
                  alt={`${menuItem.title} icon`}
                  height={18}
                  width={18}
                />
                <span>{menuItem.title}</span>
              </li>
            );
          })}
        </ul>
      </div>
      <LoginModal show={show} handleClose={() => setShow(false)} />
    </>
  );
}

export default NavMenu;
