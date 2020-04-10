package javaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) {
		Date dd=new Date();
		System.out.println(dd.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("dd/M/YYYY");
		System.out.println(sdf.format(dd));
		
		Calendar cal = Calendar.getInstance();
		System.out.println(Calendar.MONTH);
		//System.out.println(cal.MONTH);
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
	}

}
