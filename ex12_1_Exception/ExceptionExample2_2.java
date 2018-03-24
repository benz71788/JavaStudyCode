package ex12_1_Exception;

class ExceptionExample2_2 {
	
	public static void main(String[] args) {
		int num1 = 3, num2 = 0;
		
		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch(ArithmeticException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.err.println(message);
		} finally {
			System.out.println("여가까지 왔어요~");
		}
	}

}
