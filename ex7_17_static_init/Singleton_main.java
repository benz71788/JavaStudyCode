package ex7_17_static_init;

public class Singleton_main {
	
	public static void main(String[] args) {
		
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		
		if(single1 == single2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
		
	}

}
