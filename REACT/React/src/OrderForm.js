import React , { Component } from 'react';
import './App.css';
import ReactDOM from 'react-dom';
import OrderDetails from './FormDisplay';

class OrderForm extends Component {
    constructor(props){
        super(props);
        this.state = {
            name: '',
            address: '',
            email_id: '',
            phone: 0,
            order: "Orange Rs.50",
            qty: 0,
            msg: '',
            total: 0            
       };   
    }
   
    handleChangeName=(e)=>{
        this.setState({name:e.target.value});
    }
    handleChangeAddress=(e)=>{
        this.setState({address:e.target.value});
    }
    handleChangeEmail=(e)=>{
        this.setState({email_id:e.target.value});
    }
    handleChangePhone=(e)=>{
        this.setState({phone:e.target.value});
    }
    handleChangeOrder=(e)=>{
        this.setState({order:e.target.value});
    }
    handleChangeQty=(e)=>{
        this.setState({qty:e.target.value});
    }
    handleSubmit=(e)=>{
        ReactDOM.render(<OrderDetails name={this.state.name} address={this.state.address} email_id={this.state.email_id} phone={this.state.phone} msg={this.state.msg} total={this.state.total}></OrderDetails>, document.getElementById('root')); 
    }
    handleAdd=(e)=>{
        alert('Added!');
        var msg=this.state.msg;
        var order=this.state.order;
        var qty=this.state.qty;
        var orderText=msg+order+" *"+qty+"\n";
        var pos=order.search("Rs.");
        var cost=Number(order.slice(pos+3));
        var totalcost=this.state.total+(cost*qty);
        this.setState({msg:orderText});
        this.setState({total:totalcost});
      }
    /*
    handleAdd=(e)=>{
        alert('Removed!');
        var order=this.state.order;
        var qty=this.state.qty;
        var pos=order.search("Rs.");
        var cost=Number(order.slice(pos+3));
        var totalcost=this.state.total-(cost*qty);
        this.setState({total:totalcost});
      }
      */
    EmptyRootBelow=()=>{
        ReactDOM.render(<div></div>, document.getElementById('rootbelow'));
    }
   
       render () {
           return (
               <div className="orderform">
                   {this.EmptyRootBelow()}
                    <form onSubmit={this.handleSubmit}>
                       <h1>Order Form</h1>
                       <label>Name: </label>
                       <input type="text" name="name" required onChange={this.handleChangeName}></input><br/><br/>
                       <label>Address: </label>
                       <input type="text" name="address" required onChange={this.handleChangeAddress}></input><br/><br/>
                       <label>Email-Id: </label>
                       <input type="text" name="email_id" onChange={this.handleChangeEmail}></input><br/><br/>
                       <label>Phone number : </label>
                       <input type="text" name="phone" required onChange={this.handleChangePhone}></input><br/><br/>
                       <label>Fruits : </label>
                       <select value={this.state.order} onChange={this.handleChangeOrder}>
                            <option value="Orange Rs.50">Orange Rs.50/kg</option>
                            <option value="Grapes Rs.100">Grapes Rs.100/kg</option>
                            <option value="Mango Rs.60">Mango Rs.60/kg</option>
                            <option value="Banana Rs.30">Banana Rs.30/kg</option>
                            <option value="Apple Rs.150">Apple Rs.150/kg</option>
                       </select>
                       <label>Quantity: </label>
                       <input type="text" name="qty" required onChange={this.handleChangeQty}></input>
                       <button type="button"  onClick={() => this.handleAdd()}>Add</button><br/>
                       //<button type="button"  onClick={() => this.handleRemove()}>Remove</button>
                       <input type="submit" value="Submit"></input> 
                 </form>
               </div>
           )
    }
}
export default OrderForm;  
