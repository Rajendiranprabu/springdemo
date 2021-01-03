import { createStore, applyMiddleware } from 'redux'

import thunk from 'redux-thunk'

import { composeWithDevTools } from 'redux-devtools-extension'

import rootReducer from './reducer'
import setAuth from './reducer/setAuth'

const initalState = {}

const middleware = [thunk]

const store = createStore(rootReducer, initalState,
    composeWithDevTools(applyMiddleware(...middleware)))

export default store;

if (localStorage.getItem('token')) {
    setAuth(localStorage.getItem('token'))
    // store.dispatch("LOGIN_SUCCESS", localStorage.getItem('token'))
}