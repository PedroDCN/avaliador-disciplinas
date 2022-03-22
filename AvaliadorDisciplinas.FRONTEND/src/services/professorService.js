import axios from "axios";

export async function getAll(atributo, text) {
  return axios.get(`https://avaliador-disciplinas.herokuapp.com/api/teachers`);
}
