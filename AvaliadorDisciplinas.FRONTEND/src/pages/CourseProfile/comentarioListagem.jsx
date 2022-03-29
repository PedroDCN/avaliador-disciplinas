import React, { useState } from "react";
import PointsIcon from '../../assets/icons/three_points_icon.svg';
import styles from "./item.module.css";
import UpIcon from '../../assets/icons/up_arrow_icon.svg';
import DownIcon from '../../assets/icons/down_arrow_icon.svg';
import UserImage from '../../assets/icons/user_anonimous.svg';

import ButtonWithIcon from '../../components/ButtonWithIcon';

export function renderItem({ item }) {
    /* const [feedback, setFeedback] = useState(''); */

    function handleFeedBackButton(value) { 
       /*  if(value === feedback) {
            setFeedback('');
        }  else {
            setFeedback(value);
        }
        console.log(feedback) */
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
                    <h4>{item.nameStudent}</h4> {/* ERA PRA SER NOME */}
                    <p>{item.description}</p>
                    <div className={styles.ReactContainer}>
                        <span>
                            <img 
                                src={UpIcon} 
                                alt={`Up Arrow icon`} 
                                height={20} 
                                width={20}
                                onClick={handleFeedBackButton('like')}
                                />
                            {item.up}
                        </span>
                        <span>
                            <img 
                                src={DownIcon} 
                                alt={`Down Arrow icon`} 
                                height={20} 
                                width={20}
                                onClick={handleFeedBackButton('deslike')}
                            />
                            {item.down}
                        </span>
                    </div>
                </div>
                <ButtonWithIcon
                    buttontitle="" 
                    icon={PointsIcon} 
                    boxshadow="none"
                    alignitems="center"
                    hastitle={false}
                    transparent="true"
                    /* onClick={handleReportButton} */
                />
            </div>
        </div>
    );
}