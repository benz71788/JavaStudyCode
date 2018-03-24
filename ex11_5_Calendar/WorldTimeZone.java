package ex11_5_Calendar;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class WorldTimeZone {
	
	public static void main(String[] args) {
		
		String[] worldName = new String[] {"´º¿å", "È«Äá", "ÆÄ¸®"};
		String[] worldTime = new String[] {"EST", "HKT", "CET"};
		
		for(int i = 0; i < worldName.length; i++) {
			worldTimeInfo(worldName[i], worldTime[i]);
		}
		
	}
	
	static void worldTimeInfo(String worldName, String worldTime) {

		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("yyyy/MM/dd (E) aa hh:mm");
		dateFormat.setTimeZone(TimeZone.getTimeZone(worldTime));
		String str = dateFormat.format(calendar.getTime());
		System.out.println(worldName + " " + str);
	}

}
