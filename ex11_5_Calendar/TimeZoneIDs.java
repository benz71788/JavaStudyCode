package ex11_5_Calendar;

import java.util.TimeZone;

class TimeZoneIDs {
	
	public static void main(String[] args) {
		for(String name : TimeZone.getAvailableIDs()) {
			System.out.println(name);
		}
	}

}
