package ex12_2_User_Exception;

class InvalidInputException extends Exception{
	
	InvalidInputException(){
		//���� Ŭ������ �����ڸ� ȣ���Ͽ� ���� �޼����� �����Ѵ�.
		super("�߸��� �Է��Դϴ�.");
	}

}
