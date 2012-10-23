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
	public ArrayList<HaveTo> filter(ArrayList<HaveTo> tados, String desc) {

		ArrayList<HaveTo> filteredTasks = new ArrayList<HaveTo>();
	
		
		for (HaveTo todo : tados) {
		
			
			if (todo.getToDoDesc().contains("urgent!")) {
				filteredTasks.add(todo);
			}
		}

		return filteredTasks;
	}


}
