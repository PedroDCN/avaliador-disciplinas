import { api } from "./api";

async function createUser(user) {
    return await api.post('/student', user);
}

async function getUserByEmail(email) {
    try {
        return (await api.get(`/students/email/${email}`)).data.email;
    } catch (e) {
        return '';
    }
}

export { createUser, getUserByEmail };