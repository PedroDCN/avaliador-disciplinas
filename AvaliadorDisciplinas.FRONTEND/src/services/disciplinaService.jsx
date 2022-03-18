import { disciplinasEstaticas } from "./DadosEstaticos";
import { api } from "./api";

async function getAll(atributo, text) {
  return await new Promise((resolve, reject) => {
    setTimeout(() => {
      if (atributo && text) {
        resolve(
          disciplinasEstaticas().filter((disciplina) =>
            disciplina[atributo]
              .toString()
              .toLowerCase()
              .includes(text.toLowerCase())
          )
        );
      } else {
        resolve(disciplinasEstaticas());
      }
    }, 500);
  });
}

async function createDisciplina(disciplina) {
  await api.post('/Course', disciplina);
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
  await api.patch(`/CourseUpdate/${id}`, disciplina);
}

export { getAll, createDisciplina, getDisciplinaById, updateDisciplina };
