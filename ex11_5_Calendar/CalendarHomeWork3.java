package ex11_5_Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class CalendarHomeWork3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ش��ϴ� ���� �Է��ϼ���");
		int a = sc.nextInt();
		System.out.println("�ش��ϴ� ���� �Է��ϼ���");
		int b = sc.nextInt();
		Calendar calendar = new GregorianCalendar(a,b-1,1); //2002�� 7�� 1��
		
		printCalendar(calendar, a, b);
		sc.close();
	}
	
	static void printCalendar(Calendar c, int a, int b) {
		
		String[][] calenArray = new String[6][7];
		
		int totalday=c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int ddd = c.get(Calendar.DAY_OF_WEEK); 
		int ass = ddd-1;
		
		System.out.printf("=====================%d�� %d��=====================\n", a, b);

		System.out.println("��\t��\tȭ\t��\t��\t��\t��");

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
