package ex11_1_String;

//String 생성자는 각각 별도의 String 객체를 생성하기 때문에 객체 변수의 주소값이 다르다.
public class StringExample3 {
	
	public static void main(String[] args) {
		String str1 = new String("자바");		//객체는 참조변수와 달리 객체명이 바뀌면 내용물이 같아도 서로 다른 주소로 가리킨다. 
		String str2 = new String("자바");
		
		if(str1 == str2) {			// 주소 값을 비교하는 것이기 때문에 다름.
			System.out.println("str1 == str2 같음");
		} else {
			System.out.println("str1 == str2 다름");
		}
		
		if(str1.equals(str2)) {		// 주소 안에 있는 변수 값을 비교하는 것이기 때문에 같음.
			System.out.println("str1.equals(str2) 같음");
		} else {
			System.out.println("str1.equals(str2) 다름");
		}
	}

}
