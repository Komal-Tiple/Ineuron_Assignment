import React from "react";
import { FirstName, LastName } from "../App";

// example of Context API

const CompC = () => {
    return (

        <FirstName.Consumer>
            {
                (fname) => {
                    return (
                        <>
                            <LastName.Consumer>
                                {
                                    (lname)=>{
                                        return <h1>Hi this is {fname} {lname}</h1>
                                    }
                                }
                            </LastName.Consumer>
                            
                        </>
                    )
                }
            }
        </FirstName.Consumer>
    )
}
export default CompC;