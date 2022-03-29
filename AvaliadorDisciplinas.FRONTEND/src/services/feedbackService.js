import { api } from "./api";

async function getFeedbacksfromUser(id) {
  return (await api.get(`/feedback/listByUser/${id}`)).data;
}

export { getFeedbacksfromUser };
