import styles from './Header.module.css';

function Header(props) {
    return (
        <div className={styles.container} {...props}>
            <p>
                {props.headerTitle}
            </p>
        </div>
    );
}

export default Header;