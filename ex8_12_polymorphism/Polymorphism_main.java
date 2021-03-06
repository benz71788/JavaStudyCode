package ex8_12_polymorphism;

public class Polymorphism_main {
	
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("-----Child c = new Child();-----");
		c.parentPrn();
		c.childPrn();
		System.out.println("c.message = " + c.message);
		
		System.out.println("--------------------------------");
		
		Parent p;
		p = c;	// Praent p = new Child();
		
		System.out.println("-----Parent p = new Child(); 업캐팅 후------");
		
		//다형성 적용 후에는 부모로부터 상속받은 메서드만 호출할 수 있다.
		//동적 바인딩 적용 - 오버라이딩된 메서드를 호출할 경우 컴파일 시에는 단지 문법적으로
		//타입 에러만 체크하고 프로그램 동작 중에 객체의 타입이 결정되어 호출된 오버라이딩 메서드가
		//부모 클래서의 메서드인지 자식 클래스인지 판단하여 동작하게 된다.
		//부모 Parent에 parentPrn()이 존재하기 때문에 컴파일 에러는 없습니다.
		//parentPrn()는 오버라이딩된 메서드이고 객체의 타입이 Child이기 때문에
		//Child의 parentPrn()를 실행하게 된다.
		p.parentPrn();
		
		//p.childPrn(); //컴파일 에러가 발생하게 된다.
		//참조 변수의 자료형 Parent 클래스에는 childPrn()메소드가 없기 때문
		
		//다형성 적용 후 필드는 부모의 필드값을 출력
		//정적 바인딩 적용 - 객체의 타입이 컴파일러에 의해 컴파일 되는 시점에 결정되는 것을
		//private, final, static 메서드, 인스턴스 변수 등이 해당된다.
		//부모 클래스의 필드에 주석을 달면 에러 발생
		System.out.println("p.message = " + p.message);
		
		Parent p1 = new Parent();
		
		p1.parentPrn();
	}

}
