import { comentariosEx } from "./DadosComentarios";

export async function getAll(atributo, text) {
    return await new Promise((resolve, reject) => {
        setTimeout(() => {
            if (atributo && text) {
                resolve(
                    comentariosEx().filter((disciplina) =>
                        disciplina[atributo]
                            .toString()
                            .toLowerCase()
                            .includes(text.toLowerCase())
                    )
                );
            } else {
                resolve(comentariosEx());
            }
        }, 500);
    });
}
