import React , { Component } from 'react';
import ReactDOM from 'react-dom';
import './App.css';
import DeptSearch from './SearchByDept';

class DisplayList extends Component {
 constructor(props){
     super(props);
     this.state = {
        value:"CSE"
    };    
 }

 handleChange=(e)=>{
    this.setState({value : e.target.value});
 }
 handleSubmit=()=>{
   ReactDOM.render(<DeptSearch value={this.state.value}></DeptSearch>, document.getElementById('rootbelow')); 
 }
 EmptyRootBelow=()=>{
    ReactDOM.render(<div></div>, document.getElementById('rootbelow'));
 }

    render () {
        return (
            <div className="topSpace">
                 {this.EmptyRootBelow()}
                <form>
                    <label>Select a department : </label>
                    <select value={this.state.value} onChange={this.handleChange}>
                        <option value="CSE">COMPUTER SCIENCE ENGINEERING</option>
                        <option value="ECE">ELECTRONICS AND COMMUNICATION ENGINEERING</option>
                        <option value="TCE">TELECOMMUNICATION ENGINEERING</option>
                        <option value="ISE">INFORMATION SCIENCE ENGINEERING</option>
                    </select> 
                    <button type="button"  onClick={() => this.handleSubmit()} >Submit</button>
                </form>
            </div>     
        )
    }
}
export default DisplayList;  