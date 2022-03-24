import { api } from "./api";

async function createUser(user) {
  return await api.post("/user", user);
}

async function getUserByEmail(email) {
  try {
    return (await api.get(`/users/email/${email}`)).data;
  } catch (e) {
    return "";
  }
}

async function getUserById(id) {
  try {
    return (await api.get(`/users/${id}`)).data;
  } catch (e) {
    return "";
  }
}

export { createUser, getUserByEmail, getUserById };
