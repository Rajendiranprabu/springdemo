import axios from 'axios'

export default function setAuth(token) {
    if (token) {
        axios.defaults.headers.common['Authorization'] = `bearer ${token}`;
        console.log(token);
    }
    else {
        delete axios.defaults.common['Authorization']
    }
}