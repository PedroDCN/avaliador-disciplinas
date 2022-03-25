import { api } from "./api";

async function getAll() {
  return await api.get("/courses");
}

async function createDisciplina(disciplina) {
  await api.post("/admin/course", disciplina);
}

async function getDisciplinaById(id) {
  try {
    const response = await api.get(`/course/${id}`);
    return response.data;
  } catch (e) {
    return {};
  }
}

async function updateDisciplina(id, disciplina) {
  await api.patch(`/admin/courseUpdate/${id}`, disciplina);
}

export { getAll, createDisciplina, getDisciplinaById, updateDisciplina };
