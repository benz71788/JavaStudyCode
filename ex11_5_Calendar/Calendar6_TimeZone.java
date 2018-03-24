package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class Calendar6_TimeZone {
	
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		TimeZone timeZone = TimeZone.getTimeZone("Europe/London");
		calendar.setTimeZone(timeZone);
		
		System.out.println("런던의 현재 시간입니다.");
		Today t = new Today();
		t.print(calendar);
	}

}
