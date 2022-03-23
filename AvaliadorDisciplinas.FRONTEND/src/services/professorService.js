import { api } from "./api";

async function createProfessor(professor) {
    await api.post('/admin/Teacher', professor);
}

async function getAllProfessores() {
    return (await api.get('/teachers')).data;
}

async function getProfessorById(id) {
    return (await api.get(`/teachers/${id}`)).data;
}

async function getProfessorByName(name) {
    return (await api.get(`/teachers${name}`)).data;
}

async function updateProfessor(id, name) {
    await api.put(`/admin/Teacher/${id}`, name); // essa rota ainda não está ok no backend
}

export { 
    createProfessor, 
    getAllProfessores, 
    getProfessorById, 
    getProfessorByName,
    updateProfessor
};