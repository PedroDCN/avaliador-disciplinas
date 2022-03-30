import React from "react";
import styles from "./item.module.css";
import PointsIcon from '../../assets/icons/three_points_icon.svg';
import UpIcon from '../../assets/icons/up_arrow_icon.svg';
import DownIcon from '../../assets/icons/down_arrow_icon.svg';
import UserImage from '../../assets/icons/user_anonimous.svg';
import ButtonWithIcon from '../../components/ButtonWithIcon';
import Dropdown from "rc-dropdown";
import Menu, { Item as MenuItem } from "rc-menu";

import { createReaction } from "../../services/reactionService";
export function renderItem({ item, loading, reportComent, updatReaction}) {
    const menu = (
        <Menu selectedKeys={[]} onSelect={() => reportComent(item.id)}>
          <MenuItem>Denunciar comentário</MenuItem>
        </Menu>
      );

    async function handleFeedBackButton(value) { 
        if(!loading){
            createReaction({
                "idComment": item.id,
                "idStudent": item.idStudent,
                "reactionTypeEnum": value
            }).then(() => {
                updatReaction();
            });
        }
    }
  
    return (
        <div className={styles.MYCommentList}>

            <div className={styles.MYCommentListItem}> 
                <img 
                    src= { item.photoStudent ? item.photoStudent : UserImage }
                    height={40} 
                    width={40}
                    alt="User's comment"
                    referrerPolicy="no-referrer"
                />
                <div className={styles.MYCommentTextArea}>
                    <h4>{item.nameStudent}</h4>
                    <p>{item.description}</p>
                    <div className={styles.ReactContainer}>
                        <span>
                            <img 
                                src={UpIcon} 
                                alt={`Up Arrow icon`} 
                                height={20} 
                                width={20}
                                onClick={(e) => handleFeedBackButton('LIKE')}
                                />
                            {item.up}
                        </span>
                        <span>
                            <img 
                                src={DownIcon} 
                                alt={`Down Arrow icon`} 
                                height={20} 
                                width={20}
                                onClick={(e) => handleFeedBackButton('DISLIKE')}
                            />
                            {item.down}
                        </span>
                    </div>
                </div>
                <div className={styles.buttonContainer}>
                    <Dropdown trigger={["click"]} overlay={menu} animation="slide-up">
                        <div>        
                            <ButtonWithIcon
                                buttontitle="" 
                                icon={PointsIcon} 
                                boxshadow="none"
                                alignitems="center"
                                hastitle={false}
                                transparent="true"
                            />
                        </div>
                    </Dropdown>
                </div>
            </div>
        </div>
    );
}