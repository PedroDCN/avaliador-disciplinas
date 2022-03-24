import { api } from "./api";

async function getAll(atributo, text) {
  const response = await api.get('/courses');
  if (atributo && text) {
    return response.data.filter((disciplina) =>
      disciplina[atributo].toString().toLowerCase().includes(text.toLowerCase())
    );
  } else {
    return response.data;
  }
}

async function createDisciplina(disciplina) {
  await api.post('/admin/Course', disciplina);
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