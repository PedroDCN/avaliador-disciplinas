import { useEffect, useState } from 'react';
import Select from 'react-select';
import DataList from '../../components/DataList';
import styles from './SimularPeriodo.module.css';
import { renderSimulatedCourse } from './simulatedCourse';
import { getAll } from '../../services/disciplinaService';
import { useNavigate } from 'react-router-dom';
import ProgressBar from '../../components/ProgressBar';
import { getSimulacao } from '../../services/simularPeriodoService';
import { newProgress } from '../../services/DadosEstaticos';

const customStyles = {
    control: (provided, state) => ({
      ...provided,
      border: 0,
      color: 'var(--black)',
      fontWeight: '500',
      backgroundColor: 'var(--background)',
      height: '100%',
      width: '100%',
      borderRadius: '0.75rem',
      boxShadow: 0
    }),
    placeholder: (provided,state) => ({
        ...provided,
        color: 'var(--gray-700)',
        fontWeight: '500'
    })
}

function SimularPeriodo() {
    const [disc, setDisc] = useState([]);
    const [optionsDisc, setOptionsDisc] = useState([]);
    const [selectedDiscs, setSelectedDiscs] = useState([]);
    const [loading, setLoading] = useState(false);
    const navigate = useNavigate();
    const [progress, setProgress] = useState(newProgress());

    useEffect(() => {
        async function fetchData() {
            setLoading(true);
            const {data} = await getAll();
            setDisc(data);
            setOptionsDisc(data.map(disciplina => {
                return {label: disciplina.name, value: disciplina.id};
            }));
            setLoading(false);
          }
      
        (async() => {
        await fetchData();
        })();
    },[]);

    async function requestSimulation(courses) {
        if (courses.length > 0) {
            const { creditos, workload, avaliacao } = 
                await getSimulacao(courses
                    .map(disciplina => disciplina.id));
            setProgress({credits: creditos, difficulty: workload, rating: avaliacao});
        } else {
            setProgress(newProgress());
        }
    }

    function handleSelectChange(e) {
        const newDisc = disc.find(disciplina => disciplina.id === e.value);
        const newOptions = optionsDisc.filter(({value}) => value !== e.value);
        setSelectedDiscs([...selectedDiscs, newDisc]);
        setOptionsDisc(newOptions);

        (async() => {
            await requestSimulation([...selectedDiscs, newDisc]);
        })();
    }

    function onClickDelete(item) {
        const newSelectedDiscs = selectedDiscs.filter(disciplina => {
            return disciplina.id !== item.id;
        });
        setSelectedDiscs(newSelectedDiscs);
        setOptionsDisc([...optionsDisc, {value: item.id, label: item.name}]);

        (async() => {
            await requestSimulation(newSelectedDiscs);
        })();
    }

    return (
        <div className={styles.container}>
            <div className={styles.titleBar}>
                Simular período
            </div>
            <div className={styles.content}>
                <div className={styles.coursesContainer}>
                    <Select
                        className={styles.searchBar}
                        value={null}
                        styles={customStyles}
                        options={optionsDisc}
                        onChange={handleSelectChange}
                        placeholder={`Procure por uma disciplina`}
                        components={{ DropdownIndicator:() => null, 
                                        IndicatorSeparator:() => null }}
                    />
                    <div className={styles.coursesSelected}>
                        <DataList 
                            className={styles.list}
                            data={selectedDiscs}
                            loading={loading} 
                            render={(item) => 
                            renderSimulatedCourse(item,navigate,onClickDelete)} 
                        />
                    </div>
                </div>
                <div className={styles.resultContainer}>
                    <div className={styles.headerResult}>
                        ANÁLISE DO PERÍODO
                    </div>
                    <div className={styles.resultContent}>
                        <div className={styles.metric}>
                            <span>Créditos</span>
                            <ProgressBar progress={progress.credits} />
                        </div>
                        <div className={styles.metric}>
                            <span>Dificuldade</span>
                            <ProgressBar progress={progress.difficulty} />
                        </div>
                        <div className={styles.metric}>
                            <span>Avaliação</span>
                            <ProgressBar progress={progress.rating} />
                        </div>
                    </div>
                </div>
            </div>
        </div >
    );
}

export default SimularPeriodo;