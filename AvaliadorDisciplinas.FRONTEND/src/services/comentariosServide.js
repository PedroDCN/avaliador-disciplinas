import { api } from "./api";

async function updateDisciplina(id, page) {
  await api.patch(`/comment/listByStudent/${page}`, id);
}

export { updateDisciplina };
