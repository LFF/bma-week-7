package com.dsa.taskfilter;

import java.util.ArrayList;

import com.dsa.todo.HaveTo;



/**
 *     task filter interface copied from   git hub bma week 7  mselender  approach!!
 * 
 * 
 */



public interface I_TaskFilter {
	

	
	public ArrayList<HaveTo> filter(ArrayList<HaveTo> todos, String desc);
	

		
}
