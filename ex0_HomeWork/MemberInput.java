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
			System.out.print("������ �Է��ϼ���? ");
			String name = sc.nextLine();

			System.out.print("���̸� �Է��ϼ���? ");
			int age = Integer.parseInt(sc.nextLine());

			System.out.print("E-Mail�� �Է��ϼ���? ");
			String email = sc.nextLine();

			System.out.print("�ּҸ� �Է��ϼ���? ");
			String address = sc.nextLine();

			MemberInfo m = new MemberInfo();
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			list.add(m);

			do {
			  System.out.print("����ҷ��� y, ������� n�� �Է�?");
			  yn = sc.nextLine();
			}while(!yn.equals("y") && !yn.equals("n"));

		} while (yn.equals("y") && !yn.equals("n"));
		sc.close();
	}

	public static void printAll(ArrayList<MemberInfo> list) {
		MemberInfo mm;
		System.out.println("===== ��� �մϴ�. =====");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("===get(" + i + ")��° ��� ���" + "===");
			mm = list.get(i);
			System.out.println("����:" + mm.getName());
			System.out.println("����:" + mm.getAge());
			System.out.println("E-Mail:" + mm.getEmail());
			System.out.println("�ּ�:" + mm.getAddress());
		}
	}

}
