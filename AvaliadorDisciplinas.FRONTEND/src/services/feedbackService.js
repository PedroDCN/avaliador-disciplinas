import { api } from './api';

async function createFeedback(feedback) {
    await api.post('/feedback', feedback);
}

async function getFeedbacksfromUser(id) {
  return (await api.get(`/feedback/listByUser/${id}`)).data;
}

export { getFeedbacksfromUser, createFeedback };
