package ex0_HomeWork;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class CalendarHomeWork2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ش��ϴ� ���� �Է��ϼ���");
		int a = sc.nextInt();
		System.out.println("�ش��ϴ� ���� �Է��ϼ���");
		int b = sc.nextInt();
		Calendar calendar = new GregorianCalendar(a,b-1,1); //2002�� 7�� 1��
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

		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
        for ( int i = 0; i < ass; i++) //������ŭ \t�� ����
                System.out.print("\t");

        for ( int j = 1 ; j <=totalday; j++)  
        {                                              
                System.out.print(j+"\t");
                if (((j+ass) % 7) == 0 ) System.out.println(); 
                // ó�������� ����ϱ����� ���鸸ŭ ����ؼ� ���
        }
        System.out.println();
	}
}
