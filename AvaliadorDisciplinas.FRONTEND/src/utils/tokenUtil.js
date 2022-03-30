const TOKEN_KEY = "@RCAuth:token";
const TOKEN_KEY_USER = "@RCAuth:user";

function getAuthToken() {
    return window.localStorage.getItem(TOKEN_KEY);
}

function setAuthToken(token) {
    window.localStorage.setItem(TOKEN_KEY, token);
}

function removeAuthToken() {
    window.localStorage.removeItem(TOKEN_KEY);
}

function checkAuthToken() {
    let token = getAuthToken();
    if (token) {
        const currentTime = new Date().getTime() / 1000;
        const { exp } = parseAuthToken(token);
        if (currentTime >= exp) {
            token = 'invalid';
        }
    } else {
        token = undefined;
    }
    return token;
}

function parseAuthToken(token) {
    const [, payload, ] = token.split(".");
    const parsedPayload = JSON.parse(window.atob(payload));
    return parsedPayload;
}

function getUserToken() {
    const token = window.localStorage.getItem(TOKEN_KEY_USER);
    if (token) {
        return JSON.parse(token);
    }
    return undefined;
}

function setUserToken(user) {
    window.localStorage.setItem(TOKEN_KEY_USER, JSON.stringify(user));
}

function removeUserToken() {
    window.localStorage.removeItem(TOKEN_KEY_USER);
}

export { 
    getAuthToken, 
    setAuthToken, 
    removeAuthToken, 
    checkAuthToken, 
    parseAuthToken,
    getUserToken,
    setUserToken,
    removeUserToken
};