import React, { useContext } from 'react';
import { FirstName, LastName } from '../App';
import CompC from './compC';

// exampe of useContext react Hook

const CompB=()=>{

    const fname = useContext(FirstName);
    const lname = useContext(LastName);

    return(
        <div>
            <h3>{fname} {lname} is practicing..</h3>
            <CompC></CompC>
        </div>
    )
}
export default CompB;

