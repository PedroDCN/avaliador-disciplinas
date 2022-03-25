import AvaliarIcon from "../assets/icons/star_icon.svg";
import SimularIcon from "../assets/icons/analysis_icon.svg";
import DisciplinasIcon from "../assets/icons/books_icon.svg";
import ProfessorIcon from "../assets/icons/professor_icon.svg";
import LogoutIcon from "../assets/icons/logout_icon.svg";
import LoginIcon from "../assets/icons/login_menu_icon.svg";
import DenunciasIcon from "../assets/icons/complaint_icon.svg";

export function atributosDisciplina() {
  return [
    { value: "name", label: "Nome" },
    { value: "nameTeacher", label: "Professor" },
  ];
}

export function atributosProfessor() {
  return [{ value: "name", label: "Nome" }];
}

export function newDisciplina() {
  return {
    name: "",
    code: "",
    nameTeacher: "",
  };
}

export function newProfessorRegister() {
  return {
    name: '',
    photo: ''
  }
}

export function newProfessor() {
  return {
    name: "Professor X",
    profGrade: 3.0,
    courses: [
      {
        id: 1,
        nome: "Disciplina 1",
        nota: 2.0,
        periodo: "2020",
      },
      {
        id: 2,
        nome: "Disciplina 2",
        nota: 4.0,
        periodo: "2021",
      },
    ],
  };
}

export function newProgress() {
  return {
      credits: 0.0,
      difficulty: 0.0,
      rating: 0.0
  }
}

export function getGoogleClientId() {
  return "89493011611-gevim53h29otjcjuhrljf99hkamlk7rs.apps.googleusercontent.com";
}

export function menuItems() {
  return {
    avaliar: { title: "Avaliar cadeiras", icon: AvaliarIcon },
    simular: { title: "Simular período", icon: SimularIcon },
    disciplinas: { title: "Disciplinas", icon: DisciplinasIcon },
    professores: { title: "Professores", icon: ProfessorIcon },
    logout: { title: "Logout", icon: LogoutIcon },
    login: { title: "Login", icon: LoginIcon },
    "disciplina/cadastro": {
      title: "Cadastrar disciplina",
      icon: DisciplinasIcon,
    },
    "disciplina/edicao": {
      title: "Cadastrar disciplina",
      icon: DisciplinasIcon,
    },
    "professor/cadastro": { title: "Cadastrar professor", icon: ProfessorIcon },
    denuncias: { title: "Denúncias", icon: DenunciasIcon },
  };
}

export function getMenuItemsByUserMode(mode) {
  let menuItems = [];
  if (mode === "anonimous") {
    menuItems = ["disciplinas", "simular", "professores", "login"];
  } else if (mode === "user") {
    menuItems = ["avaliar", "simular", "disciplinas", "professores", "logout"];
  } else if (mode === "admin") {
    menuItems = [
      "disciplinas",
      "professores",
      "disciplina/cadastro",
      "professor/cadastro",
      "denuncias",
      "logout",
    ];
  }
  return menuItems;
}
