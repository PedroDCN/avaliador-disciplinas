import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { AuthContextProvider } from "./contexts/AuthContext";
import HomePage from "./pages/HomePage";
import LandingPage from "./pages/LandingPage";
import UserPage from "./pages/UserPage";
import DisciplinaIndex from "./pages/Disciplina";
import ProfessorIndex from "./pages/Professor";
import UserAvaliacoes from "./pages/UserAvaliacoes";
import UserComentarios from "./pages/UserComentarios";

function Router() {
  return (
    <BrowserRouter>
      <AuthContextProvider>
        <Routes>
          <Route path="/" element={<LandingPage />} />
          <Route path="/home" element={<HomePage />} />
          <Route path="/disciplinas" element={<DisciplinaIndex />} />
          <Route path="/professores" element={<ProfessorIndex />} />
          <Route path="/user" element={<UserPage />} />
          <Route path="/userAvaliacoes" element={<UserAvaliacoes />} />
          <Route path="/userComentarios" element={<UserComentarios />} />
        </Routes>
      </AuthContextProvider>
    </BrowserRouter>
  );
}

export default Router;
