package com.dsa.todo;

// enter a string


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;


public  class EnterString   {

	
	 public      String enteredString;
	  
	 public      EnterString() { enteredString="";  }

	 public      EnterString(String string) {enteredString=string; };
	       
	       
	  	 // Accessor methods	 	
	       
	public   	 String getString (){ return enteredString;}
	   	 
	public  	 void setEnteredString (String string) {enteredString=string;}
	
	/*	
		// ==== 
       	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	 	
       	public static String enterString(String labelStringin) {
   	
       	System.out.print(labelStringin);
       
      	String StringIn = null;
		try {
       	    StringIn = reader.readLine();
       	} catch (IOException e) {
       	    e.printStackTrace();
       	} 
   	
		
       	return StringIn;
	
		}
		*/
		
		
	     static  Scanner reader = new Scanner(System.in);
	      
	      public static String enterString(String labelstringin){
	    	  
	    	  System.out.print(labelstringin);
	    	  
	    	  String stringIn = null;
	    	  
	    		  stringIn = reader.nextLine();
	    	  
	    	  return stringIn;
	    		  	    		  
	    	  }
	    	  
	     
	      
	
	
	
	public void showString(String stringIn) {
		
       	System.out.println("You entered : " + stringIn);
		
       	
	}

	public void showString() {
				
	 	System.out.println("You entered : nothing ") ;
		
	}
	
	
}
	
