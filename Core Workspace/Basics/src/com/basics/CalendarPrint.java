package com.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPrint {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String d1 = "11/12/2023";
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date d2 = sdf.parse(d1);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2);
	    //System.out.println(cal.getTime());
		//System.out.println(d2);
		for(int i=0;i<12;i++) {
			cal.add(Calendar.DATE, 30);
			System.out.println(cal.getTime());
		}
	}

}
