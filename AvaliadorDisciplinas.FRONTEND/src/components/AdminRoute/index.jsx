import { Navigate } from "react-router-dom";
import { getUserToken } from "../../utils/tokenUtil";

const AdminRoute = ({ children }) => {
    debugger;
    const user = getUserToken();

    return (
        user === undefined || !user.isAdmin ? (
            <Navigate to="/error" replace />
        ) : children
    );
};

export default AdminRoute;