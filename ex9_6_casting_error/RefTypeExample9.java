package ex9_6_casting_error;

public class RefTypeExample9 {
	
	public static void main(String[] args) {
		
		Account obj = new Account("111-22-333333", "홍길동", 100000);
		
		//obj를 CheckingAccount로 캐스트 가능한 여부 확인
		if(obj instanceof CheckingAccount) {
			//obj를 CheckingAccount로 캐스트할 수 있을 때만 pay메서드 호출
			pay((CheckingAccount) obj);
		} else {
			//obj를 CheckingAccount로 캐스트할 수 없을 경우
			System.out.println("캐스트할 수 없는 타입니다.");
		}
		
	}
	
	static void pay(CheckingAccount obj) {
		try {
			int amount = obj.pay("4444-5555-6666-7777", 47000);
			System.out.println("인출액: " + amount);
			System.out.println("카드번호: " + obj.cardNo);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
