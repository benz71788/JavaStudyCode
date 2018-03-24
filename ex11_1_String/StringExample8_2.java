package ex11_1_String;

class StringExample8_2 {
	
	public static void main(String[] args) {
		String message = "Hello, Galaxy";
		String message2 = "Helloaa, Apple";
		
		//지정된 문자가 최초로 위치한 인덱스를 구합니다. 존재하지 않는 경우 -1을 리턴한다.
		//문자열 앞에서 부터 차례대로 검색한다.
		int index1 = message.lastIndexOf('a');
		System.out.println("a의 위치는 " + index1);
		
		//아스키코드 97은 소문자 'a'
		int index2 = message.lastIndexOf(97);
		System.out.println("a의 위치는 " + index2);
		
		//아스키코드 65은 대문자 'A'
		int index3 = message.lastIndexOf(65);
		//'A'가 없을 때는 index 값은 -1dmf 반환한다.
		System.out.println("A의 위치는 " + index3);

	}	
}
