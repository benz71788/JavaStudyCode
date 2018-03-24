package ex19_6_serialVersionUID_no;

//기존 사각형 클래스에 메소들 추가한 경우
//에러 발생 : 직렬화할 때 사용한 클래스와
//역직렬화할 때 사용한 클래스의 버전이 다르기 때문
class Rectangle implements java.io.Serializable{
	
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	/*
	 * 실행방법
	 * 1. 아래 getArea 메소드의 주석을 달고 실행한 경우에는 에러 없음.
	 * 		ObjectOutputExample.java를 실행
	 * 		ObjectInputExample.java.를 실행
	 * 
	 * 2. 아래 메소드의 주석을 푼후 - 에러발생
	 * 		ObjectInputExample.java를 실행
	 * 	
	 * 	ex19_6_serialVersionUID_no.Rectangle;
	 * 	local class incompatible; // 클래스가 호환되지 않는다.
	 *	//스트림을 통해 읽어들인 파일 안에 기록되어 있는 버전 번호
	 *	stream classdesc serialVersionUID = -3177450505124451093,
	 *	//역직렬화 프로그램 
	 *	local class serialVersionUID = -6756196667506680241
	 * 	serialVersionUID는 같은 클래스임을 알려주는 식별자 역학을 하며
	 * 	Serializable 인터페이스를 구현한 클래스를 컴파일하면 자동적으로
	 * 	serialVersionUID 정적 필드가 추가된다.
	 * 	
	 * 	이전 버전 번호는 자바의 직렬화 메커니즘과 역직렬화 메커니즘이 실행될 때
	 * 	자동으로 부여되는데 직렬화 가능 클래스의 내용이 그대로이며 같은 번호가 부여되고
	 * 	클래스의 구성요소가 하나라도 바뀌면 완전히 다른 버전 번호가 부여된다.
	 * 
	 * 	하지만 명시적으로 클래스에 serialVersionUID가 선언되어 있으면
	 * 	컴파일 시 추가 되지 않기 때문에 동일한 값을 유지할 수 있다.
	 */
	
	int getArea() {
		return width * height;
	}

}
