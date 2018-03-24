package ex13_7;

class ObjectExample {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 30);
		Rectangle r2 = new Rectangle(10, 30);
		
		if(r1.equals(r2)) {
			System.out.println("r1.equals(r2): 같음");
		} else {
			System.out.println("r1.equals(r2): 다름");
		}
		
		if(r1 == r2) {
			System.out.println("r1 == r2 같음");
		} else {
			System.out.println("r1 == r2 다름");
		}
		
		System.out.println(r1.toString());
		System.out.println(r1);
		

	}

}
