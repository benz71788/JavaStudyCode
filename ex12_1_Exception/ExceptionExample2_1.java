package ex12_1_Exception;

// unchecked exception�� �ش� - ������ ���� ����
class ExceptionExample2_1 {
	
	public static void main(String[] args) {
		int num1 = 3, num2 = 0;
		
		try {
			int result = num1 / num2;
			System.out.println(result);
			
		} catch(ArithmeticException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
