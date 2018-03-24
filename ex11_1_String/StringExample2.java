package ex11_1_String;

class StringExample2 {
	
	public static void main(String[] args) {
		String str1 = "자바";		//참조변수는 변수명이 달라도 내요물이 같으면 주소값이 같은 곳을 가리킨다.
		String str2 = "자바";
		
		if(str1 == str2) {
			System.out.println("str1 == str2 같음");
		} else {
			System.out.println("str1 == str2 다름");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1.equals(str2) 같음");
		} else {
			System.out.println("str1.equals(str2) 다름");
		}
	}

}
