import { api } from './api';

async function createFeedback(feedback) {
    await api.post('/feedback', feedback);
}

export { createFeedback };