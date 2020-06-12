import React from 'react';
import './App.css';
import MyData from './data/emp_data.json'

function SearchById(props){
    return( <div className="displaylist">
                <h2>Member with Id : {props.empid}</h2>
                <table id="deptTable">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Phone number</th>
                        <th>Department</th>
                        <th>Salary</th>
                    </tr>
                {MyData.map((emp, index) => {
                    if(emp.empid==props.empid)
                    return  <tr>
                                <td>{emp.empid}</td>
                                <td>{emp.name}</td>
                                <td>{emp.phone}</td>
                                <td>{emp.dept}</td>
                                <td>{emp.sal}</td>
                            </tr>

                })}
                </table>
             </div>);
}
export default SearchById;  