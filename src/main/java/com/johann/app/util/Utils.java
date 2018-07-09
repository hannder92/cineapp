package com.johann.app.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Utils {

	public static List<String> getNextDays(int count){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date start = new Date();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, count);
		Date endDate = cal.getTime();
		
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.setTime(start);
		List<String> nextDays = new ArrayList<>();
		while(!gCal.getTime().after(endDate)) {
			Date d = gCal.getTime();
			gCal.add(Calendar.DATE, 1);
			nextDays.add(sdf.format(d));
		}
		return nextDays;
	}
	
}
