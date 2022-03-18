import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { AuthContextProvider } from './contexts/AuthContext';
import IndexPage from './pages/IndexPage';
import LandingPage from './pages/LandingPage';

function Router(){
    return (
        <BrowserRouter>
            <AuthContextProvider>
                <Routes>
                    <Route path="/" element={<LandingPage />} />
                    <Route path="/*" element={<IndexPage />} />
                </Routes>
            </AuthContextProvider>
        </BrowserRouter>
    );
}   

export default Router;
