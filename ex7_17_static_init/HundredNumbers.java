package ex7_17_static_init;

public class HundredNumbers {
	
	static int arr[];
	
	HundredNumbers(){
		System.out.println("여기는 생성자입니다.");
	}
	
	// 클래스 초기화(정적 초기화) 블록
	static {
		System.out.println("클래스 초기화 블럭");
		arr = new int[100];
		for(int cnt = 0; cnt < 100; cnt++) {
			arr[cnt] = cnt;
			System.out.print(arr[cnt] + "\t");
		}
		System.out.println();
	}

}
