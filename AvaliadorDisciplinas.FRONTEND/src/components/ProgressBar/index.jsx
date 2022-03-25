import styles from './ProgressBar.module.css';

function ProgressBar({progress}) {

    let colorProgress = '';

    if (progress >= 0.8) {
        colorProgress = styles.redProgress;
    } else if (progress >= 0.6) {
        colorProgress = styles.orangeProgress;
    } else if (progress >= 0.4) {
        colorProgress = styles.greenProgress;
    } else {
        colorProgress = styles.blueProgress;
    }

    return (
        <div className={styles.container}>
            <div className={styles.full}>
                <div 
                    className={`${styles.progress} ${colorProgress}`}
                    style={{width: `${Math.min(progress*100,100)}%`}}
                >
                    &nbsp;
                </div>
            </div>
        </div>
    );
}

export default ProgressBar;