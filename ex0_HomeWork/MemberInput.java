package ex0_HomeWork;

import java.util.Scanner;
import java.util.ArrayList;

public class MemberInput {
	
	public static void main(String[] args) {
		ArrayList<MemberInfo> list = new ArrayList<MemberInfo>();
		input(list);
		printAll(list);
	}

	static void input(ArrayList<MemberInfo> list) {
		String yn="";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("성명을 입력하세요? ");
			String name = sc.nextLine();

			System.out.print("나이를 입력하세요? ");
			int age = Integer.parseInt(sc.nextLine());

			System.out.print("E-Mail을 입력하세요? ");
			String email = sc.nextLine();

			System.out.print("주소를 입력하세요? ");
			String address = sc.nextLine();

			MemberInfo m = new MemberInfo();
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			list.add(m);

			do {
			  System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			  yn = sc.nextLine();
			}while(!yn.equals("y") && !yn.equals("n"));

		} while (yn.equals("y") && !yn.equals("n"));
		sc.close();
	}

	public static void printAll(ArrayList<MemberInfo> list) {
		MemberInfo mm;
		System.out.println("===== 출력 합니다. =====");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("===get(" + i + ")번째 사람 명단" + "===");
			mm = list.get(i);
			System.out.println("성명:" + mm.getName());
			System.out.println("나이:" + mm.getAge());
			System.out.println("E-Mail:" + mm.getEmail());
			System.out.println("주소:" + mm.getAddress());
		}
	}

}
