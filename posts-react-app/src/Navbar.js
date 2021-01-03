import { Component } from "react";
import { Link } from 'react-router-dom'
import { connect } from "react-redux";
class Navbar extends Component {


    render() {
        return (
            <div className="container'fluid">

                <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
                    <span className="navbar-brand">Posts</span>



                    {this.props.isAuthenticated ? (
                        <ul className="navbar-nav">
                            <li className="nav-item">
                                <Link className="nav-link active" to="/home">Home</Link>
                            </li>
                            <li className="nav-item">
                                <Link className="nav-link" to="/post">Add Post</Link>
                            </li>
                        </ul>
                    )
                        :
                        (
                            <ul className="navbar-nav">
                                <li className="nav-item">
                                    <Link className="nav-link" to="/">Login</Link>
                                </li>
                            </ul>
                        )
                    }



                </nav>

            </div >
        )
    }
}

const mapstatetoprops = state => ({
    isAuthenticated: state.login.isAuthenticate
})


export default connect(mapstatetoprops)(Navbar)