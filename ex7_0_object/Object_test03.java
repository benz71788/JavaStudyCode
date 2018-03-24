package ex7_0_object;

public class Object_test03 {
	
	public static void main(String[] args) {
		
		Family fa = new Family("Father", 57);
		fa.weight = 70;
		fa.height = 174;
		fa.hobby = "Fishing";
		
		fa.basicInfo();
		fa.healtyInfo();
		fa.hobbyInfo();
		
		System.out.println("\n=====================\n");
		
		Family ma = new Family("Mather", 55);
		ma.weight = 52;
		ma.height = 158;
		ma.hobby = "Climbing";
		
		ma.basicInfo();
		ma.healtyInfo();
		ma.hobbyInfo();
		
		System.out.println("\n=====================\n");
		
		Family sis = new Family("Sister", 27);
		sis.weight = 55;
		sis.height = 160;
		sis.hobby = "Yoga";
		
		sis.basicInfo();
		sis.healtyInfo();
		sis.hobbyInfo();
	}

}
