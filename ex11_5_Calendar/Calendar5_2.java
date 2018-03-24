package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Calendar5_2 {
	
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		Today t = new Today();
		t.print(c);
		
		c.add(Calendar.DATE, 10);
		t.print(c);
	}

}
