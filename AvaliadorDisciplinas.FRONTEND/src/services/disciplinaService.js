import { api } from "./api";

export async function getAll() {
  return await api.get("/Courses");
}

async function createDisciplina(disciplina) {
  await api.post("/admin/Course", disciplina);
}

async function getDisciplinaById(id) {
  try {
    const response = await api.get(`/Course/${id}`);
    return response.data;
  } catch (e) {
    return {};
  }
}

async function updateDisciplina(id, disciplina) {
  await api.patch(`/admin/CourseUpdate/${id}`, disciplina);
}

export { getAll, createDisciplina, getDisciplinaById, updateDisciplina };
