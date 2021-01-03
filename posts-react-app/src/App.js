import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import Navbar from './Navbar';
import PostList from './PostList'
import { BrowserRouter as Router, Route } from 'react-router-dom'
import CreatePost from './CreatePost'
import { Component } from 'react';
//import { Provider } from 'react-redux'
//import store from './Store'
//import { createBrowserHistory } from 'react-router-dom'
import { getPosts } from './actions/PostAction'
import { connect } from 'react-redux'
import Login from './Login';
class App extends Component {



  render() {
    return (



      <div className="container-fluid">
        <Router>
          <Navbar />

          <Route exact path="/home" component={PostList}></Route>
          <Route exact path="/" component={Login}></Route>
          {/* <Route exact path="/" render={props => (
              <PostList posts={this.state.posts}></PostList>
              //<CreatePost createPost={this.createPost}></CreatePost>
            )}></Route> */}

          <Route exact path="/post" render={props => (
            // <Posts posts={this.state.posts}></Posts>
            <CreatePost createPost={this.createPost}></CreatePost>
          )}></Route>




          {/* <Route exact path="/post" render={props =>
            (
             
            )}> </Route> */}


        </Router>

      </div>

    );
  }
}
export default App;
