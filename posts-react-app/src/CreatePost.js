import { Component } from "react";
import { addPosts } from './actions/PostAction'
import { connect } from 'react-redux'
import { Redirect } from "react-router";
class CreatePost extends Component {

    state = {
        post: {
            userId: '1',
            id: '',
            title: '',
            body: ''
        },
        status: false

    }

    updateField = (e) =>
        this.setState({ post: { ...this.state.post, [e.target.name]: e.target.value } })



    addPost = (e) => {
        e.preventDefault();
        this.props.addPosts(this.state.post);
        this.setState({ ...this.state, status: true })
    }


    render() {

        const { postId, title, body } = this.state.post;

        return (!this.state.status ?
            <form onSubmit={this.addPost}>
                <div className="form-group">
                    <label>Post ID</label>
                    <input type="number" className="form-control"
                        onChange={this.updateField} value={postId} name="id"></input>
                </div>
                <div className="form-group">
                    <label>Title</label>
                    <input type="text" className="form-control"
                        onChange={this.updateField} value={title} name="title"></input>
                </div>
                <div className="form-group">
                    <label>Body</label>
                    <input type="text" className="form-control"
                        onChange={this.updateField} value={body} name="body"></input>
                </div>
                <button type="submit" className="btn btn-success">Add Post</button>
            </form> : <Redirect to="/home"></Redirect>
        );
    }
}

export default connect(null, { addPosts })(CreatePost)