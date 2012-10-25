package com.dsa.taskfilter;

import java.util.ArrayList;

import com.dsa.todo.HaveTo;


public class TaskFilter  implements I_TaskFilter {

	/**
	 *     task filter  class  copied from   git hub bma week 7  mselender  approach!!
	 * 
	 * 
	 */
	

	@Override
	public ArrayList<HaveTo> filter(ArrayList<HaveTo> todos, int year, int day, int month) {

		ArrayList<HaveTo> filteredTasks = new ArrayList<HaveTo>();
		
		for (HaveTo todo : todos) {
			
			if ( todo.getToDoYear() == year || todo.getToDoDay() == day ||  todo.getToDoMonth() == month ) 
			
			{
				
				filteredTasks.add(todo);
				
				
			}
		}

		return filteredTasks;
	}

	
	
	public ArrayList<HaveTo> filter(ArrayList<HaveTo> todos, String desc) {

		ArrayList<HaveTo> filteredTasks = new ArrayList<HaveTo>();
		
		for (HaveTo todo : todos) {
			
			if (todo.getToDoDesc().contains(desc)  ) 
			
			{
				
				filteredTasks.add(todo);
				
				
			}
		}

		return filteredTasks;
	}

	
	

}