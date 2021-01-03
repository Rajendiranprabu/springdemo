import axios from 'axios'


export const getPosts = () => async (dispatch) => {
    try {
        console.log("Called");
        const res = await axios.get('http://localhost:5000/posts');
        dispatch({ type: "LOAD_POSTS", payload: res.data })
        // console.log(res.data);
    } catch (error) {
        console.log(error)
    }
}


export const addPosts = (post) => async (dispatch) => {
    try {
        //   console.log("Called");
        const config =
        {
            headers: { 'Content-Type': 'application/json' }
        }
        const res = await axios.post('http://localhost:5000/posts', post, config);
        dispatch({ type: "ADD_POSTS", payload: res.data })
        // console.log(res.data);
    } catch (error) {
        console.log(error)
    }
}


