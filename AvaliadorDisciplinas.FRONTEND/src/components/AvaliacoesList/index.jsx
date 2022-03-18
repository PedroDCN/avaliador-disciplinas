import styles from "./AvaliacoesList.module.css";

function AvaliacoesList(props) {
    return (
        <div className={styles.container}>
            {props.loading && <>Carregando kkkk</>}
            {!props.loading && (
                <ul>
                    {props.data.map((item, index) => {
                        return <li key={index}>{props.render(item)}</li>;
                    })}
                </ul>
            )}
        </div>
    );
}

export default AvaliacoesList;
