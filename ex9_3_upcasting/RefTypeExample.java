//obj 변수의 타입이 Account이기 때문에 에러 발생
package ex9_3_upcasting;

public class RefTypeExample {
	
	public static void main(String[] args) {
		Account obj1 =
				new CheckingAccount("111-22-333333", "홍길동", 10, "4444-5555-6666-7777");
		
		CheckingAccount obj = (CheckingAccount) obj1; //
		
		try {
			int amount = obj.pay("4444-5555-6666-7777", 47000);
			System.out.println("인출액: " + amount);
			System.out.println("카드번호: " + obj.cardNo);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
