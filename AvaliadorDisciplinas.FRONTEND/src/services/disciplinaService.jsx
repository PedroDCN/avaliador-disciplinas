import { disciplinasEstaticas } from "./DadosEstaticos";

export async function getAll() {
  const fun = await new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(disciplinasEstaticas());
    }, 2000);
  });
  return fun;
}
