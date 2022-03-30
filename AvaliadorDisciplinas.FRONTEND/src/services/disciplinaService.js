import { api } from "./api";

async function getAll() {
  return await api.get("/courses");
}

async function createDisciplina(disciplina) {
  await api.post("/admin/course", disciplina);
}

async function getDisciplinaById(id) {
  try {
    const response = await api.get(`/course/${id}`);
    return response.data;
  } catch (e) {
    return {};
  }
}

async function getAllPeriodos() {
  const response = await api.get("/semesters");
  return response.data;
}

async function getAverageFeedbacksfromCourse(id) {
  const response = await api.get(`/feedback/averageByCourse/${id}`);
  return response.data;
}

async function getAverageByCourseSemester(idSemester, idCourse) {
  const response = await api.get(`/feedback/averageByCourseSemester?idSemester=${idSemester}&idCourse=${idCourse}`);
  return response.data;
}

async function updateDisciplina(id, disciplina) {
  await api.patch(`/admin/courseUpdate/${id}`, disciplina);
}

async function getCourseByNameTeacher(nameTeacher) {
  return (await api.get(`/coursesTeacher/${nameTeacher}`)).data;
}

async function getAllCommentsfromCourse(page, idCourse) {
  const response = await api.get(`/comment/listByCourse/${idCourse}?page=${page}`);
  return response.data;
}

async function createComment(comment){
  await api.post("/comment", comment);
}

export { 
  getAll, createDisciplina, getDisciplinaById, updateDisciplina, 
  getAllPeriodos, getAverageFeedbacksfromCourse, getAverageByCourseSemester, 
  getAllCommentsfromCourse, createComment, getCourseByNameTeacher
};
