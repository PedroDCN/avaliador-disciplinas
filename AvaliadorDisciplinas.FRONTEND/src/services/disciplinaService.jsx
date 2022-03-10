import { disciplinasEstaticas } from "./DadosEstaticos";

export async function getAll(atributo, text) {
  return await new Promise((resolve, reject) => {
    setTimeout(() => {
      if (atributo && text) {
        resolve(
          disciplinasEstaticas().filter((disciplina) =>
            disciplina[atributo]
              .toString()
              .toLowerCase()
              .includes(text.toLowerCase())
          )
        );
      } else {
        resolve(disciplinasEstaticas());
      }
    }, 500);
  });
}
