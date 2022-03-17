// import DataList from '../../components/DataList';
import { useAuth } from '../../contexts/AuthContext';

function UserPage() {
    const { user } = useAuth();

    return (
        <div className={styles.container}>
            <div className={styles.navMenu}>
                <div className={styles.userBox}>
                    <img
                        src={user === undefined ? UserImage : user.photo}
                        alt="User Logged"
                        height={96}
                        width={96} />
                    <span>{user === undefined ? "Usuário Anônimo" : user.name}</span>
                </div>
                <div className={styles.menuItems}>
                    <NavMenu />
                </div>

            </div>
        </div>
    )

}

export default UserPage();