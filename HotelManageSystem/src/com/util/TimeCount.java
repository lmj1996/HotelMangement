package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeCount {
	static SimpleDateFormat formatter;
	
	public static long getDay(String startDay,String endDay) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d1 = null;
		Date d2 = null;
		
		try {
			d1 = formatter.parse(startDay);
			d2 = formatter.parse(endDay);
			long diff = d2.getTime() - d1.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000);
			return diffDays;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 000000000000;
		}
		
	}
	
	public static long getHours(String startDay,String endDay) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d1 = null;
		Date d2 = null;
		
		try {
			d1 = formatter.parse(startDay);
			d2 = formatter.parse(endDay);
			long diff = d2.getTime() - d1.getTime();
			long diffHours = diff / (60 * 60 * 1000) % 24;
			return diffHours;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 000000000000;
		}
		
	}
	
}
