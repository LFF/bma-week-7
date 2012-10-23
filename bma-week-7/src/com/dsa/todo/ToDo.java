package com.dsa.todo;

import java.util.Date;



        //  uses abstract class
       //  uses private
       // uses constructor
      // uses overloaded constructor 
     // uses accessor methods
     //  sets up print string
 

public abstract class ToDo  {

	
	  private      String todoDesc;
	
	  private      String todoEnteredDt;
	  
	  
		
		 ToDo() {
			 
		    	 };
		       
		             
	 ToDo(String desc) {
		 
	    	this.todoDesc=desc;
	   
	    	this.todoEnteredDt= "today";
	    	
	              };
	       
	             
	         
	       
	// Accessor methods	 	
	       
public   	 String getToDoDesc (){ return todoDesc;}
	   	 
public  	 void setToDoDesc (String desc) {todoDesc=desc;}
	


public   	 String getToDoEnteredDt (){ return todoEnteredDt;}
 
public  	 void setToDoEnteredDt (String enteredDt) {todoEnteredDt=enteredDt;}

  
	
public  String toString() {
	return todoDesc + "  "
 +  todoEnteredDt + " ";
	
}
	
	
}
	

	
