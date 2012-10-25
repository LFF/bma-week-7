package com.dsa.todo;

public interface I_MenuOptions {
	
	
	 
	  //  labels for menu options
	
	

	  // menu options list
	  public static String linespacer = "";
	
	  // menu options list
	  public static String labelMenuTitle01 = "TO DO Application Menu.";
	  
	  public static String labelMenuSubTitle01 = "Have To Do &  Want To Do.";
	  
	 
	  // menu options list
	  public static String labelMenuList01 = "Enter  1 = List All.";
	  
	  public static String labelMenuList02 = "Enter  2 = List Have to dos.";
	  
	  public static String labelMenuList03 = "Enter  3 = List Want to dos.";
	  
	  
	  // menu options add
		
	  public static String labelMenuAdd01 = "Enter  5 = Automatically create.";
	  
		
	  public static String labelMenuAdd02 = "Enter  6 = Manually create.";
	  
	  
	  
	  // menu options select
		
	  public static String labelMenuSelect01 = "Enter  10 = Select by Urgent - Have to dos.";
	  
		
	  public static String labelMenuSelect02 = "Enter  11 = Select by Date -  Have to dos.";
	  
	  
	  
	  
	  
	  // menu option exit
	  public static String labelMenuExit = "Enter 99 to exit.";
	  
	  
      void showMenuList();
      
      void showMenuAdd();
      
      void showMenuExit();	  
	  
	  
	  

}
