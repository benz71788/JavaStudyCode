package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
class Calendar5 {
	
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		c.add(Calendar.DATE, 1);
		System.out.println("1 ������ ��= " + c.get(Calendar.DATE));
		
		c.add(Calendar.MONTH, 1);
		System.out.println("1 ������ ��= " + (c.get(Calendar.MONTH) + 1));
		
		c.add(Calendar.YEAR, 1);
		System.out.println("1 ������ �⵵=" + c.get(Calendar.YEAR));
		
		c.add(Calendar.DATE, -1);
		System.out.println("1 ���ҵ� ��= " + c.get(Calendar.DATE));
		
		c.add(Calendar.MONTH, -1);
		System.out.println("1 ���ҵ� ��= " + (c.get(Calendar.MONTH) + 1));
		
		c.add(Calendar.YEAR, -1);
		System.out.println("1 ���ҵ� �⵵= " + c.get(Calendar.YEAR));
	}

}
