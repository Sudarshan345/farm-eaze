package com.farmeaze.javafiles;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDate_Time {

	public static void main(String[] args) {
		
	    Date date = new Date();
	    String strDateFormat = "hh:mm:ss ";
	    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	    String formattedDate= dateFormat.format(date);
	    System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
	    Calendar cal = Calendar.getInstance();
	    Date date1=cal.getTime();
	    DateFormat dateFormat1 = new SimpleDateFormat("HH:mm:ss");
	    String formattedDate1=dateFormat1.format(date);
	    System.out.println("Current time of the day using Calendar - 24 hour format: "+ formattedDate1);
	    
	    
	    Calendar calendar = Calendar.getInstance();
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	    System.out.println(formatter.format(calendar.getTime()));
	    String d=formatter.format(date1);
	    System.out.println(d);
	    System.out.println(calendar.getTime());
	}

}
