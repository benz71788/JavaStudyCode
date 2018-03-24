package ex7_12_overload_call;

public class PhysicalInfo {
	
	String name;
	int age;
	float height;
	float weight;
	
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void update(int age) {
		this.age = age;
	}
	
	public void update(int age, float height) {
		this.age = age;
		this.height = height;
	}
	
	public void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

}
