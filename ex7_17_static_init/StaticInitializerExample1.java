package ex7_17_static_init;

public class StaticInitializerExample1 {
	
	public static void main(String[] args) {
		
		System.out.println("main 실행시작");
		
		System.out.println(HundredNumbers.arr[35]);
		System.out.println(HundredNumbers.arr[27]);
		System.out.println(HundredNumbers.arr[63]);
		
		HundredNumbers hn = new HundredNumbers();
	}
	
	
}
