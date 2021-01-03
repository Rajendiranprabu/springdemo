import setAuth from "./setAuth";

const initialState = {
    token: localStorage.getItem('token'),
    isAuthenticate: localStorage.getItem('token') ? true : false
    // token: null,
    // isAuthenticate: false
}
const loginReducer = (state = initialState, action) => {
    switch (action.type) {
        case "LOGIN_SUCCESS":
            setAuth(action.payload);
            localStorage.setItem('token', action.payload);
            /* lines to be added in store.js 
            if (localStorage.getItem('token')) {
           setAuth(localStorage.getItem('token'))
            }
            */
            return {
                ...state,
                token: action.payload,
                isAuthenticate: true
            }
        default:
            return state;

    }
}

export default loginReducer;