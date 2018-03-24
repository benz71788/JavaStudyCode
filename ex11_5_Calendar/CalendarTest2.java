package ex11_5_Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest2 {
	
	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �⵵�� �Է��ϼ���: ");
		int year = sc.nextInt();
	
		System.out.println("����� ���� �Է��ϼ���: ");
		int month = sc.nextInt();
		
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		 
		calendar.set(Calendar.DAY_OF_MONTH, 32);
		
		int lastday = 32 - calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("=====================%d�� %d��=====================\n", year, month);

		System.out.println("��\t��\tȭ\t��\t��\t��\t��");

		int i = 0;
		
		for(;i<dayOfWeek - 1; i++){

			System.out.print("\t");

		}

		for(int day=1; day<=lastday; day++,i++){

			if(i % 7 ==0){

				System.out.println("");

			}

			System.out.print(day + "\t");

		}

		sc.close();
	}

}
