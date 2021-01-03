import { Component } from "react";
import Post from './Post'
import { connect } from 'react-redux'
import { getPosts } from './actions/PostAction'
import { Redirect } from "react-router";

//import axios from'axios'
class PostList extends Component {

    componentDidMount() {
        this.props.getPosts()
    }



    render() {
        return (

            // this.props.isAuthenticate ?
            this.props.posts ?
                <div>

                    {
                        this.props.posts.map(post =>
                            (<Post key={post.id} post={post} ></Post>))
                    }
                </div> : (<h1>Loading</h1>)
            //  : (<Redirect to="/"></Redirect>)
        )
    }
}

const mapstatetoprops = state => ({
    posts: state.posts.postList,
    //isAuthenticated: state.login.isAuthenticate
})


export default connect(mapstatetoprops, { getPosts })(PostList);