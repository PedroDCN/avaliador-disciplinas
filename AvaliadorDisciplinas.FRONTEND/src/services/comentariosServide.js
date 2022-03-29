import { api } from "./api";

async function getComentariosById(id) {
  return await api.get(`/comment/${id}`);
}

async function getComentariosByUser(id) {
  return await api.get(`/comment/listByStudent/${id}`);
}

async function deleteComentarioById(id) {
  return await api.delete(`/admin/comment/${id}`);
}

export { getComentariosById, getComentariosByUser, deleteComentarioById };
