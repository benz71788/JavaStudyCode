package ex13_8_clone_1;

//복제 가능한 클래스로 만들기
//1단계 - Cloneable 인터페이스 구현
//2단계 - clone()메소드 오버라이드 하기

class Rectangle implements Cloneable {
	
	//Cloneable인터페이스가 구현되어 있다는 것은 클래스 작성자가 복제를 허용한다는 의미이다.
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	/*
	 * Object 클래스에 정의된 clone()
	 * protected Object clone() throws CloneNotSupportException;
	 * ==> 오버라이딩시 접근 제어자 변경
	 * (protected => public : 상속관계 없이 다른 클래스에서 호출 할 수 있다.
	 */
	public Object clone() {	//반환형이 Object형 이다.
		try {
			//슈퍼 클래스의 clone메소드를 호출해서 그 결과를 리턴
			return super.clone();
		} 
		//슈퍼 클래스의 clone메소드가 발생하는 익셉션을 처리
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
}
