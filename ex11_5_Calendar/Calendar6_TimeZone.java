package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class Calendar6_TimeZone {
	
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		TimeZone timeZone = TimeZone.getTimeZone("Europe/London");
		calendar.setTimeZone(timeZone);
		
		System.out.println("������ ���� �ð��Դϴ�.");
		Today t = new Today();
		t.print(calendar);
	}

}
