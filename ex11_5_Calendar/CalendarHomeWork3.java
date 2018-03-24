package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class CalendarHomeWork3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("해당하는 년을 입력하세요");
		int a = sc.nextInt();
		System.out.println("해당하는 월을 입력하세요");
		int b = sc.nextInt();
		Calendar calendar = new GregorianCalendar(a,b-1,1); //2002년 7월 1일
		
		printCalendar(calendar, a, b);
		sc.close();
	}
	
	static void printCalendar(Calendar c, int a, int b) {
		
		String[][] calenArray = new String[6][7];
		
		int totalday=c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int ddd = c.get(Calendar.DAY_OF_WEEK); 
		int ass = ddd-1;
		
		System.out.printf("=====================%d년 %d월=====================\n", a, b);

		System.out.println("일\t월\t화\t수\t목\t금\t토");

        int num = 0;
        
        for(int m = 0; m < calenArray.length; m++)  {                         
        	for(int n = 0; n < calenArray[m].length; n++) {
        		if(n < ass && m == 0) {
        			calenArray[m][n] = " ";
        			System.out.print(calenArray[m][n] + "\t");
        		} else if(totalday <= num) {
        			calenArray[m][n] = " ";
        		} else {
        			num += 1;
            		calenArray[m][n] = Integer.toString(num);
            		System.out.print(calenArray[m][n] + "\t");
        		}		
        	}
        	System.out.println();
        }

	}

}
