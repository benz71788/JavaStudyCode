package ex13_8_clone_4_deepCopy;

public class DeepCopy implements Cloneable{
	
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(10, 20), 2.0);
		Circle c2 = c1.clone();
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		
		c1.p.x = 9;
		c1.p.y = 9;
		c1.r = 4.0;
		
		System.out.println("===== c1의 변경 후 =====");
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
	}

}
