import { combineReducers } from 'redux'
import postReducer from './PostReducer'
import loginReducer from './LoginReducer'

export default combineReducers(
    {
        posts: postReducer,
        login: loginReducer

    }
)