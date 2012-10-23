package com.dsa.todo;


   // uses extends to use abstract class TODO

   // brings in Due Dt Unique to  Have To.

  //  right now  default Due Date is  TOMORROW


   //  not ready to work with actual dates
    


public class HaveTo extends ToDo {
	
	       String todoDueDt;
	  
	
	public HaveTo() {		
			super();
		
	}
    

	  public   HaveTo(String todoDesc)  { 
	           
		        super(todoDesc);
		        todoDueDt = "due tomorrow";
		        
	     
	          }     
		     
	  
		
	  // overrides  to string in abstract todo class
	  
	  public  String toString() {
		  
	  
	  	return getToDoDesc() + "  "
	  			
	   +  getToDoEnteredDt() + " " 
	   
	   +  todoDueDt;
	  	
	  }
	  	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
	
}
	
