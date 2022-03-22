import axios from 'axios';

const api = axios.create({
    baseURL: "https://avaliador-disciplinas.herokuapp.com/api"
});

export { api };