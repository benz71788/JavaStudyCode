package ex12_1_Exception;

import java.io.FileReader;
import java.io.IOException;

//��� ���迡 �ִ� �� ������ Exception�� ó���ϴ� try~catch��
//���� ó�� ������ �ڽĿ��� �θ� ������ �ۼ��Ѵ�.
//FileNotFoundException -> IOException
//�� �� �߻��� ������ ������ ��ġ�ϴ� �� �Ѱ��� catch�ҷ��� ����ȴ�.
class ExceptionExample9_1 {
	
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		}
		//FileNotFoundException�� IOException�� ����Ŭ������
		//FileNotFoundException�� ���� �� �ִ�.
		catch(IOException e) {
			System.err.println("����� ������ �߻��߽��ϴ�.");
		}
	
	}

}
