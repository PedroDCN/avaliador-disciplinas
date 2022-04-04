import { createContext, useState, useContext } from "react";
import { checkAuthToken, parseAuthToken, removeAuthToken, removeUserToken, setAuthToken, setUserToken } from "../utils/tokenUtil";
import { createUser, getUserByEmail } from '../services/userService';
import { checkEmailComputacao } from '../utils/loginUtil';

const AuthContext = createContext();

export function AuthContextProvider(props) {
    const [user, setUser] = useState(undefined);
    const [logged, setLogged] = useState(false);

    function loadUser() {
        const token = checkAuthToken();
        let tokenInvalid = false;
        if (token !== 'invalid' && token !== undefined) {
            const { name, picture, email } = parseAuthToken(token);
            getUserByEmail(email).then((res) => {
                loginSetUser({name, photo:picture, isAdmin: res.isAdmin, id: res.id, 
                    banned: res.banned});
                setUserToken({name, photo:picture, isAdmin: res.isAdmin, id: res.id, 
                    banned: res.banned});
            });
        } else if (token === 'invalid') {
            logout();
            tokenInvalid = true;
        }
        return tokenInvalid;
    }

    async function onSuccessGoogleLogin(response) {
        const { name, email, imageUrl } = response.profileObj;
        let success = false;
        const userAlreadyExists = (await getUserByEmail(email)) !== '';

        if (checkEmailComputacao(email)) {
            if (!userAlreadyExists) {
                createUser({ email, name, photo: imageUrl }).then(() => {
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

    function loginSetUser(newUser) {
        setUser(newUser);
        setLogged(true);
    }

    function logout() {
        setUser(undefined);
        setLogged(false);
        removeAuthToken();
        removeUserToken();
    }

    return (
        <AuthContext.Provider
            value={{
                user,
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