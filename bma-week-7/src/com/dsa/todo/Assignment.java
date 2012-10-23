package com.dsa.todo;

import java.util.ArrayList;

import com.dsa.taskfilter.TaskFilter;



/*
 *  luis fonseca
 * 
 *   based on assigment  github  mselender bma-week-7.
 *
 */

public class Assignment {
	
    
public static void main(String[]  args) {
	

	try {
		
		     
		       
		       ArrayList<HaveTo> todoList = new ArrayList<HaveTo>();
		       
		       
				todoList.add(new HaveTo("have to 1"));
				todoList.add(new HaveTo("have to 2"));
				todoList.add(new HaveTo("have to 3"));
				todoList.add(new HaveTo("have to 4 urgent!"));
				todoList.add(new HaveTo("have to 5 urgent!"));
				todoList.add(new HaveTo("have to 6"));
				todoList.add(new HaveTo("have to 7"));
				todoList.add(new HaveTo("have to 8"));
				
				

				System.out.println("All Have To Dos -->:");
				
				
				// print all todos
				for (HaveTo todo : todoList) {
					
					printHaveTo(todo);
					
				}

				

				TaskFilter tf = new TaskFilter();

				ArrayList<HaveTo> filteredTodoList = tf.filter(todoList, "have to 5");

				System.out.println("Selected Have To Dos--->:");
				
				
				for (HaveTo todo : filteredTodoList) {
					
					printHaveTo(todo);
					
				}


			}
			catch (Exception e) {
				System.out.println(e);
			}

		}

		private static void printHaveTo(HaveTo todo) {
			
			System.out.println(todo.toString());
			
			
		}
		       
		       
	
	}

