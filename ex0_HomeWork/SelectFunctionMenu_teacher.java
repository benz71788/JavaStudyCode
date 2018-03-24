package ex0_HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectFunctionMenu_teacher {
	
	public static void main(String[] args) {
		ArrayList<MemberInfo> list = new ArrayList<MemberInfo>();
		Scanner sc = new Scanner(System.in);
		do {
			menu();

			String select = sc.nextLine();

			// �������� �Ǵ��ϴ� �޼��� ȣ��
			// ���ڰ� �ƴϸ� �ٽ� �޴� ȣ���մϴ�.
			if (!isNumber(select)) {
				System.out.println("�ݵ�� ���� �Է��ϼ���.");
			} else {
				int selector = Integer.parseInt(select);
				switch (selector) {
				case 1: // �Է��մϴ�.
					input(list, sc);
					break;
				case 2: // �˻��մϴ�.
					search(list, sc);
					break;
				case 3: // �����մϴ�.
					update(list, sc);
					break;
				case 4 :
					delete(list, sc);
					break;
				case 5: // ����մϴ�.
					printAll(list);
					break;
				case 6: // �����մϴ�.
					System.out.println("�����մϴ�.");
					sc.close();
					return;
				default:
					System.out.println("1 , 2, 3, 4, 5, 6 �߿� �� ���� ���ڸ� �Է��ϼ���");
				}
			}
			System.out.println();
		} while (true);

	}

	static void menu() {
		System.out.println("���� �� �����ϼ���(�ݵ�� ���� �Է�)");
		System.out.println("1. �Է�");
		System.out.println("2. �˻�");
		System.out.println("3. ����");
		System.out.println("4. ����");
		System.out.println("5. ���");
		System.out.println("6. ����");
		System.out.println("==>");
	}

	static int titlePrint(Scanner sc, int menu) {
		String[] menuname = { "�˻�", "����", "����" };
		String[] itemname = { "����", "����", "E-Mail", "�ּ�" };
		int search;
		do {
			System.out.println("=== " + menuname[menu - 2] + "�� �׸��� �����ϼ��� ===");
			/*
			 * System.out.println("1. ����"); System.out.println("2. ����");
			 * System.out.println("3. E-Mail"); System.out.println("4. �ּ�");
			 */
			for (int i = 0; i < itemname.length; i++) {
				System.out.println((i+1) + ". " + itemname[i]);
			}
			System.out.print("==>");
			String input = sc.nextLine();
			if (isNumber(input)) { // ������ ���ڿ��� ���
				search = Integer.parseInt(input);
				if (search < 1 || search > 4) {
					System.out.println("1~4������ ���ڸ� �Է��ϼ���");
					continue; // �ٽ� �ݺ��մϴ�.
				}
				break; // �ݺ��� ����ϴ�.
			} else // ������ ���ڿ��� �ƴ� ���
				System.out.println("�˻��� �׸��� ���ڷ� �Է��ϼ���");
		} while (true);
		return search;
	}

	static void search(ArrayList<MemberInfo> list, Scanner sc) {
		int selectItem = titlePrint(sc, 2);
		String[] itemname = { "����", "����", "E-Mail", "�ּ�" };
		System.out.println(itemname[selectItem - 1] + "��(��) �Է��ϼ���");

		String searchdata = sc.nextLine();
		if (selectItem == 2) { // �˻� �׸��� "����"�϶�
			while (!isNumber(searchdata)) {
				System.out.println("���̴� ���ڷ� �Է��ϼ���");
				searchdata = sc.nextLine();
			}
		}
		int count = 0, ok = 0;

		for (MemberInfo a : list) {
			ok = search_each(a, searchdata, selectItem);
			if (ok != 0) { // �˻��� �����Ͱ� �ִ� ���
				count++;
				System.out.println("\n=====�˻��� " + count + "° ������ �Դϴ�.=====");
				print(a);
			}
		} // for
		if (count == 0)
			System.out.println("*****�˻��� �����Ͱ� �����ϴ�.*****");
	}

	static int search_each(MemberInfo a, String searchdata, int searchItem) {
		int ok = 0;
		String membergetdata = "";
		switch (searchItem) {
		case 1:
			membergetdata = a.getName();
			break;
		case 2:
			membergetdata = Integer.toString(a.getAge());
			break;
		case 3:
			membergetdata = a.getEmail();
			break;
		case 4:
			membergetdata = a.getAddress();
			break;
		}

		if (membergetdata.equals(searchdata)) {
			ok++;
		}
		return ok;
	}

	static void update(ArrayList<MemberInfo> list, Scanner sc) {
		int selectItem = titlePrint(sc, 3);
		String[] itemname = { "����", "����", "E-Mail", "�ּ�" };
		int count = 0;
		System.out.println("���� �� " + itemname[selectItem - 1] + "��(��) �Է��ϼ���");
		String before = sc.nextLine();
		if (selectItem == 2) {
			while (!isNumber(before)) {
				System.out.println("���̴� ���ڷ� �Է��ϼ���");
				before = sc.nextLine();
			}
		}
		for (int i = 0; i < list.size(); i++) {
			MemberInfo a = list.get(i);

			int ok=search_each(a, before, selectItem);

			if (ok !=0 ) {
				System.out.println("���� �� " + itemname[selectItem - 1] + "��(��) �Է��ϼ���");
				String after = sc.nextLine();
				if (selectItem == 2) {
					while (!isNumber(after)) {
						System.out.println("���̴� ���ڷ� �Է��ϼ���");
						after = sc.nextLine();
					}
				}
				switch (selectItem) {
				case 1:
					a.setName(after);
					break;
				case 2:
					a.setAge(Integer.parseInt(after));
					break;
				case 3:
					a.setEmail(after);
					break;
				case 4:
					a.setAddress(after);
				}
                count++;
				System.out.println("***���������� �����Ǿ����ϴ�.***");
				print(a);
			}
		} // for
		if (count == 0)
			System.out.println("***������  �����Ͱ� �����ϴ�.***");
	}// update

	static boolean isNumber(String input) {
		if(input==null || input.equals("")) 
			return false;
		
	    for(int i=0; i< input.length();i++) 
	     { 
	    	char ch = input.charAt(i);
	        if(ch < '0' || ch > '9') 
	         { return false; } 
	     } // for end
	    return true;
	}

	static void input(ArrayList<MemberInfo> list, Scanner sc) {
		do {
			System.out.println("������ �Է��ϼ���? ");
			String name = sc.nextLine();
			int age;
			do {
				System.out.println("���̸� �Է��ϼ���? ");
				// ���̸� ���ڷ� ������ ���ڿ��� �ƴ� ��� ������ �߻��ϴ� parseInt()�޼��带 �̿��ؼ�
				// ���������� �Ǻ��մϴ�.
				try {
					age = Integer.parseInt(sc.nextLine());
					break; // 1�� �ݺ��� ����ϴ�.
				} catch (NumberFormatException e) {
					System.out.println("���̴� ���ڸ� �Է��ϼž� �մϴ�.");
				}
			} while (true); // 1

			System.out.println("E-Mail�� �Է��ϼ���? ");
			String email = sc.nextLine();

			System.out.println("�ּҸ� �Է��ϼ���? ");
			String address = sc.nextLine();

			MemberInfo m = new MemberInfo();
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			list.add(m);

			do {
				System.out.println("����ҷ��� y, ������� n�� �Է�?");
				String yn = sc.nextLine();
				if (yn.equals("y")) {
					break; // 1�� �ݺ��� ����ϴ�.
				} else if (yn.equals("n")) {
					return;// input()�޼��� �����ϴ�.
				}
			} while (true); // 1
		} while (true); // 2

	}

	static void delete(ArrayList<MemberInfo> list, Scanner sc ){
		int selectItem = titlePrint(sc, 2);
		String[] itemname = { "����", "����", "E-Mail", "�ּ�" };
		System.out.println(itemname[selectItem - 1] + "��(��) �Է��ϼ���");
		String searchdata = sc.nextLine();
		if (selectItem == 2) { // �˻� �׸��� "����"�϶�
			while (!isNumber(searchdata)) {
				System.out.println("���̴� ���ڷ� �Է��ϼ���");
				searchdata = sc.nextLine();
			}
		}
		int count=0;
		for(int i=list.size()-1; i>=0; i--){
			MemberInfo a = list.get(i);
			int ok = search_each(a, searchdata, selectItem);
			if(ok != 0){
				list.remove(i);
				System.out.println("***���������� ���� �߽��ϴ�.***");
				print(a);
				count++;
			}
		}//for
		
		if(count==0)
			System.out.println("***������ �����Ͱ� �����ϴ�.***");
		}//delete
	
	public static void printAll(ArrayList<MemberInfo> list) {
		MemberInfo mm;
		if (list.size() == 0) {
			System.out.println("===== ����� �����Ͱ� �����ϴ�. =====");
		} else {
			System.out.println("===== ��� �մϴ�. =====");
			for (int i = 0; i < list.size(); i++) {
				System.out.println("===get(" + i + ")��° ��� ���" + "===");
				mm = list.get(i);
				/*System.out.println("����:" + mm.getName());
				System.out.println("����:" + mm.getAge());
				System.out.println("E-Mail:" + mm.getEmail());
				System.out.println("�ּ�:" + mm.getAddress());*/
				print(mm);
			}
		}
	}

	public static void print(MemberInfo m) {
		System.out.println("����:" + m.getName());
		System.out.println("����:" + m.getAge());
		System.out.println("E-Mail:" + m.getEmail());
		System.out.println("�ּ�:" + m.getAddress());
	}

}
