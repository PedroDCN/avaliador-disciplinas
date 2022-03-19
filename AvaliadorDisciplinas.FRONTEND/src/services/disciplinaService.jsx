import axios from "axios";

const baseUrl = "https://avaliador-disciplinas.herokuapp.com/api";

export async function getAll() {
  return await axios.get(`${baseUrl}/Courses`);
}
