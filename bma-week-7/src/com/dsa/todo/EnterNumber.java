package com.dsa.todo;


//  enter a number between 1 and 99


import java.util.Scanner;

public  class EnterNumber   {

	
	 public      int enteredNumber;
	  
	 public      EnterNumber() { enteredNumber= 0 ;  }

	 public      EnterNumber(int number) {enteredNumber=number; };
	       
	       
	  	 // Accessor methods	 	
	       
	public   	 int getNumber (){ return enteredNumber;}
	   	 
	public  	 void setEnteredNumber (int number) {enteredNumber=number;}
	
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
		
	      
	      public static int enterNumber(String labelnumberin){
	    	  
	    	  System.out.print(labelnumberin);
	    	  
	    	  
	    	  
	    	  int  number = 0;
	    	  	    	  
	    	  
	    	  
	    	  boolean numbernotOK = true;
	    	  
	    	  
	    	  
	    	   
              while ( numbernotOK ) {
         	     
            	   
            	  Scanner numberIn = new Scanner(System.in);
	    		
         	  
            	
            	  
         	      if (numberIn.hasNextInt()) 
	    			  
	    		  {
             	  
         	    	 number = numberIn.nextInt();
 	    			
         	  	  
	    			  
	    			  if ( number >=1  && number <= 99) 
	    				 
	    			  {
	    				  
	    				  numbernotOK = false;
	    			  }
	    			  
	    			  
	    			  else
		    			  
		    		  {
		    			  System.out.println("Please enter number between 1 & 99  xx"  );
		    			  
		    		  }
	    			  
	    			  
	    			  
	    		  }
	    		  
	    		  else
	    			  
	    		  {	    			  
	    			  
	    			  System.out.println("Please enter number between 1 & 99");
	    			  
	    		  }
	    		 

    	    	
         	      
              }
            
              
              return number;
     	      
              
	    		  
	    		  	    		  
	    	  }
	    	  
	
	
	public void showNumber(int numberIn) {
		
       	System.out.println("You entered : " + numberIn);
		
       	
	}

	public void showNumber() {
				
	 	System.out.println("You entered : nothing ") ;
		
	}
	
	
}
	
