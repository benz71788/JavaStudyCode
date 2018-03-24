package ex18_8_PrintWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * PrintWriter Ŭ���� �̿��� ���α׷����� �����غ���
 * PrintWriter Ŭ������ �����͸� �����ؼ� ���Ϸ� ����ϴ� ����� �ִ� Ŭ�����̴�.
 */

class PrintWriterExample2_resource {
	
	public static void main(String[] args) {
		
		try (
				PrintWriter writer = new PrintWriter("output.txt");
				){
			
			writer.println("***** ����ǥ *****");
			//������ �����ؼ� ����Ѵ�.
			writer.printf("%5s : %3d %3d %3d %5.1f %n", "������", 92, 87, 95, 91.3f);
			writer.printf("%5s : %3d %3d %3d %5.1f %n", "������", 100, 90, 88, 92.7f);
			writer.printf("%-5s : %3d %3d %3d %5.1f %n", "�ֹ���", 75, 88, 85, 82.7f);
			
			//�⵵ : Y-4�ڸ�, y-2�ڸ�
			//�� : m-(01~12), B-(��:January)
			//�� : d-(1~31), e-(01~31)
			//���� : A-(Sunday), a-(sun) ; ����
			//���� : A-(�Ͽ���), a-(��)		; ���ѹα�
			//����/���� ���� : p
			//�� : H-(00~23), I(���� �빮��)-(01~12), k-(0~23), l(�� �ҹ���)-(1~12)
			//�� : M-(00~59)
			//�� : S-(00~59)
			//mm/dd/yy ���� : D
			//YYYY-mm-dd ���� : F
			//HH:MM ���� -> R
			//HH:MM:SS ���� -> T
			writer.printf("�ۼ�����1: %1$tY�� %1$tm�� %1$td�� " + " %1$tp %1$tH�� %n", new GregorianCalendar());
			writer.printf("�ۼ�����2: %1$ty�� %1$tm�� %1$td�� " + " %1$tp %1$tI�� %n", new GregorianCalendar());
			writer.printf("�ۼ�����3: %1$ty�� %1$tB %1$td��" + " %1$tA %1$tp %1$tl�� %1$tM�� %1$tS %n", new GregorianCalendar());
			writer.printf("�ۼ�����4: %1$tR %n", new GregorianCalendar());
			writer.printf("�ۼ�����5: %1$tD %n", new GregorianCalendar());
			writer.printf("�ۼ�����6: %1$tF %n", new GregorianCalendar());
			writer.printf("�ۼ�����7: %1$tF %n", new Date());
			writer.printf("�ۼ�����8N: %1$tF %n", System.currentTimeMillis());
			} catch(IOException ioe) {
				System.out.println("������ ����� �� �����ϴ�.");
		}
	}
}
