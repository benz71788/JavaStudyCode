package ex12_1_Exception;

class ExceptionExample1_1 {
	
	public static void main(String[] args) {
		int sum = 1 + -2;
		try {
			if(sum < 0) {
				throw new Exception("���� �߻�");
			}
			System.out.println(sum);
		} catch(Exception e) {
			String str= e.getMessage();
			System.err.println(str);
		}
	}

}
