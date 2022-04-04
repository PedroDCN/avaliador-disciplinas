import styles from './ErrorPage.module.css';
import NotFound from '../../assets/icons/not_found.svg';

function ErrorPage() {
    return (
        <div className={styles.container}>
            <div className={styles.errorBox}>
                <img src={NotFound} alt="" />
                <h1>Erro 404 - Página não encontrada</h1>
                <p>Desculpe, esta página não está disponível</p>
                <p>Clique <a href='/home'>aqui</a> para voltar para home</p>
            </div>
        </div >
    );
}

export default ErrorPage;