import React from "react";
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from "react-router-dom";
import {
    Collapse,
    Navbar,
    NavbarToggler,
    NavbarBrand,
    Nav,
    NavItem,
    NavLink,
    UncontrolledDropdown,
    DropdownToggle,
    DropdownMenu,
    DropdownItem } from 'reactstrap';
import Forms from "./Form";
import Header from "./Header";

const Navigation = () => {
    return (
        <div>



            <Navbar style={{background:"lightgray"}}>
                <NavbarBrand tag="a" href="/">Home</NavbarBrand>
               <ul>
                
                    <Nav>
                        <NavItem>
                            <NavLink href="/getCourse" style={{color:"black"}}>Course</NavLink>
                        </NavItem>
                        <NavItem>
                            <NavLink href="/getAllCourses" style={{color:"black"}}>All Courses</NavLink>
                        </NavItem>
                        <NavItem>
                            <NavLink href="/form" style={{color:"black"}}>Add Course</NavLink>
                        </NavItem>
                    </Nav>
                 </ul>
            </Navbar>







        </div>
    )
}
export default Navigation;
