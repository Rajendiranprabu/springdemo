import { Component } from "react";

class Post extends Component {
    state = {
    }

    render() {

        const { title, body } = this.props.post;

        return (
            <div className="card">
                <div className="card-header"><h5 style={{ color: "blue" }}>{title}</h5></div>
                <div className="card-body"><p>{body}</p></div>
            </div>
        )

    }
}


export default Post;