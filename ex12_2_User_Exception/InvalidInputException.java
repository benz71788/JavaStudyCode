package ex12_2_User_Exception;

class InvalidInputException extends Exception{
	
	InvalidInputException(){
		//슈퍼 클래스의 생성자를 호출하여 에러 메세지를 저장한다.
		super("잘못된 입력입니다.");
	}

}
