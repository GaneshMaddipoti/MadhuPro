package seleniumtasks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSample {
	public static void main(String[] args) {
		
			Date d = new Date();
			SimpleDateFormat s =  new SimpleDateFormat("ddMMyyHHmmss");
			  String date = s.format(d);
			System.out.println(date);
		}
		
	}
	



