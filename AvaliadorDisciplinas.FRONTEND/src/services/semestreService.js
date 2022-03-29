import { api } from "./api";

async function getSemestreById(id) {
  return (await api.get(`/semester/${id}`)).data;
}

export { getSemestreById };
