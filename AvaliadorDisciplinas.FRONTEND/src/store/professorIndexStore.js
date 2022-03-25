import { useEffect, useReducer } from "react";
import { getAllProfessores } from "../services/professorService";

const initialState = {
  loading: false,
  error: null,
  data: [],
  loaded: [],
};

function reducer(state, action) {
  switch (action.type) {
    case "LOADING":
      return { ...state, loading: action.payload };
    case "ERROR":
      return { ...state, error: action.payload };
    case "SUCCESS":
      return { ...state, data: action.payload };
    case "LOADED":
      return { ...state, loaded: action.payload };
    default:
      return state;
  }
}

const useStore = (text, attribute) => {
  const [state, dispatch] = useReducer(reducer, initialState);

  useEffect(() => {
    (async () => {
      dispatch({ type: "LOADING", payload: true });
      dispatch({ type: "ERROR", payload: null });
      dispatch({ type: "LOADED", payload: [] });
      try {
        const response = await getAllProfessores();

        dispatch({
          type: "LOADED",
          payload: response,
        });
      } catch (error) {
        dispatch({ type: "ERROR", payload: error });
      } finally {
        dispatch({ type: "LOADING", payload: false });
      }
    })();
  }, []);

  useEffect(() => {
    (async () => {
      dispatch({ type: "ERROR", payload: null });
      dispatch({ type: "SUCCESS", payload: [] });
      try {
        if (text && attribute) {
          const filtered = state.loaded.filter((professor) =>
            professor[attribute]
              .toString()
              .toLowerCase()
              .includes(text.toLowerCase())
          );

          dispatch({
            type: "SUCCESS",
            payload: filtered,
          });
        } else {
          dispatch({
            type: "SUCCESS",
            payload: state.loaded,
          });
        }
      } catch (error) {
        dispatch({ type: "ERROR", payload: error });
      }
    })();
  }, [text, attribute, state.loaded]);

  return {
    loading: state.loading,
    error: state.error,
    data: state.data,
  };
};

export default useStore;
