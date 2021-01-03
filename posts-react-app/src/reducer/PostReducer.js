const initialState = {
    postList: []
}

const postReducer = (state = initialState, action) => {
    switch (action.type) {
        case "LOAD_POSTS":
            return {
                ...state,
                postList: action.payload
            }
        case "ADD_POSTS":
            console.log("Welcome" + action.payload.postId)
            return {
                ...state,
                postList: [...state.postList, action.payload]
            }
        default:
            return state;

    }
}

export default postReducer;