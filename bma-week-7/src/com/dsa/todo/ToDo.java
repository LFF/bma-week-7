package com.dsa.todo;

import java.util.Date;



        //  uses abstract class
       //  uses private
       // uses constructor
      // uses overloaded constructor 
     // uses accessor methods
     //  sets up print string

    // uses description   -  description is common to all to dos
    // uses date   // create date is common to all to dos

 

public abstract class ToDo  {

	
	  private      String todoDesc;
	
	  private      Date  todoEnteredDt;
	  
	  
		
		 ToDo() {
			 
		    	 };
		       
		             
	 ToDo(String desc) {
		 
	    	this.todoDesc=desc;
	   
	    	this.todoEnteredDt =  new Date () ;
	    	
	              };
	       
	             
	         
	       
	// Accessor methods	 	
	       
public   	 String getToDoDesc (){ return todoDesc;}
	   	 
public  	 void setToDoDesc (String desc) {todoDesc=desc;}



public   	 Date getToDoEnteredDt (){ return todoEnteredDt;}
 
public  	 void setToDoEnteredDt (Date enteredDt) {todoEnteredDt=enteredDt;}

  		
}
	
	
