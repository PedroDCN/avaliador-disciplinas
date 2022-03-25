import { api } from "./api";

async function createProfessor(professor) {
    await api.post('/admin/teacher', professor);
}

async function getAllProfessores() {
  return (await api.get("/teachers")).data;
}

async function getProfessorById(id) {
  return (await api.get(`/teachers/${id}`)).data;
}

async function getProfessorByName(name) {
  return (await api.get(`/teachers${name}`)).data;
}

async function updateProfessor(id, professor) {
    await api.put(`/admin/teacher${id}`, professor);
}

export {
  createProfessor,
  getAllProfessores,
  getProfessorById,
  getProfessorByName,
  updateProfessor,
};
