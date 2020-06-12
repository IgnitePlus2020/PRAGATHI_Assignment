import React , { Component } from 'react';
import ReactDOM from 'react-dom';
import './App.css';

class HomePage extends Component {
    EmptyRootBelow=()=>{
       ReactDOM.render(<div></div>, document.getElementById('rootbelow'));
    }
   
    render () {
        return (
            <div>
                {this.EmptyRootBelow()}
               <div>
                    <h3>Display List</h3>
                    <p>Click on the 'Display list' tab on the header. Select a department from the dropdown and click on submit button.                        
                    This displays the Id , Name , Phone number , Salary of all the members of that particular department.</p>
                </div>
                <div>
                    <h3>Order Form</h3>
                    <p>Click on the 'Order form' tab on the header. Enter name , address , emailid and mobile number. Choose the fruit from the dropdown and enter quantity and click on Add button.
                    To add more items, again choose the fruit nane, enter quantity and later click on Add button. Click on Submit button after choosing all the items. This displays the order details with total cost.</p>
               </div>
               <div>
                   <h3>Real-time Search</h3>
                   <p>Click on the 'Search bar' tab on the header. Enter the Id of the member which is a number between 1 and 10 and click on Search button.                      
                   This displays the Id, name , phone number , salary and department of the member with that particular Id.</p>
                </div>
            </div>     
        )
    }
}
export default HomePage;  