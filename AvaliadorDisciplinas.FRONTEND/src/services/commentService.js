import { api } from "./api";

async function getCommentWithComplaints() {
    const response = await api.get("/comment/complaints");
    return response.data;
}

export { getCommentWithComplaints };