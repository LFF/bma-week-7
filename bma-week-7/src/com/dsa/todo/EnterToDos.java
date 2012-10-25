package com.dsa.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class EnterToDos {
	
	
	public   ArrayList<HaveTo>    enterItem() throws ParseException {
		
    ArrayList<HaveTo> todoList1 = new ArrayList<HaveTo>();
    
     
 	 	 for (int i = 0; i < 5; i++) { 
 	 		 
	todoList1.add(new HaveTo(enterItem("Have To Do:"),
			
			enterdueDay("Due day"),
			
			enterdueMonth("Due Month"),
			
            enterdueYear("Due Year")));
		
		
	  }	
		return todoList1;
		
	}
	
	

	
	
	// ==== 
   	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
public static String enterItem(String labelitemin) {
	
   	System.out.print(labelitemin);
   
  	String itemIn = null;
	try {
   	    itemIn = reader.readLine();
   	} catch (IOException e) {
   	    e.printStackTrace();
   	} 
	
	
   	return itemIn;
	
	
}



public static int enterdueMonth(String labelitemin)

{

	System.out.print("month");

   int dateInMonth = 0;
   Scanner numberIn = new Scanner(System.in);
	  
    if (numberIn.hasNextInt()) 
		  
	  {
	  
  	 dateInMonth = numberIn.nextInt();
		
	  }

return dateInMonth; 

}



public static int enterdueDay(String labelitemin)

{

	System.out.print("Day");

   int dateInDay = 0;
   Scanner numberIn = new Scanner(System.in);
	  
    if (numberIn.hasNextInt()) 
		  
	  {
	  
  	 dateInDay = numberIn.nextInt();
		
	  }

return dateInDay; 

}


public static int enterdueYear(String labelitemin)

{

	System.out.print("Year");

   int dateInYear = 0;
   Scanner numberIn = new Scanner(System.in);
	  
    if (numberIn.hasNextInt()) 
		  
	  {
	  
  	 dateInYear = numberIn.nextInt();
		
	  }

return dateInYear; 

}





public static Date dueDt(String labelitemin) throws ParseException {
	
	
	
	// should enter date here
	
	 DateFormat formatter ; 
	
	 Date date ; 
	  
	  formatter = new SimpleDateFormat("dd/MM/yy");
	  
		   	System.out.print("month");
	   
	  	String dateInMonth = null;
		try {
	   	    dateInMonth = reader.readLine();
	   	} catch (IOException e) {
	   	    e.printStackTrace();
	   	} 
	  
	  	System.out.print("day");
		   
	  	String dateInDay = null;
		try {
	   	    dateInDay = reader.readLine();
	   	} catch (IOException e) {
	   	    e.printStackTrace();
	   	} 
	  
		
	  	System.out.print("year");
		   
	  	String dateInYear = null;
		try {
	   	    dateInYear = reader.readLine();
	   	} catch (IOException e) {
	   	    e.printStackTrace();
	   	} 
	  
		
		String dateIn =  dateInMonth + "/"+ dateInDay + "/"+ dateInYear;
		
	  
	  date = (Date)formatter.parse(dateIn);  
	
   	return date;
	
	
}


















}
