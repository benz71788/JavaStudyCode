package ex8_14_2_interface;

public class InterfaceExample {
	
	public static void main(String[] args) {
		SeparateVolume obj1 = 
				new SeparateVolume("864ㅂ774개", "개미", "베르베르");
		
		obj1.checkOut("SEONGHEE LEE", "2018-02-19");
		obj1.checkIn();
	
		System.out.println("-------------------");
		
		AppCDInfo appCD =
				new AppCDInfo("2005-7001", "GOOD LUCK");
		
		appCD.checkOut("SEONGHEE LEE","2018-02-18");
		appCD.checkIn();
	}

}
