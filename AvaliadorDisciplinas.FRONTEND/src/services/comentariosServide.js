import { api } from "./api";

async function getComentariosByUser(id) {
  return await api.get(`/comment/listByStudent/${id}`);
}

async function deleteComentarioById(id) {
  return await api.delete(`/admin/comment/${id}`);
}

export { getComentariosByUser, deleteComentarioById };
