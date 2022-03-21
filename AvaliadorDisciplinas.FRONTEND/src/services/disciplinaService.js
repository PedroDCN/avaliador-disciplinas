import axios from "axios";

const baseUrl = "https://avaliador-disciplinas.herokuapp.com/api";

export async function getAll(atributo, text) {
  const response = await axios.get(`${baseUrl}/Courses`);
  if (atributo && text) {
    return response.data.filter((disciplina) =>
      disciplina[atributo].toString().toLowerCase().includes(text.toLowerCase())
    );
  } else {
    return response.data;
  }
}
