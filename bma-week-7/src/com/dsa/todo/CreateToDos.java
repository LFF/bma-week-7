package com.dsa.todo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class CreateToDos {
	
	
	public   ArrayList<HaveTo>  enterItem() {

	
    ArrayList<HaveTo> todoList = new ArrayList<HaveTo>();
    
     
        todoList.add(new HaveTo("have to 1",  dueMonth("Month"), dueDay("Day"),  dueYear("Year") ));
		
		todoList.add(new HaveTo("have to 2",   dueMonth("Month"), dueDay("Day"), dueYear("Year")  ));
		
		
		todoList.add(new HaveTo("have to 2" , 04,  05, 13));
		
		
		
		todoList.add(new HaveTo("have to 3  urgent!",   dueMonth("Month"), dueDay("Day"),  dueYear("Year")  ));
		
		   todoList.add(new HaveTo("have to 4",  dueMonth("Month"), dueDay("Day"),  dueYear("Year") ));
			
			todoList.add(new HaveTo("have to 5 urgent!",   dueMonth("Month"), dueDay("Day"), dueYear("Year")  ));
			
			todoList.add(new HaveTo("have to 6",   dueMonth("Month"), dueDay("Day"),  dueYear("Year")  ));
			
		
		
		
		return todoList;
		
		
	}
	
	
	

public static int dueDay(String labelitemin) {
	
   	System.out.print(labelitemin);
   
  	int itemIn = 0;

  	itemIn = 20 ;
  	
   	return itemIn;
	
	
}


public static int dueMonth(String labelitemin) {
	
   	System.out.print(labelitemin);
   
  	int itemIn = 0;
	
  	itemIn = 11;
  	
  
   	return itemIn;
	
	
}


public static int dueYear(String labelitemin) {
	
   	System.out.print(labelitemin);
   
  	int itemIn = 0;
	
  	itemIn = 12;
  	
   	return itemIn;
	
	
}


	

}
