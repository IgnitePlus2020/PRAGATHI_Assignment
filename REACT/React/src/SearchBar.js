import React , { Component } from 'react';
import './App.css';
import ReactDOM from 'react-dom';
import IdSearch from './SearchById';

class SearchBar extends Component {
    constructor(props){
        super(props);
        this.state = {
           empid: 0
       };   
    }
   
    handleChange(num){
        this.setState({empid : num});
    }
    handleSubmit=()=>{ 
        ReactDOM.render(<IdSearch empid={this.state.empid}></IdSearch>, document.getElementById('rootbelow'));  
    }
    EmptyRootBelow=()=>{
        ReactDOM.render(<div></div>, document.getElementById('rootbelow'));
    }
   
    render () {
       return (
            <div>
                {this.EmptyRootBelow()}
                   <form>
                       <label>Enter Id of the member : </label>
                       <input type="text" required placeholder="number between 1 and 10" onChange={e=>this.handleChange(e.target.value)}></input>
                       <button type="button"  onClick={() => this.handleSubmit()} >Search</button>
                   </form>
            </div>
        )
    }
}
export default SearchBar;  