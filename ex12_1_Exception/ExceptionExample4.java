package ex12_1_Exception;

//unchecked exception�� ������ �޼ҵ�
//throws ���� ��� try~catch������ ���� ó�� ����
//������ 0���� ������ ���� �����Ǿ� ArithmeticException �߻��Ѵ�.
class ExceptionExample4 {
	
	public static void main(String[] args) {
		try {
			int result = devide(3, 0);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.err.println("���� �߻�");
			e.printStackTrace();
		}
	}
	
	static int devide(int a, int b) {
		int result = a / b;
		return result;
	}

}
