import { Navigate } from "react-router-dom";
import { getUserToken } from "../../utils/tokenUtil";

const AuthenticatedRoute = ({ children }) => {
    debugger;
    const user = getUserToken();

    return (
        user === undefined ? (
            <Navigate to="/error" replace />
        ) : children
    );
};

export default AuthenticatedRoute;