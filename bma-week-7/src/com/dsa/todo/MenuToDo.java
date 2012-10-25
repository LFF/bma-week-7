package com.dsa.todo;

import com.dsa.todo.I_InputViaConsole;
import com.dsa.todo.I_MenuOptions;


/*
 *
 */

public class MenuToDo  implements I_InputViaConsole, I_MenuOptions  {
	
    
public MenuToDo() {
	
			
	
}


              public void showMenuTitle() {
            	  
                  
      	   	   System.out.println("----------------------------------------------------------");
      	        
                  
   	   	       System.out.println(linespacer);
   	        
	   	       System.out.println(linespacer);
	   	  
   	   	       
	   
	   	       System.out.println(labelMenuTitle01);

	   	       System.out.println(labelMenuSubTitle01);
	   	       
	   	       System.out.println(linespacer);
	   	      
	   
}




               public void showMenuList() {
            	   
            	   	       System.out.println(labelMenuList01);

            	   	       System.out.println(labelMenuList02);
            	   	       
            	   	        System.out.println(labelMenuList03);
            	   	        
            	   	        
            	   	     
            		   	       System.out.println(linespacer);
            		   	     
            	          
            	   
			}



               public void showMenuAdd() {
            	   
            	   	       System.out.println(labelMenuAdd01);

            	   	       System.out.println(labelMenuAdd02);
            	   	       
            	   	       
            	   	    
            	   	       System.out.println(linespacer);
            	   	     
            	   	        
            	   
			}
               

               public void showMenuSelect() {
            	   
            	   	       System.out.println(labelMenuSelect01);

            	   	       System.out.println(labelMenuSelect02);
            	   	       
            	   	       
            	   	    
            	   	       System.out.println(linespacer);
            	   	     
            	   	        
            	   
			}

               
               
               

               public void showMenufilter() {
            	    
    	   	       System.out.println(linespacer);
    	   	     
            	   
            	   	       System.out.println(labelMenuSelect01);

            	   	       System.out.println(labelMenuSelect02);
            	   	       
            	   	    
            	   	       System.out.println(linespacer);
            	   	     
            	   	       
            	   	       
            	   	       
            	   	       
            	   	       
            	   	        
            	   
			}

              
               
               public void showMenuExit() {
               
	            System.out.println(labelMenuExit);
	
               }
               

	
}

