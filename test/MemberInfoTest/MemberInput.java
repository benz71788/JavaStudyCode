package test.MemberInfoTest;

import java.util.ArrayList;
import java.util.Scanner;

class MemberInput {
	
	public static void main(String[] args) {
		
		String end = "";
		
		ArrayList<MemberInfo> memberInfo = new ArrayList<MemberInfo>();
		
		Scanner sc = new Scanner(System.in);
		
		while(!(end.equalsIgnoreCase("n"))){
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter your age: ");
			int age = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter your email: ");
			String email = sc.nextLine();
			
			System.out.println("Enter your address: ");
			String address = sc.nextLine();
			
			MemberInfo member = new MemberInfo();
			inputMemberInfo(member, name, age, email, address);
			memberInfo.add(member);
			
			System.out.println("계속 입력하길 원한다면 y, 종료하길 원한다면 n");
			end = sc.nextLine();
		}
		
		printMemberInfo(memberInfo);
		
		sc.close();
	}
	
	static void inputMemberInfo(MemberInfo member, String name, int age, String email, String address) {
		member.setName(name);
		member.setAge(age);
		member.setEmail(email);
		member.setAddress(address);
	}
	
	static void printMemberInfo(ArrayList<MemberInfo> memberInfo) {
		for(int i = 0; i < memberInfo.size(); i++) {
			System.out.println("===== Get(" + i + ") =====");
			System.out.println("Name: " + memberInfo.get(i).getName());
			System.out.println("Age: " + memberInfo.get(i).getAge());
			System.out.println(memberInfo.get(i).getEmail());
			System.out.println(memberInfo.get(i).getAddress());
		}
	}

}
