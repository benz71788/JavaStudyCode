package ex7_0_object;

public class Saram3 {
	
	// 필드(멤버변수)
	String name;
	double w;
	double ki;
	int age;
	
	// 생성자
	Saram3(String name2){
		name = name2;
	}
	
	// 메서드
	public void eat() {
		System.out.println(name + ", 밥을 먹는다.");
	}
	
	public void walk() {
		System.out.println(name + ", 걷는다.");
	}
	
	public void sesu() {
		System.out.println(name + ", 세수한다.");
	}
	
}
