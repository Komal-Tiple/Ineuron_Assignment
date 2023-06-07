import React, { useEffect, useState } from "react";
import { Button } from "reactstrap";
import Course from "./Course";
import axios from "axios";
import { myAxios, base_url } from "../api/bootapi";
import { toast } from "react-toastify";

const AllCourses = () => {

    useEffect(() => {
        alert("WELLCOME Komal");
        document.title = "All Courses"
    }, []);

    //for show data
    useEffect(() => {
        getAllCourseFromServer();
    }, []);

    //function for get Data from server
    const getAllCourseFromServer = () => {
        myAxios.get(`${base_url}/getAllCourse`).then(
            (response) => {
                console.log(response.data);
                toast.success("Courses has been loaded");
                setCourses(response.data);

            },
            (error) => {
                toast.error("Something went wrong.");
            }
        )
    }

    const [courses, setCourses] = useState([])


    const updatedData = (id) => {
        setCourses(courses.filter((item) => item.id != id));
    }



    return (
        <div>
            <Button onClick={() => {
                console.log("hello komal")
                setCourses([
                    ...courses, { title: "MySql", desc: "this is demo courses" }
                ])
            }}>see in console</Button>

            <h1>All Courses</h1>
            <p>List of Courses are following : </p>


            {courses.length > 0
                ? courses.map((item) => <Course course={item} update={updatedData} />)
                : <b>No Course Found</b>
            }

        </div>
    )
}

const UseStateExample = () => {
    const [name, newName] = useState("Ajay");

    const changeValue = (event) => {
        const newValue = event.target.value;
        newName(newValue);
    }

    return (
        <div>
            <label><b>example  :</b></label>
            <input type={Text} value={name} onChange={changeValue} />
            <h1>{name}</h1>
        </div>
    );
}

export {
    AllCourses,
    UseStateExample
};