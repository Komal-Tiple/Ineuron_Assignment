import React from 'react';
import logo from './logo.svg';
import './App.css';
import Home from './component/Home';
import Course from './component/Course';
import { ToastContainer, toast } from 'react-toastify';
import { Container, Row, Col } from 'reactstrap';
import { AllCourses, UseStateExample } from './component/AllCourses';
import Header from './component/Header';
import Forms from './component/Form';
import Navigation from './component/OnePageApplication';
import { BrowserRouter, Route, Routes } from "react-router-dom";
import CompA from './practice/compA';
import { createContext } from 'react';

const FirstName = createContext();
const LastName = createContext();


function App() {

  return (
    <div>
      <BrowserRouter>
        <Container style={{ background: "#E6E6FA" }}>
          <Header />
          <Navigation />
          <Row>
            <Col md={4}>
              <h1>hi</h1>
            </Col>

            <Col md={8}>
              <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/getCourse" element={<Course course={{ title: "abc", desc: "xyz" }} />} />
                <Route path="/getAllCourses" element={<AllCourses />} />
                <Route path="/form" exact element={<Forms />} />
                <Route path="/form/:id" exact element={<Forms />} />

              </Routes>

            </Col>
          </Row>




          {/* example of create context API */}

          <FirstName.Provider value={"Komal"}>

            <LastName.Provider value={"Tiple"}>
              <CompA />
            </LastName.Provider>

          </FirstName.Provider>




        </Container>
      </BrowserRouter>




    </div>
  );
}

export default App;
export { FirstName, LastName };