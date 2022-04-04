import styles from './LoginModal.module.css';
import CloseButton from '../../assets/icons/delete_icon.svg';
import GoogleLogin from 'react-google-login';
import { useAuth } from '../../contexts/AuthContext';
import { useNavigate } from 'react-router-dom';
import { getGoogleClientId } from '../../services/DadosEstaticos';
import { ToastContainer, toast } from 'react-toastify';

function LoginModal({handleClose, show}) {
    const { onSuccessGoogleLogin, onFailureGoogleLogin } = useAuth();
    const navigate = useNavigate();

    const displayClassname = show ? styles.show : styles.hide;

    const notifyFailure = (message) => toast.error(message);

    function handleLoginButton(res) {
        onSuccessGoogleLogin(res).then((success) => {
            if (success) {
                navigate('/home');
                handleClose();
            } else {
                notifyFailure("Erro ao fazer login!");
            }
        });
        
    }

    return (
        <div className={`${styles.modal} ${displayClassname}`}>
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
                        clientId={getGoogleClientId()}
                        buttonText='Login com Google'
                        onSuccess={handleLoginButton}
                        onFailure={onFailureGoogleLogin}
                        cookiePolicy={'single_host_origin'}
                    />
                    <span>
                        Nunca fez login antes? Cadastre-se&nbsp;
                        <GoogleLogin
                            clientId={getGoogleClientId()}
                            render={renderProps => (
                                <span 
                                    className={styles.googleSignUpButton}
                                    onClick={renderProps.onClick} 
                                    disabled={renderProps.disabled}>
                                    aqui
                                </span>
                            )}
                            buttonText="aqui"
                            onSuccess={handleLoginButton}
                            onFailure={onFailureGoogleLogin}
                            cookiePolicy={'single_host_origin'}
                        />
                    </span>
                </div>
            </div>
            <ToastContainer
                position="top-right"
                autoClose={3000}
                hideProgressBar={false}
                closeButton={true}
                newestOnTop={false}
                closeOnClick
                rtl={false}
                pauseOnFocusLoss                    
                draggable
                pauseOnHover={false}
            />
        </div>
    );
}

export default LoginModal;