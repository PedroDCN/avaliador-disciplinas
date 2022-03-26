import { Navigate } from "react-router-dom";
import { useAuth } from "../../contexts/AuthContext";

const ProtectedRoute = ({ children }) => {
    const { user } = useAuth();
  
    if (user === undefined) {
        return <Navigate to="/error" replace />;
    } else if (!user.isAdmin) {
        return <Navigate to="/error" replace />;
    }
  
    return children;
};

export default ProtectedRoute;