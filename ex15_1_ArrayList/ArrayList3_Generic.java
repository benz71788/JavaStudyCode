package ex15_1_ArrayList;

import java.util.ArrayList;

/*
 * - 지네릭스(Generics) jdk 1.5에서 처음 도입
 * 	 다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스에 컴파일 시의 타입체크를
 * 	 해주는 기능이다.
 * - 클래스 옆에 꺽쇠(<>)기호를 이용해서 만든다.
 * - <>안에 특정 자료형(Wrapper 클래스, String, 사용자 정의 클래스형)을 넣어주면 된다
 * - 사용 예)
 * 		List<String>		list = new ArrayList<String>();
 * 		ArrayList<String>	list = new ArrayList<String>();
 * 		ArrayList<Integer>	list = new ArrayList<Integer>();
 * 		ArrayList<Double>	list = new ArrayList<Double>();
 * 		ArrayList<MemberInput>	list = new ArrayList<MemberInput>();
 */
public class ArrayList3_Generic {
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
