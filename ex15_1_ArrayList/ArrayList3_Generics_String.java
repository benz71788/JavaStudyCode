package ex15_1_ArrayList;

import java.util.ArrayList;

/*
 * List 인터페이스 - ArrayList(상속받는 클래스)
 * 	1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
 * 		ex) int, double, char, boolean, String etc
 * 	2. 입력한 순서대로 출력된다.(index번호 순으로 저장됨)
 * 	3. 중복된 Data를 저장 할 수 있다
 * 	4. 배열의 장점과 배열에서 사용할 수 없는 것을 사용할 수 있다.
 * 	5. 동적인 저장 구조를 이용할 수 있다.
 */
class ArrayList3_Generics_String {
	
	public static void main(String[] args) {
		//ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();		
		
		//list에 3개의 데이터를 추가
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		
		int num = list.size();	//list에 있는 데이터의 수를 구하는 메소드
		
		//list에 있는 데이터의 수만큼 반복하면서 데이터를 가져와서 출력
		for(int cnt = 0; cnt < num; cnt++) {
			//get(index)메소드를 사용하여 index위치에 있는 자료를 가져온다.
			String str = list.get(cnt);
			/*
			 * get(i)이 반환형이 Object형이지만 Generic으로 선언했기 때문에
			 * (String)을 생략할 수 있다.
			 * temp = (String)vec.get(i);
			 * Generic을 사용하지 않을 경우에는 변환형을 명시적으로 선언해야 한다.
			 */
			System.out.println(str);
		}
		
		System.out.println("===== 향상된 for 문 =====");
		for(String str : list) {
			System.out.println(str);
		}
	}
}
