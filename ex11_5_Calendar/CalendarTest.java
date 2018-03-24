package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

class CalendarTest {
	
	public static void main(String[] args) {
		
		
//		Calendar calendar = new GregorianCalendar(2002, 7, 1);
//		Calendar calendar = new GregorianCalendar(2002, 7, 1, 14, 30);
//		Calendar calendar = new GregorianCalendar(2002, 7, 1, 14, 30, 15);
		
		Calendar calendar = new GregorianCalendar();
		Today today = new Today();
		today.print(calendar);

	}

}
