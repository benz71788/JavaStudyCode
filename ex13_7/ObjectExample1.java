package ex13_7;

class ObjectExample1 {
	
	public static void main(String[] args) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1.equals(obj2): 같음");
		} else {
			System.out.println("obj1.equals(obj2): 다름");
		}
		
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2 : 같음");
		} else {
			System.out.println("obj1 == obj2 : 다름");
		}
		
		System.out.println("========================");
		
		Circle2 obj3 = new Circle2(5);
		Circle2 obj4 = new Circle2(5);
		
		if(obj3.equals(obj4)) {
			System.out.println("obj1.equals(obj2): 같음");
		} else {
			System.out.println("obj1.equals(obj2): 다름");
		}
		
		if(obj3 == obj4) {
			System.out.println("obj1 == obj2 : 같음");
		} else {
			System.out.println("obj1 == obj2 : 다름");
		}
		
		System.out.println("========================");
		
		GoodsStock gs = new GoodsStock("12345", 100);
		if(obj1.equals(gs)) {
			System.out.println("obj1.equals(gs) : 같음");
		} else {
			System.out.println("obj1.equals(gs) : 다름");
		}

	}

}
