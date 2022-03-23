import { api } from "./api";

async function getSimulacao(disciplinasIds) {
    return (await api.post('/simulation',disciplinasIds)).data;
}

export { getSimulacao };