import React, { useState } from "react";
import { Card, CardBody, CardTitle, CardText, CardSubtitle, CardFooter, Button, Container, Form } from "reactstrap";
import axios from "axios";
import { base_url } from "../api/bootapi";
import { Toast } from "bootstrap";
import { toast } from "react-toastify";

const Course = ({ course, update }) => {


    const deleteCourse = (id) => {
        console.log("D E L E T E" + id);
        axios.delete(`${base_url}/deleteCourse/${id}`).then(
            (response) => {
                console.log(response);
                toast.success("Deleted Sucessfully");
                update(id);
            },
            (error) => {
                console.log(error);
                toast.error("Something went wrong");
            }
        )

    }

  

    return (

        <Container style={{ padding: 5, background: "blue" }} className="w-auto d-inline-block">
            <Card className="text-center" style={{ width: 250, background: "#E6E6FA" }}>
                <CardBody>

                    <CardSubtitle className="fw-bold">{course.title}</CardSubtitle>
                    <CardText>{course.desc}</CardText>

                    <Button color="danger" style={{ marginRight: 3 }} onClick={() => { deleteCourse(course.id) }}>Delete</Button>
                    <Button color="warning" href={'/form/'+course.id}>Update</Button>

                </CardBody>
            </Card>
        </Container>

    )


}

export default Course;