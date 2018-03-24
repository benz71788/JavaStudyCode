package ex18_10_File;

import java.io.File;
import java.util.GregorianCalendar;

class FileExample {
	
	public static void main(String[] args) {
		//���� ���丮 ��θ��� ������ File ��ü�� �����Ѵ�.
		File file = new File(".");
		File[] arr = file.listFiles();		//���� ���丮�� ���� ����� �����´�.
		
		for(int cnt = 0; cnt < arr.length; cnt++) {
			String name = arr[cnt].getName();
			
			if(arr[cnt].isFile()) {	//�����̸� true �ƴϸ� false
				//arr[cnt].length():������ ũ��(����Ʈ);
				System.out.printf("%-25s %7d \t", name, arr[cnt].length());
			} else {
				System.out.printf("%-25s   <DIR> \t", name);
			}
			
			
			//1970�� 1�� 1�� 0�� 0�� 0�� �������� ����� �и������� ���� ����
			//����� ������ �� �ִ� ��¥�� �ð����� ������ �ʿ� ����.
			long time = arr[cnt].lastModified();	//���� �����Ͻø� ����
			//System.out.printf("%d\n", time);
			
			GregorianCalendar calendar = new GregorianCalendar();
			//setTimeInMillis�޼ҵ�� ��ü�� ������ �ִ� �ð� ������ �Ķ���� ������ �����ϴ�
			//�̶� �Ķ���� 1970�� 1�� 1�� 0�� 0�� 0�� �������� ����� �и������� ���̾�� �Ѵ�.
			calendar.setTimeInMillis(time);
			System.out.printf("%1$tF %1$tT \n", calendar);
			
//			System.out.printf("%1$tF %1$tH:%1$tM:%1$tS\n", calendar);
		}
	}

}
