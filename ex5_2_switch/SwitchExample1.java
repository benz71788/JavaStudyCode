package ex5_2_switch;

public class SwitchExample1 {
	
	public static void main(String[] args) {
		
		int num = 3;
		
		switch(num) {
		case 1:
			System.out.println("Good Morning, Java");
			break;
		case 2:
			System.out.println("Good afternoon, Java");
			break;
		case 3:
			System.out.println("Good evening, Java");
			break;
		default :
			System.out.println("Hello, Java");
			break;
		}
		System.out.println("Done.");
	}

}
