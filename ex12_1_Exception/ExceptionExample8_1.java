package ex12_1_Exception;

import java.io.FileReader;
import java.io.IOException;


//��� ���迡 �ִ� �� ������ Exception�� ó���ϴ� try~catch��
//���� ó�� ������ �ڽĿ��� �θ� ������ �ۼ��Ѵ�.
//FileNotFoundException -> IOException
//�� �� �߻��� ������ ������ ��ġ�ϴ� �� �Ѱ��� catch�ҷ��� ����ȴ�.
class ExceptionExample8_1 {
	
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		} catch(IOException e) {
			System.err.println("����� ������ �߻��߽��ϴ�.");
		}
		//�̹� �θ� IOException���� �ڽ� FileNotFoundException��
		//ó���� �� �ֱ� ������ �� �κ��� �ʿ����.
//		catch(FileNotFoundException e) {
//			System.err.println("������ ã�� �� �����ϴ�.");
//		}
	}

}
