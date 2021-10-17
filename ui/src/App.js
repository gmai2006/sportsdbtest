import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import { Container } from 'react-bootstrap';
import Sidebar from './components/Sidebar';
import Overview from './pages/Overview';
import Query from './pages/Query';
import TableMenu  from './components/TableMenu';
import init from "./init";

const App = () => {
  const path = '/' + init.appName;
  return (
    <div className='App'>
      <Router>
        <Sidebar />
        <Container fluid>
          <Switch>
            <Route path={path} exact component={Overview} />
            <Route path={path + '/query'} component={Query} />
            <Route path={path + '/tables'} component={TableMenu} />
          </Switch>
      </Container>
    </Router>
    </div>
  );
}

export default App;