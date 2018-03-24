package test.CalendarTest;

import java.util.Calendar;
import java.util.Scanner;

class Calendar1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요: ");
		int year = sc.nextInt();
		
		System.out.println("월을 입력하세요: ");
		int month = sc.nextInt();
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month -1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		
		calendar.set(Calendar.DAY_OF_MONTH, 32);
		
		int lastday = 32 - calendar.get(Calendar.DAY_OF_MONTH);
		
		int i = 0;
		for(; i < dayOfWeek - 1; i++) {
			System.out.print("\t");
		}
		
		for(int day = 1; day <= lastday; day++, i++) {
			if(i % 7 == 0) {
				System.out.println("");
			}
			System.out.print(day + "\t");
		}
		
		sc.close();
	}

}
