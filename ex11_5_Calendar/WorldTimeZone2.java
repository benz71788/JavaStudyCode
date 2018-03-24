package ex11_5_Calendar;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class WorldTimeZone2 {
	
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		
		worldTimeInfo(calendar, "´º¿å", "EST");
		worldTimeInfo(calendar, "È«Äá", "HKT");
		worldTimeInfo(calendar, "ÆÄ¸®", "CET");

	}
	
	static void worldTimeInfo(GregorianCalendar calendar, String worldName, String worldTime) {

		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("yyyy/MM/dd (E) aa hh:mm");
		dateFormat.setTimeZone(TimeZone.getTimeZone(worldTime));
		String str = dateFormat.format(calendar.getTime());
		System.out.println(worldName + " " + str);
	}

}
