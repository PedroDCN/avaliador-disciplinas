import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { AuthContextProvider } from "./contexts/AuthContext";
import DisciplinaIndex from "./pages/Disciplina";
import HomePage from "./pages/HomePage";
import LandingPage from "./pages/LandingPage";
import ProfessorIndex from "./pages/Professor";

function Router() {
  return (
    <BrowserRouter>
      <AuthContextProvider>
        <Routes>
          <Route path="/" element={<LandingPage />} />
          <Route path="/home" element={<HomePage />} />
          <Route path="/disciplinas" element={<DisciplinaIndex />} />
          <Route path="/professores" element={<ProfessorIndex />} />
        </Routes>
      </AuthContextProvider>
    </BrowserRouter>
  );
}

export default Router;
