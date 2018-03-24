package ex14_1_Wrapper;

public class Wrapper7_auto_boxing {
	
	public static void main(String[] args0) {
		printDouble(new Double(123.45));
		
		//double 타입의 값을 가지고 Double타입 인자를 받는 메소드를 호출한다.
		printDouble(123.45);
	}
	
	//자동(오토) Boxing
	static void printDouble(Double obj) {
		System.out.println("obj = " + obj);
		System.out.println("obj.toString() = " + obj.toString());
	}

}
