import { Component } from "react";
import { login } from './actions/LoginAction'
import { connect } from 'react-redux'
import { Redirect } from "react-router";
class Login extends Component {

    state = {
        user: {
            username: '',
            password: ''

        }


    }

    updateField = (e) =>
        this.setState({ user: { ...this.state.user, [e.target.name]: e.target.value } })



    login = (e) => {
        e.preventDefault();
        // this.props.addPosts(this.state.post);
        // this.setState({ ...this.state, status: true })
        this.props.login(this.state.user);
        console.log(this.state.user);
    }


    render() {

        const { username, password } = this.state.user;

        return (
            this.props.isAuthenticated ? <Redirect to="/home"></Redirect>
                :
                <form onSubmit={this.login}>
                    <div className="form-group">
                        <label>Username</label>
                        <input type="text" className="form-control"
                            onChange={this.updateField} value={username} name="username"></input>
                    </div>
                    <div className="form-group">
                        <label>Password</label>
                        <input type="password" className="form-control"
                            onChange={this.updateField} value={password} name="password"></input>
                    </div>
                    <button type="submit" className="btn btn-success">Login</button>
                </form>
        );
    }
}

const mapstatetoprops = state => ({
    isAuthenticated: state.login.isAuthenticate
})


export default connect(mapstatetoprops, { login })(Login);