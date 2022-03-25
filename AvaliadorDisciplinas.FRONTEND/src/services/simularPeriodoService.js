import { api } from "./api";

async function getSimulacao(disciplinasIds) {
    const ids = disciplinasIds.map(id => `courses_id=${id}`).
        join('&');
    return (await api.get(`/simulation?${ids}`)).data;
}

export { getSimulacao };