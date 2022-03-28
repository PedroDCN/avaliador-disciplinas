import { api } from "./api";


async function getAllUser(id) {
    return await api.get(`/comment/listByStudent/${id}`);

}
export { getAllUser };
