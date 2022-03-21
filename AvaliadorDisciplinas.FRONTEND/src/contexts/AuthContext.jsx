import { createContext, useState, useContext } from "react";
import { useNavigate } from "react-router-dom";

const AuthContext = createContext();

export function AuthContextProvider(props) {
    const [user,setUser] = useState(undefined);
    const navigate = useNavigate();

    function onSuccessGoogleLogin(response) {
        const profile = response.profileObj;
        loginSetUser({name: profile.name, photo: profile.imageUrl, isAdmin: false});
        navigate('/home');
    }

    function onFailureGoogleLogin(response) {
        console.log(response, 'A autenticação pelo Google deu falha.');
    }

    function loginSetUser(user) {
        setUser(user);
    }

    function logout() {
        setUser(undefined);
        navigate('/');
    }

    return (
        <AuthContext.Provider 
            value={{user, 
                    loginSetUser, 
                    onSuccessGoogleLogin, 
                    onFailureGoogleLogin,
                    logout
                    }}
        >
            {props.children}
        </AuthContext.Provider>
    );
}

export function useAuth() {
    return useContext(AuthContext);
}