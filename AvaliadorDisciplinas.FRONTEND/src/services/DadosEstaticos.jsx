export function disciplinasEstaticas() {
  return [
    {
      nome: "Laboratorio de Programação 1",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "FUND DE MATEMATICA P/ C.DA COMPUTACAO I",
      periodo: "2021.1e",
      nota: 3.0,
    },
    {
      nome: "TEORIA DOS GRAFOS",
      periodo: "2021.1e",
      nota: 2.8,
    },
    {
      nome: "CALCULO DIFERENCIAL E INTEGRAL I",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "LABORATORIO DE ESTRUTURA DE DADOS",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "ALGORITMOS AVANCADOS I",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "LAB.DE ORG.E ARQUITETURA DE COMPUTADORES",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "SISTEMAS DE INFORMAÇÕES GEOGRÁFICAS",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "PARADIGMAS DE LINGUAGEM DE PROGRAMACAO",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "ORGANIZACAO E ARQUIT. DE COMPUTADORES",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "PROGRAMAÇÃO II",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "INFORMATICA E SOCIEDADE",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "ALGEBRA VETORIAL E GEOMETRIA ANALÍTICA",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "ADMINISTRACAO E EMPREENDEDORISMO",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "TRABALHO DE CONCLUSAO DE CURSO",
      periodo: "2021.1e",
      nota: 4.5,
    },
    {
      nome: "PROGRAMACAO CONCORRENTE",
      periodo: "2021.1e",
      nota: 4.5,
    },
  ];
}

export function professoresEstaticos() {
  return [
    {
      nome: "REINALDO CEZAR DE MORAIS GOMES",
      foto: "https://randomuser.me/api/portraits/med/men/75.jpg",
      disciplinas: ["ADMINISTRACAO DE SISTEMAS"],
    },
    {
      nome: "JOSE LUIZ NETO",
      foto: "https://randomuser.me/api/portraits/med/men/70.jpg",
      disciplinas: ["ALGEBRA LINEAR I"],
    },
    {
      nome: "CLAUDIO DE SOUZA BAPTISTA",
      foto: "https://randomuser.me/api/portraits/med/men/1.jpg",
      disciplinas: ["BANCO DE DADOS I"],
    },
  ];
}

export function atributosProfessor() {
  return [{ value: "nome", text: "Nome" }];
}

export function atributosDisciplina() {
  return [
    { value: "nome", text: "Nome" },
    { value: "nota", text: "Nota" },
    { value: "professor", text: "Professor" },
  ];
}
