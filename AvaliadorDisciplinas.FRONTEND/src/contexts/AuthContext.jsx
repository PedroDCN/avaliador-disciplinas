import { createContext, useState, useContext } from "react";
import { checkAuthToken, parseAuthToken, removeAuthToken, setAuthToken } from "../utils/tokenUtil";
import { createUser, getUserByEmail } from '../services/userService';
import { checkEmailComputacao } from '../utils/loginUtil';

const AuthContext = createContext();

export function AuthContextProvider(props) {
    const [user,setUser] = useState(undefined);
    const [logged,setLogged] = useState(false);

    function loadUser() {
        const token = checkAuthToken();
        if (token) {
            const { name, picture } = parseAuthToken(token);
            loginSetUser({name, photo:picture, isAdmin: true});
        } else if (!logged || token === undefined) {
            logout();
        }
    }

    async function onSuccessGoogleLogin(response) {
        const {name, email} = response.profileObj;
        let success = false;
        const userAlreadyExists = (await getUserByEmail(email)) !== '';

        if (checkEmailComputacao(email)) {
            if (!userAlreadyExists) {
                createUser({email,name}).then(() => {
                    console.log('user created!');
                }).catch(e => {
                    console.log('error on user created');
                });
            }
            setAuthToken(response.tokenId);
            loadUser();
            success = true;
        }
        return success;
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