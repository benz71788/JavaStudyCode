package ex11_5_Calendar;

import java.util.Calendar;

class Calendar3 {
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		System.out.printf("%d��", today.get(Calendar.YEAR));
		System.out.printf("%d��", (today.get(Calendar.MONTH) + 1));
		System.out.printf("%d��", today.get(Calendar.DAY_OF_MONTH));
		if(today.get(Calendar.AM_PM) == 0) {
			System.out.print(" ���� ");
		} else {
			System.out.print(" ���� ");
		}
		System.out.printf("%d��", today.get(Calendar.HOUR));
		System.out.printf("%d��", today.get(Calendar.MINUTE));
		System.out.printf("%d��", today.get(Calendar.SECOND));
		if(today.get(Calendar.DAY_OF_WEEK) == 1) {
			System.out.println(DayOfWeek.SUNDAY.value());
		} else if(today.get(Calendar.DAY_OF_WEEK) == 2) {
			System.out.println(DayOfWeek.MONDAY.value());
		} else if(today.get(Calendar.DAY_OF_WEEK) == 3) {
			System.out.println(DayOfWeek.TUESDAY.value());
		} else if(today.get(Calendar.DAY_OF_WEEK) == 4) {
			System.out.println(DayOfWeek.WEDNESDAY.value());
		} else if(today.get(Calendar.DAY_OF_WEEK) == 5) {
			System.out.println(DayOfWeek.TURSDAY.value());
		} else if(today.get(Calendar.DAY_OF_WEEK) == 6) {
			System.out.println(DayOfWeek.FRIDAY.value()); 
		} else {
			System.out.println(" ������Դϴ�.");
		}
	}

}
