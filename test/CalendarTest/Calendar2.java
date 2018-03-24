package test.CalendarTest;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요: ");
		int year = sc.nextInt();
		
		System.out.println("월을 입력하세요: ");
		int month = sc.nextInt();

		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, 1);
		
		printCalendarInfo(calendar, year, month);
		
		sc.close();
	}
	
	static void printCalendarInfo(GregorianCalendar calendar, int year, int month) {
		String[][] calenArray = new String[6][7];
		
		int first = calendar.get(Calendar.DAY_OF_WEEK);
		int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDay = first - 1;
		
		System.out.printf("=====================%d년 %d월=====================\n", year, month);

		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int num = 0;
		for(int i = 0; i < calenArray.length; i++) {
			for(int j = 0; j < calenArray[i].length; j++) {
				if(j < firstDay && i == 0) {
					calenArray[i][j] = " ";
					System.out.print("\t");
				} else if(maxDay <= num) {
					calenArray[i][j] = " ";
					System.out.print("\t");
				} else {
					num += 1;
					calenArray[i][j] = Integer.toString(num);
					System.out.print(calenArray[i][j] + "\t");
					
				}
			}
			System.out.println();
		}
	}

}
