package test.UnderstandOfOOP;

public class MouseDriver2 {
	
	public static void main(String[] args) {
		Mouse2.countOfTail = 1;
		
		Mouse2 mickey = new Mouse2();
		Mouse2 jerry = new Mouse2();
		Mouse2 mightyMouse = new Mouse2();
		
		System.out.println(mickey.countOfTail);
		System.out.println(jerry.countOfTail);
		System.out.println(mightyMouse.countOfTail);
		
		System.out.println(Mouse2.countOfTail);
	}

}
