package ex7_12_overload_call;

public class PhysicalInfo_call {
	
	public static void main(String[] args) {
		
		PhysicalInfo obj = new PhysicalInfo("Shane", 29, 178.0f, 70.0f);
		
		PhysicalInfo_call pc = new PhysicalInfo_call();
		
		pc.printPhysicalInfo(obj);
		
		obj.update(30);
		pc.printPhysicalInfo(obj);
		
		obj.update(31, 178.5f);
		pc.printPhysicalInfo(obj);
		
		obj.update(32, 178.5f, 70.5f);
		pc.printPhysicalInfo(obj);

	}
	
	void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("NAME: " + obj.name);
		System.out.println("AGE: " + obj.age);
		System.out.println("HEIGHT: " + obj.height);
		System.out.println("WEIGHT: " + obj.weight);
		System.out.println();
	}

}
