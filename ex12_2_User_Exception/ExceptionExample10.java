package ex12_2_User_Exception;

class ExceptionExample10 {
	
	public static void main(String[] args) {
		try {
			int result = subtract(5, 100);
			System.out.println(result);
		} catch(InvalidInputException e) {
			System.err.println(e.getMessage());
		}
	}
	
	static int subtract(int a, int b) throws InvalidInputException{
		if(a < b) {
			throw new InvalidInputException();
		}
		int result = a - b;
		return result;
	}

}
