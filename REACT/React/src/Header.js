import React , { Component } from 'react';
import ReactDOM from 'react-dom';
import './App.css';
import Display from './DisplayList';
import Order from './OrderForm';
import Search from './SearchBar';
import Home from './HomePage';
import logo from './LOGO.PNG';

class Header extends Component{
    
  display = () => {
    ReactDOM.render(<Display/>, document.getElementById('root'));
  }
  order=()=>{
    ReactDOM.render(<Order/>, document.getElementById('root'));
  }

  search=()=>{
    ReactDOM.render(<Search/>, document.getElementById('root'));
  }  
  home=()=>{
    ReactDOM.render(<Home/>, document.getElementById('root'));
  }  
  
   render(){  
    return (
     <div className="header">
        <div className="container">
            <img src={logo}></img>
            <button type="button" className="headerButton" onClick={() => this.home()}>Home</button>
            <button type="button" className="headerButton" onClick={() => this.display()} >Display list</button>
            <button type="button" className="headerButton" onClick={() => this.order()}>Order form</button>
            <button type="button" className="headerButton" onClick={() => this.search()}>Search bar</button>   
        </div>
     </div>
    );
  }
}
export default Header;