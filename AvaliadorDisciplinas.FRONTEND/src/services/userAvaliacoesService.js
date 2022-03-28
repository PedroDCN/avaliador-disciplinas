import { api } from "./api";

async function getAllUser(id) {
    return await api.get(`/feedback/listByUser/${id}`);
}

async function getUser(id) {
    return await api.get(`/users/${id}`);
}

async function updateNickUser(email, nick) {
    return await api.patch(`user/${email}?nick=${nick}`);

}
export { getAllUser, getUser, updateNickUser };
