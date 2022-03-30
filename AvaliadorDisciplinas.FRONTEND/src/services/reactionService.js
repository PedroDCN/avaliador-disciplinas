import { api } from './api';

async function createReaction(reaction) {
    await api.post('/reaction', reaction);
}

export {createReaction};