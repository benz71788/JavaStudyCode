package ex0_HomeWork;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class CalendarHomeWork2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("해당하는 년을 입력하세요");
		int a = sc.nextInt();
		System.out.println("해당하는 월을 입력하세요");
		int b = sc.nextInt();
		Calendar calendar = new GregorianCalendar(a,b-1,1); //2002년 7월 1일
		sc.close();
		Today2 today = new Today2();
		today.print(calendar);
	}

}

class Today2{
	
	Today2(){
		
	}
	
	void print(Calendar c) {
		int totalday=c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int ddd = c.get(Calendar.DAY_OF_WEEK); 
		int ass = ddd-1;

		System.out.println("일\t월\t화\t수\t목\t금\t토");
        for ( int i = 0; i < ass; i++) //갯수만큼 \t로 공백
                System.out.print("\t");

        for ( int j = 1 ; j <=totalday; j++)  
        {                                              
                System.out.print(j+"\t");
                if (((j+ass) % 7) == 0 ) System.out.println(); 
                // 처음요일을 출력하기위한 공백만큼 계산해서 출력
        }
        System.out.println();
	}
}
