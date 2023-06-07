package com.java.assessment.question4;

import java.util.Scanner;

public class BankServer {
    
		    // Initial balance is 100
		    int total = 100;
		    
		    // To withdraw money
		    public void withdrawn(String name, int withdrawal)
		    {
		        if (total >= withdrawal) {
		            System.out.println(name + " withdrawn "
		                               + withdrawal);
		 
		            total = total - withdrawal;
		            System.out.println("Balance after withdrawal: "
		                               + total);
		        }
		 
		        // If the money requested for withdrawal is greater
		        else {
		 
		            // Print statements
		            System.out.println(name
		                               + " you can not withdraw "
		                               + withdrawal);
		 
		            System.out.println("your balance is: " + total);
		  
		        }
		    }
		 
		    // Method - to deposit money
		   public void deposit(String name, int deposit)
		    {
		        System.out.println(name + " deposited " + deposit);
		        total = total + deposit;
		        System.out.println("Balance after deposit: "
		                           + total);
		        // Making the thread sleep for 1 second after
		        // each deposit
		       
		    }
		
		    
		    
		    
		    
	

}
