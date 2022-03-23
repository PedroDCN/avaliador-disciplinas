import { useEffect } from "react";
import styles from "./NavMenu.module.css";

import { useState } from 'react';
import { useAuth } from '../../contexts/AuthContext';
import { useNavigate, useParams } from 'react-router-dom';
import LoginModal from '../../components/LoginModal';
import { getMenuItemsByUserMode, menuItems } from "../../services/DadosEstaticos";

function NavMenu(props) {
  const {selectedItem, setSelectedItem} = props;
  let [listItems, setListItems] = useState([]);
  const [show, setShow] = useState(false);

  const { user, logout } = useAuth();
  const navigate = useNavigate();
  const params = useParams();

  useEffect(() => {
    function setMenuItemByURLRoute() {
      if (new RegExp("[a-z]+[\/][a-z]+[\/][0-9]+").test(params["*"])) {
        setSelectedItem(params["*"].match(/[a-z]+/)[0]+'/cadastro');
      } else {
        setSelectedItem(params["*"]);
      }
    }

    function settingMenuItems() {
      setMenuItemByURLRoute();
      if (user === undefined) {
        setListItems(getMenuItemsByUserMode("anonimous"));
      } else if (user.isAdmin === true) {
        setListItems(getMenuItemsByUserMode("admin"));
      } else {
        setListItems(getMenuItemsByUserMode("user"));
      }
    }
    settingMenuItems();
  }, [user, params]);

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
            const menuItem = menuItems()[item];
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
