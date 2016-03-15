package com.redbus.generics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilLib {
	
	public static String dateAppend(){
		Date d = new Date();
		SimpleDateFormat s =  new SimpleDateFormat("dd-MM-yy-HHmm");
		  String date = s.format(d);
		  System.out.println(date);
		return date;
	}

}
