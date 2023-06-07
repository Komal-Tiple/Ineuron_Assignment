import React, { Fragment, useEffect, useState } from "react";
import { toast } from "react-toastify";
import { FormGroup, Form, Button, Container, Row, Col } from "reactstrap";
import { myAxios, base_url } from "../api/bootapi";
import { useParams } from "react-router-dom";

const Forms = () => {
    
    const params = useParams();
 //   console.log("here this is  "+ params.id);

    useEffect(()=>{
        updateCourse(); 
    },[]);

    const updateCourse=()=>{
        console.log("here this is  "+params.id);
        
        myAxios.get(`${base_url}/getCourse/${params.id}`).then(
            (response)=>{
                console.log(response.data);
                setCourse(response.data);
            },
            (error)=>{
                console.log(error);
            }
        )
    }

    const [course, setCourse] = useState({
        id: "",
        title: "",
        description: ""
    });

    //const [updateCourse, setUpdateCourse] = useState({});

    const handelText = (e) => {

        const name = e.target.name;
        const value = e.target.value;
        setCourse({ ...course, [name]: value })

        console.log(course);
        console.log(name, value)

    }


    const handleForm = (event) => {
        event.preventDefault();
        // console.log(course);
        console.log("S U B M I T");
        postDatatoServer();

    }

    //creating function to post data on server
    const postDatatoServer = (userForm) => {
        myAxios.post(`${base_url}/addCourse`, course).then(
            (response) => {
                console.log(response);
                console.log("we got response")
                toast.success("Submited Successfully");
            },
            (error) => {
                console.log(error);
                console.log("we got error")
                toast.success("Something went wrong");
            }
        );
    }

    return (
        <Container>
            <Fragment>
                <h1>Fill the form</h1>
                <Form onSubmit={handleForm}>
                    <FormGroup>
                        <Row>
                            <Col md={2}>
                                <label for="id">Id</label>
                            </Col>
                            <Col md={10}>
                                <input type={Text} id="id" name="id" placeholder="type first name" value={course.id} onChange={handelText}></input>
                            </Col>

                        </Row>

                    </FormGroup>

                    <FormGroup>
                        <Row>
                            <Col md={2}>
                                <label for="title">Title</label>
                            </Col>
                            <Col md={10}>
                                <input type={Text} id="title" name="title" placeholder="type middle name" value={course.title} onChange={handelText}></input>
                            </Col>
                        </Row>
                    </FormGroup>

                    <FormGroup>
                        <Row>
                            <Col md={2}>
                                <label for="description">Description</label>
                            </Col>
                            <Col md={10}>
                                <input type={Text} id="description" name="description" placeholder="type last name" value={course.description} onChange={handelText}></input>
                            </Col>
                        </Row>
                    </FormGroup>


                    <Button color="success" className="text-center" type="submit">Save</Button>
                    <Button color="danger" className="text-center" type="reset" onClick={() => setCourse({})}>Clear</Button>

                </Form>
            </Fragment>
        </Container >
    )
}
export default Forms;