package ex7_13_static_field1;

public class StaticFieldExample1 {
	
	public static void main(String[] args) {
		
		System.out.println("�������� grandTotal = " + Accumulator.grandTotal);
		
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(10);
		obj2.accumulate(20);
		System.out.println("obj1 total = " + obj1.total);
//		System.out.println("obj1 grandTotal = " + obj1.grandTotal);
		
		System.out.println("obj2 total = " + obj2.total);
//		System.out.println("obj2 grandTotal = " + obj2.grandTotal);
		
		//�������� ���� : Ŭ������.��������
		System.out.println("obj1 grandTotal = " + Accumulator.grandTotal);
		System.out.println("obj2 grandTotal = " + Accumulator.grandTotal);
	}

}
