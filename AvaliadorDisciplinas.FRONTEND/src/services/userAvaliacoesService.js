import { api } from "./api";

async function getAllUser(id) {
    return await api.get(`/feedback/listByUser/${id}`);
}

export { getAllUser };
