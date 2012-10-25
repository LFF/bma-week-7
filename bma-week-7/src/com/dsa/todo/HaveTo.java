package com.dsa.todo;

import java.util.Date;


   // uses extends to use abstract class TODO

   // brings in Due Dt Unique to  Have To.

  //  right now  default Due Date is  TOMORROW


   //  not ready to work with actual dates
    
  //   due date belong to have to tods  but not to  want to dos






public class HaveTo extends ToDo {
	
	       Date  todoDueDt;
	       
	       int   dueMonth;
	       int   dueDay;
	       int   dueYear;
	       
	       
	       
	       
	       
	       
	  
	
	public HaveTo() {		
			super();
		
	}
    

	  public   HaveTo(String todoDesc, int dueMonth, int dueDay, int dueYear)  { 
	           
		        super(todoDesc);
		        
		 this.dueMonth = dueMonth;
		 this.dueDay = dueDay;
		 this.dueYear = dueYear;
		        
	     
	          }     
	  
	  
      
// Accessor methods	 	
      
public   	 int getToDoDay (){ return dueDay;}
  	 

public   	 int getToDoMonth (){ return dueMonth;}
 

public   	 int getToDoYear (){ return dueYear;}
 


	  
		     
	  // one line print of  fields
	  
	  public  String toString() {
		  
	  
	  	return   "Have To Do: "  +  getToDoDesc() + "  "
	  		   
	  		
	    + "  Due Month:"  + dueMonth
	    
		
	    + "  Due Day:"	+ dueDay 		
	    
	    
	    + "  Due Year:"  + dueYear
 	  	   
	   
	  	+ "  Date Entered:"		
	  			
	   +  DateUtils.formatDate(getToDoEnteredDt()) ;
	
	  }
	  	
	  
	
}
	
