import { createContext, useState, useContext } from "react";
import { checkAuthToken, parseAuthToken, removeAuthToken, setAuthToken } from "../utils/tokenUtil";

const AuthContext = createContext();

export function AuthContextProvider(props) {
    const [user,setUser] = useState(undefined);
    const [logged,setLogged] = useState(false);

    function loadUser() {
        const token = checkAuthToken();
        if (token) {
            const { name, picture } = parseAuthToken(token);
            loginSetUser({name, photo:picture, isAdmin: false});
        } else if (!logged || token === undefined) {
            logout();
        }
    }

    function onSuccessGoogleLogin(response) {
        setAuthToken(response.tokenId);
        loadUser();
    }

    function onFailureGoogleLogin(response) {
        console.log(response, 'A autenticação pelo Google deu falha.');
    }

    function loginSetUser(user) {
        setUser(user);
        setLogged(true);
    }

    function logout() {
        setUser(undefined);
        setLogged(false);
        removeAuthToken();
    }

    return (
        <AuthContext.Provider 
            value={{user, 
                    loginSetUser, 
                    onSuccessGoogleLogin, 
                    onFailureGoogleLogin,
                    logout,
                    logged,
                    loadUser,
                    }}
        >
            {props.children}
        </AuthContext.Provider>
    );
}

export function useAuth() {
    return useContext(AuthContext);
}