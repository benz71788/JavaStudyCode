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
		System.out.println(name + "�� " + age + "���Դϴ�.");
	}
	
	public void healtyInfo() {
		System.out.println("�����Դ� " + weight +"�̸�, Ű�� " + height + "�Դϴ�.");
	}
	
	public void hobbyInfo() {
		System.out.println(name + "�� ��̴� " + hobby + "�Դϴ�.");
	}

}
