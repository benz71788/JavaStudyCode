package ex7_0_object;

public class ObjectExample1 {
	
	public static void main(String[] args) {
		
		StringBuffer obj;						//변수 선언
		obj = new StringBuffer("Hey, Java");	//객체 생성
		obj.deleteCharAt(1);					//Hy, Java
		obj.deleteCharAt(1);					//H, Java
		obj.insert(1, 'i');						//Hi, Java
		System.out.println(obj);				//StringBuffer 객체를 넘겨 줄 수 있다.
		
		StringBuffer obj2 = new StringBuffer("Hello, Shane");
		obj2.deleteCharAt(1);					//Hllo, Shane
		obj2.deleteCharAt(1);					//Hlo, Shane
		obj2.deleteCharAt(1);					//Ho, Shane
		obj2.deleteCharAt(1);					//H, Shane
		obj2.insert(1, "i");					//Hi, Shane
		System.out.println(obj2);
	}

}
