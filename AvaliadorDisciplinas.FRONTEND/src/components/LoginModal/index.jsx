import styles from './LoginModal.module.css';
import CloseButton from '../../assets/icons/delete_icon.svg';
import GoogleLogin from 'react-google-login';
import { useAuth } from '../../contexts/AuthContext';

// Delete a linha abaixo quando colocar em produção e coloque numa variável de ambiente
const clientId = '89493011611-gevim53h29otjcjuhrljf99hkamlk7rs.apps.googleusercontent.com';

function LoginModal({handleClose, show}) {
    const { onSuccessGoogleLogin, onFailureGoogleLogin } = useAuth();

    const displayClassname = show ? styles.show : styles.hide;

    return (
        <div className={`modal ${displayClassname}`}>
            <div className={styles.container}>
                <div className={styles.header}>
                    <span>Login</span>
                    <button type='button' onClick={handleClose}>
                        <img 
                            src={CloseButton} 
                            alt="Icon for close login modal" 
                            width={16} 
                            height={16}/>
                    </button>    
                </div>
                
                <div className={styles.content}>
                    <p>Faça login com sua conta @ccc para ter acesso completo aos serviços de avaliações e comentários</p>
                    <GoogleLogin 
                        className={styles.googleLoginButton}
                        clientId={clientId}
                        buttonText='Login com Google'
                        onSuccess={onSuccessGoogleLogin}
                        onFailure={onFailureGoogleLogin}
                        cookiePolicy={'single_host_origin'}
                    />
                    <span>Nunca fez login antes? Cadastre-se aqui</span>
                </div>
            </div>
        </div>
    );
}

export default LoginModal;