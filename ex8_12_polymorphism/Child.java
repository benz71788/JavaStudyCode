package ex8_12_polymorphism;

public class Child extends Parent{
	
	public String message = "Child";
	
	public void childPrn() {
		System.out.println("Sub Class: childPrn �޼���");
	}
	
	@Override
	public void parentPrn() {
		System.out.println("Sub Class: parentPrn �޼���");
	}

}
