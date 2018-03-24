package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarHomeWork {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 년도를 입력하세요: ");
		int anyYear = sc.nextInt();
	
		System.out.println("출력할 달을 입력하세요: ");
		int anyMonth = sc.nextInt();

//		Calendar calendar = new GregorianCalendar(2002, 7, 1, 14, 30, 15);
		
		Calendar calendar = new GregorianCalendar();
		Today today = new Today();
//		today.print(calendar);
//
//		System.out.printf("%d년 %d월", anyYear, anyMonth);

		
		
		febuDay(anyYear, anyMonth);
		
//		sc.close();
	}
	
	static void febuDay(int anyYear, int anyMonth) {
		System.out.printf("==============%d년 %d월===============\n", anyYear, anyMonth);
		for(int i = -3; i <= 28; i++) {
			if(i <= 0) {
				System.out.printf("%5s", "");
			} else {
				System.out.printf("%5d", i);
			}
			
			if(i % 7 == 3) {
				System.out.println();
			}
		}
	}

}
