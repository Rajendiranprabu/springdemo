import axios from 'axios'

export const login = (user) => async (dispatch) => {
    try {
        //   console.log("Called");
        const config =
        {
            headers: { 'Content-Type': 'application/json' }
        }
        const res = await axios.post('http://localhost:5000/login', user, config);
        dispatch({ type: "LOGIN_SUCCESS", payload: res.data.token })
        console.log(res.data.token);
    } catch (error) {
        console.log(error)
    }
}