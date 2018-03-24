package ex7_0_object;

public class Saram4 {
	
	// 필드(멤버변수)
		String name;
		double w;
		double ki;
		int age;
		
		// 생성자
		Saram4(String name2, double w2){
			name = name2;
			w = w2;
		}
		
		// 메서드
		public void eat() {
			System.out.println(name + ", 밥을 먹는다.");
		}
		
		public void walk() {
			System.out.println("걷기 전 몸무게는 " + w + "입니다.");
		}
		
		public void sesu() {
			System.out.println(name + ", 세수한다.");
		}

}
