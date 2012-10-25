package com.dsa.todo;



import java.text.ParseException;
import java.util.ArrayList;

import com.dsa.taskfilter.TaskFilter;



/*
 *  luis fonseca
 * 
 *   based on assigment  github  mselender bma-week-7.
 *
 */

public class Assignment {
	
	
	          static ArrayList<HaveTo> createtodos3;
	        	          	          
	          static CreateToDos createtodos2;
	          
	          static EnterToDos entertodos2;
		        
	          
	          
	
	
    
public static void main(String[]  args) throws ParseException {
	
	
	
	             MenuToDo menu = new MenuToDo();
	             
	             
	             
	        //     EnterString enteritem = new EnterString();
	                              
              
	             
	             EnterNumber enternumber = new EnterNumber();
	                              
                   
                   boolean menuGo = true;
                   
                  
                   while ( menuGo ) {
                	   
                	   
                   menu.showMenuTitle(); 
                	   
                   menu.showMenuList();
                   
                   menu.showMenuAdd();
                   
                   menu.showMenuSelect();
                   		                  
                   menu.showMenuExit();
                   
                   
                   
                   int numberentered = enternumber.enterNumber("----->");
                 
                  if  (numberentered >= 1 && numberentered <=99  )   {
                    
                    
                    int menuchoice = 0;
                    
                    menuchoice = numberentered;
	                   
               
                    
                	   switch(menuchoice) {
                	   
                	   
                	   case 99 :
                		   
                		   menuGo = false;
                		   
                		   System.out.println("Thank You.  You have exited the app.");
                		   
                	   
                	       break;
               	   
                	   
                	   case  1 :   System.out.println("---------------------------");
                	   
                	   for (HaveTo todo2 : createtodos3) {
                			printHaveTo(todo2);
                			
                		}
                      	
                	   
                 		 
         	           break;
         	                         
                	   case  2 :   System.out.println("---------------------------");
                	   
                	   
                	   for (HaveTo todo2 : createtodos3) {
                			printHaveTo(todo2);
                			
                		}
                      	
                	   
                	   
               		 
                        break;
                        
            
                	   case  3 :   System.out.println("---------------------------");
                	   
                	   
                	   for (HaveTo todo2 : createtodos3) {
                			printHaveTo(todo2);
                			
                		}
                      	
                	   
                	   
                	   
                	   
               		 
                        break;
                        
         
                	   case  4 :   System.out.println("---------------------------");
               		 
                        break;
                        
                	   case  5 :   System.out.println("---------------------------");
               		 
                	   
                	   Create();
                	   
                	   System.out.println("you have automatically created the following todos:");
                	   
                	   
                	   for (HaveTo todo2 : createtodos3) {
                			printHaveTo(todo2);
                			
                		}
                      	   
                	   
                	   
                        break;
                        
         
                	   case  6 :   System.out.println("---------------------------");
                	   
                	   
                	   System.out.println("6");
        			   
        			   Enter();
        			   
        		 	   System.out.println("you have entered via console the following todos:");
                	                   	   
                       
                	   for (HaveTo todo2 : createtodos3) {
                			printHaveTo(todo2);
                			
                		}
                      	
        			   
        			   
                	   
               		 
                        break;
                        
                        
                        

                	   case  10 :   System.out.println("---------------------------");
                	   
                	    
        		 	   System.out.println("the following items are urgent:");
        		 	   
        		 	   
        		 	             String  desc = "urgent";
        		 	                 
        		 	          FilterToDosDesc(desc);
        		      	
        			   
               		 
                        break;
                        
                        

                	   case  11 :   System.out.println("---------------------------");
                	   
                	    
        		 	   System.out.println("the following items are selected by date:");
        		 	   
        		 	   
        		 	                  int year = 13;
        		 	                  int day = 4;
        		 	                  int month = 07;
        		 	   
        		 	          FilterToDos(year, month, day);
        		      	
        			   
               		 
                        break;
                        
                        
                        
                        
                        
                        
                        default :
                        	
                        	
                        	System.out.println("-default pass-------");
                        	
                        	
                        	break;
                        
         	                         
                	 
                	   }
                	   
                	   
                	   }
                  
                  
                  else  {
                	  
                	  menuGo = false;
                	  
                	  
                  }
                  
                  
                   }
                   
                  
                	   
                   }
	             
	   



		private static void printHaveTo(HaveTo todo) {
			
			System.out.println(todo.toString());
			
			
		}
		       
		       
	
		
		
	private static void Create() {
			
		   
		   // will use  CreateToDos class to automatically create HAVE TO do list.  
             createtodos2 = new CreateToDos();
             
                 createtodos3 = (createtodos2.enterItem() ) ;

	}
           
	
	private static void Enter() throws ParseException {
			
		   
		   // will use  CreateToDos class to automatically create HAVE TO do list.  
             entertodos2 = new EnterToDos();
             
                    createtodos3 = entertodos2.enterItem();
             
                

	}
       
	     
           private static void FilterToDos(int year, int month, int day) {
       
     // will use TaskFilter class to filter out  URGENT to dos
		TaskFilter tf2 = new TaskFilter();
		
	//  actually do the filtering on the created data  array list
		
	ArrayList<HaveTo> filteredTodoList2 = tf2.filter(createtodos3, year, month, day);
	
	
	
	   
	   // print the selected/filtered items
	   for (HaveTo todo2 : filteredTodoList2) {
			
			printHaveTo(todo2);
			
		}
	   
			
		}
           
           
           private static void FilterToDosDesc(String desc) {
       
     // will use TaskFilter class to filter out  URGENT to dos
		TaskFilter tf2 = new TaskFilter();
		
	//  actually do the filtering on the created data  array list
		
	ArrayList<HaveTo> filteredTodoList2 = tf2.filter(createtodos3, desc);
	   
	   // print the selected/filtered items
	   for (HaveTo todo2 : filteredTodoList2) {
			
			printHaveTo(todo2);
			
		}
	   
			
		}
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
		
		
	}

