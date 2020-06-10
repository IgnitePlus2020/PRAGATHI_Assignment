import React from 'react';
import './App.css';

function FormDisplay(props){
    return( 
        <div className="order_form">
            <h1 className="heading">Order Details </h1>
            <h4>Name : {props.name}</h4>
            <h4>Address : {props.address}</h4>
            <h4>Email-id : {props.email_id}</h4>
            <h4>Phone number : {props.phone}</h4>
            <h4>Order :</h4>
            <h4 className="addNewLine">{props.msg}</h4>
            <h3>Total : {props.total}</h3>    
        </div>
    );
}
export default FormDisplay; 