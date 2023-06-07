import React, { useEffect, useState } from "react";
import { Button } from "reactstrap";
import Course from "./Course";


const AllCourses = () => {

    useEffect(() => {
        alert("WELLCOME Komal");
        document.title="All Courses"
    },[]);

    const [courses, setCourses] = useState([
        { title: "Springboot", desc: "this is demo courses" },
        { title: "React", desc: "this is demo courses" },
        { title: "Java", desc: "this is demo courses" }
    ])

    return (
        <div>
            <Button onClick={() => {
                console.log("hello komal")
                setCourses([
                    ...courses,{ title: "MySql", desc: "this is demo courses" }
                ])
            }}>see in console</Button>

            <h1>All Courses</h1>
            <p>List of Courses are following : </p>


            {courses.length > 0
                ? courses.map((item) => <Course course={item} />)
                : "No Course Found"
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