package ex7_17_static_init;

public class Singleton {
	
	//클래스 자신의 타입으로 정적 필드 선언
		// -> 자신의 객체를 생성해 초기화
		// -> private 접근 제한자 붙여 외부에서 필드 값 변경 불가하도록
	private static Singleton single = new Singleton();	//필드 single은 외부에서 사용 못합니다.
		
	//외부에서 new연산자로 생성자를 호출할 수 없도록 막기
	// -> private 접근 제한자를 생성자 앞에 붙임
	private Singleton() {
		System.out.println("여기는 Singleton 생성자 입니다.");
	}
	
	//외부에서 호출할 수 있는 정적메소드인 getinstance() 선언
	// -> 정적 필드에서 참조하고 있는 자신의 객체 리턴
	public static Singleton getInstance() {
		System.out.println("여기는 getInstance입니다.");
		
		return single;
	}

}
