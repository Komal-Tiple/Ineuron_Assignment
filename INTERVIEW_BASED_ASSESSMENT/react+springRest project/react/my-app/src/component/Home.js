import React from "react";
import { Container, Button, Popover } from 'reactstrap';
import { ToastContainer, toast } from 'react-toastify';

const Home = () => {

    const buttonHandle = () => {
        toast.success("DONE",
            { position: "top-center" })
    }



    return (
        <div style={{padding:20}}>
         
                <h1>This is my Application Home Page.</h1>
                <Button color="primary" onClick={buttonHandle} outline>Start Application</Button>
            
          
        </div>
    )
}

export default Home;