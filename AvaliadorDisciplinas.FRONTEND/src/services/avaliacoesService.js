import { api } from "./api";

async function getComentariosUser(id) {
    return await api.get(`/feedback/listByUser/${id}`);
}
export { getComentariosUser };
