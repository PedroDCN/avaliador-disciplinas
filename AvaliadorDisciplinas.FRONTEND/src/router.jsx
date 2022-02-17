import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { AuthContextProvider } from './contexts/AuthContext';
import HomePage from './pages/HomePage';
import LandingPage from './pages/LandingPage';

function Router(){
    return (
        <BrowserRouter>
            <AuthContextProvider>
                <Routes>
                    <Route path="/" element={<LandingPage />} />
                    <Route path="/home" element={<HomePage />} />
                </Routes>
            </AuthContextProvider>
        </BrowserRouter>
    );
}

export default Router;