import { api } from "./api";

async function createUser(user) {
  return await api.post("/user", user);
}

async function changeBanUser(id, banned) {
  const params = new URLSearchParams([["ban status", banned]]);
  return await api.patch(`/admin/ban/${id}`, params);
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

async function updateNickUser(email, nick) {
  return await api.patch(`user/${email}?nick=${nick}`);

}
async function getUserForNick(id) {
  return await api.get(`/users/${id}`);
}




export { createUser, changeBanUser, getUserByEmail, getUserById, updateNickUser, getUserForNick };
