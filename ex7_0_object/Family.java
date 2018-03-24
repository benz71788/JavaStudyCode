package ex7_0_object;

public class Family {
	
	String name;
	int age;
	int weight;
	int height;
	String hobby;
	
	public Family(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void basicInfo() {
		System.out.println(name + "는 " + age + "세입니다.");
	}
	
	public void healtyInfo() {
		System.out.println("몸무게는 " + weight +"이며, 키는 " + height + "입니다.");
	}
	
	public void hobbyInfo() {
		System.out.println(name + "의 취미는 " + hobby + "입니다.");
	}

}
