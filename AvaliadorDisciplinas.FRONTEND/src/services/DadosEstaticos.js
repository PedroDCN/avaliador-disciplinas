// import AvaliarIcon from "../assets/icons/star_icon.svg";
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
    name: "",
    photo: "",
    courses: [],
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
  return process.env.REACT_APP_GOOGLE_AUTH_CLIENT_ID;
}

export function menuItems() {
  return {
    // avaliar: { title: "Avaliar cadeiras", icon: AvaliarIcon },
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
    menuItems = ["disciplinas", "simular", "professores", "logout"];
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

export const marks = {
  0: 0,
  2: 2,
  4: 4,
  6: 6,
  8: 8,
  10: 10
}

export function newFeedback() {
  return {
      "workload": 5,
      "didactic": 5,
      "organization": 5,
      "evaluationSystem": 5,
      "courseware": 5,
      "modality": "PRESENTIAL",
  }
}