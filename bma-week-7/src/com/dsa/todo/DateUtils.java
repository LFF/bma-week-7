package com.dsa.todo;

   // date formatting 
	
	import java.text.SimpleDateFormat;
	import java.util.Date;


	public class DateUtils {
			public static String formatDate(Date dateOrNull) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				return (dateOrNull == null ? null : sdf.format(dateOrNull));
			}
		}
	
	
	