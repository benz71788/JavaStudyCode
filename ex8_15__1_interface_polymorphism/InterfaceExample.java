package ex8_15__1_interface_polymorphism;

public class InterfaceExample {
	
	public static void main(String[] args) {
		
//		Lendable arr0, arr1, arr2;
//		
//		arr0 = new SeparateVolume("883ㅇ", "푸코의 진자", "에코");
//		arr1 = new SeparateVolume("609.2", "서양미술사", "곰브리치");
//		arr2 = new AppCDInfo("02-17", "XML을 위한 자바 프로그래밍");
//		
//		checkOutAll(arr0, "이성희", "20180201");
//		checkOutAll(arr1, "이성희", "20180201");
//		checkOutAll(arr2, "이성희", "20180201");
		
		Lendable[] arr = new Lendable[3];
		
		arr[0] = new SeparateVolume("883ㅇ", "푸코의 진자", "에코");
		arr[1] = new SeparateVolume("609.2", "서양미술사", "곰브리치");
		arr[2] = new AppCDInfo("02-17", "XML을 위한 자바 프로그래밍");
		
		checkOutAll(arr, "이성희", "20180201");

	}
	
	//자바 컴파일러는 컴파일 할 때 변수의 타입만 보고 메소드나
	//필드의 존재 여부를 체크하기 때문에
	//Lendable 인터페이스에 chectOut메소드가 있어야 컴파일 에러가 없습니다.
	static void checkOutAll(Lendable[] arr, String borrower, String date) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i++) {
			arr[i].checkOut(borrower, date);
			arr[i].checkIn();
			System.out.println("=====================================\n");
		}
	}

}
