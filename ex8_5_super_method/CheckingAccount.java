package ex8_5_super_method;

public class CheckingAccount extends Account{
	
	String cardNo;
	
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo){
		//생성자 첫 줄에서 부모 생성자를 호출하지 않았기 때문에 컴파일러가 부모의 생성자를
		//호출하는 문장인 super();를 여기에 삽입한다.
//		this.accountNo = accountNo;	//상속 받은 필드 초기화
//		this.ownerName = ownerName;	//상속 받은 필드 초기화
//		this.balance = balance;		//상속 받은 필드 초기화
		
		super(accountNo, ownerName, balance);	//파라미터 3개의 슈퍼 클래스
		this.cardNo = cardNo;		//클래스 안에 선언된 필드 초기화
	}
	
	int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo) || (balance < amount)) {
			throw new Exception("지불이 불가능합니다.");
		}
		return withdraw(amount);
	}

}
