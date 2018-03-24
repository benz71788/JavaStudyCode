package ex13_8_clone_2;

class ObjectExample2 {
	
	public static void main(String[] args) {
		//객체 생성한다.
		Rectangle obj1 = new Rectangle(10, 20);
		
		//clone 메서드로 객체를 복제한다.)
		Rectangle obj2 = obj1.clone();
		
		//원본 객체와 복제 객체의 값을 출력한다.
		System.out.println("obj1 = " + obj1.width + " x " + obj1.height);
		System.out.println("obj2 = " + obj2.width + " x " + obj2.height);
		
		obj1.height = 100; obj1.width = 200;
		System.out.println("obj1 = " + obj1.width + " x " + obj1.height);
		System.out.println("obj2 = " + obj2.width + " x " + obj2.height);
	}

}
