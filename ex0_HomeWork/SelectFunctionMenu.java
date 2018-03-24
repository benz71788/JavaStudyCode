package ex0_HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectFunctionMenu {

	public static void main(String[] args) {

		ArrayList<MemberInfo> list = new ArrayList<MemberInfo>();

		Scanner sc = new Scanner(System.in);

		do {
			menu(); //�޴� ����ϴ� �޼��� ȣ��
			String select = sc.nextLine();
			// ���ڰ� �ƴϸ� �ٽ� �޴� ȣ���մϴ�.
			if (!isNumber(select)) {
				System.out.println("�ݵ�� ���� �Է��ϼ���.");
			} else {
				int selector = Integer.parseInt(select);
				switch (selector) {
				case 1:  //�Է��մϴ�.
					input(list, sc);
					break;
				case 2:	 //�˻��մϴ�.
					search(list, sc);
					break;
				case 3:
					update(list, sc);
					break;
				case 4:
					delete(list, sc);
					break;
				case 5:  //����մϴ�.
					printAll(list);
					break;
				case 6: //�����մϴ�.
					System.out.println("�����մϴ�.");
					sc.close();
					return;
				default:
					System.out.println("1 �Ǵ� 5 �Ǵ� 6�� ���ڸ� �Է��ϼ���");
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
	    	System.out.println("=>");
	}
	
	static boolean isNumber(String select) {
	    	char[] num = new char[127];
	    	for(int i = 0; i < num.length; i++) {
	    		num[i] = (char) (i + 1);
	    	}   
	    	try {
	    		if((num[48] <= select.charAt(0) && num[57] >= select.charAt(0)) 
	    				&& (select.length() == 1)){
		    		return true;
		    	} else {
		    		return false;
		    	}
	    	} catch(Exception e){
	    		return false;
	    	}
	}

	static void input(ArrayList<MemberInfo> list, Scanner sc) {
		String age = "", end = "";
		int ageInt;
		while(!(end.equalsIgnoreCase("n"))) {
			System.out.println("������ �Է��ϼ���?");
		    	String name = sc.nextLine();
		    	do {
		    		System.out.println("���̸� �Է��ϼ���?");
		    		age = sc.nextLine();
		    		try {
		    			ageInt = Integer.parseInt(age);
	    				break;
		    		} catch(Exception e) {
		    			System.out.println("���̴� ���ڸ� �Է��ϼž� �մϴ�.");
		    		}
		    	} while(true);
		    	System.out.println("E-Mail�� �Է��ϼ���?");
		    	String email = sc.nextLine();
		    	System.out.println("�ּҸ� �Է��ϼ���?");
		    	String address = sc.nextLine();
		    
		    	MemberInfo memberInfo = new MemberInfo();
		    	memberInfo.setName(name);
		    	memberInfo.setAge(ageInt);
		    	memberInfo.setEmail(email);
		    	memberInfo.setAddress(address);
		    	list.add(memberInfo);
		    do {
			    	System.out.println("����ҷ��� y, ������� n�� �Է�?");
			    	end = sc.nextLine();
		    } while(!(end.equalsIgnoreCase("y")) && !(end.equalsIgnoreCase("n")));
		}
	}
	
	static void infoMenu() {
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. E-Mail");
		System.out.println("4. �ּ�");
		System.out.println("5. �޴��� ���ư���");
		System.out.println("==>");
		
	}

	static void search(ArrayList<MemberInfo> list, Scanner sc) {
		String numStr;
		do {
			System.out.println("===�˻��� �׸��� �����ϼ���===");
			infoMenu();
			numStr = sc.nextLine();
			try {
				int num = Integer.parseInt(numStr);
				switch(num) {
				case 1:
					System.out.println("������ �Է��ϼ���:");
					String sName = sc.nextLine();
					isEqualsMember(list, sName);
					break;
				case 2:
					System.out.println("���̸� �Է��ϼ���:");
					Integer sAge = Integer.parseInt(sc.nextLine());
					isEqualsMember(list, sAge);
					break;
				case 3:
					System.out.println("E-Mail�� �Է��ϼ���:");
					String sEmail= sc.nextLine();
					isEqualsMember(list, sEmail);
					break;
				case 4:
					System.out.println("�ּҸ� �Է��ϼ���:");
					String sAddress = sc.nextLine();
					isEqualsMember(list, sAddress);
					break;
				case 5:
					break;
				default:
					System.out.println("�˻� �׸��� ���ڸ� �Է��ϼ���.");
				}
			} catch(Exception e) {
				System.out.println("�˻��� �׸��� ���ڷ� �Է��ϼ���");
			}
			
		} while(!numStr.equals("5"));
	}
	
	static void isEqualsMember(ArrayList<MemberInfo> list, Object obj) {
		boolean isDataExit = false;
		for(int i = 0; i < list.size(); i++) {
			if(obj.equals(list.get(i).getName())) {
				printMemberInfo(list, i);
				isDataExit = true;
			} else if(obj.equals(list.get(i).getAge())) {
				printMemberInfo(list, i);
				isDataExit = true;
			} else if(obj.equals(list.get(i).getEmail())) {
				printMemberInfo(list, i);
				isDataExit = true;
			} else if(obj.equals(list.get(i).getAddress())) {
				printMemberInfo(list, i);
				isDataExit = true;
			}
		}

		if(!isDataExit) {
			System.out.println("*****�˻��� �����Ͱ� �����ϴ�.*****");	
		}

	}
	
	static void update(ArrayList<MemberInfo> list, Scanner sc) {
		String numStr;
		do {
			System.out.println("===������ �׸��� �����ϼ���===");
			infoMenu();
			numStr = sc.nextLine();
			try {
				int num = Integer.parseInt(numStr);
				String name = "";
				switch(num) {
				case 1:
					System.out.println("���� �� ������ �Է��ϼ���:");
					String beforeName = sc.nextLine();
					System.out.println("���� �� ������ �Է��ϼ���:");
					String afterName = sc.nextLine();
					isUpdateMember(list, name, beforeName, afterName);
					break;
				case 2:
					System.out.println("������ ����� ������ �����ּ���:");
					name = sc.nextLine();
					System.out.println("���� �� ���̸� �Է��ϼ���:");
					Integer beforeAge = Integer.parseInt(sc.nextLine());
					System.out.println("���� �� ���̸� �Է��ϼ���:");
					Integer afterAge = Integer.parseInt(sc.nextLine());
					isUpdateMember(list, name, beforeAge, afterAge);
					break;
				case 3:
					System.out.println("������ ����� ������ �����ּ���:");
					name = sc.nextLine();
					System.out.println("���� �� �̸����� �Է��ϼ���:");
					String beforeEmail = sc.nextLine();
					System.out.println("���� �� �̸����� �Է��ϼ���:");
					String afterEmail = sc.nextLine();
					isUpdateMember(list, name, beforeEmail, afterEmail);
					break;
				case 4:
					System.out.println("������ ����� ������ �����ּ���:");
					name = sc.nextLine();
					System.out.println("���� �� �ּҸ� �Է��ϼ���:");
					String beforeAddress = sc.nextLine();
					System.out.println("���� �� �ּҸ� �Է��ϼ���:");
					String afterAddress = sc.nextLine();
					isUpdateMember(list, name, beforeAddress, afterAddress);
					break;
				case 5:
					break;
				default:
					System.out.println("���� �׸��� ���ڸ� �Է��ϼ���.");
				}
			} catch(Exception e) {
				System.out.println("������ �׸��� ���ڷ� �Է��ϼ���");
			}
		} while(!numStr.equals("5"));
	}
	
	static void isUpdateMember(ArrayList<MemberInfo> list, String name, Object bfObj, Object afObj) {
		boolean isUpdateExit = false;
		MemberInfo member = new MemberInfo();
		for(int i = 0; i < list.size(); i++) {
			if(bfObj.equals(list.get(i).getName())) {
				member.setName((String)afObj);
				member.setAge(list.get(i).getAge());
				member.setEmail(list.get(i).getEmail());
				member.setAddress(list.get(i).getAddress());
				list.set(i, member);
				printMemberInfo(list, i);
				isUpdateExit = true;
			} else if(name.equals(list.get(i).getName()) && bfObj.equals(list.get(i).getAge())) {
				member.setName(list.get(i).getName());
				member.setAge((Integer)afObj);
				member.setEmail(list.get(i).getEmail());
				member.setAddress(list.get(i).getAddress());
				list.set(i, member);
				printMemberInfo(list, i);
				isUpdateExit = true;
			} else if(name.equals(list.get(i).getName()) && bfObj.equals(list.get(i).getEmail())) {
				member.setName(list.get(i).getName());
				member.setAge(list.get(i).getAge());
				member.setEmail((String)afObj);
				member.setAddress(list.get(i).getAddress());
				list.set(i, member);
				printMemberInfo(list, i);
				isUpdateExit = true;
			} else if(name.equals(list.get(i).getName()) && bfObj.equals(list.get(i).getAddress())) {
				member.setName(list.get(i).getName());
				member.setAge(list.get(i).getAge());
				member.setEmail(list.get(i).getEmail());
				member.setAddress((String)afObj);
				list.set(i, member);
				printMemberInfo(list, i);
				isUpdateExit = true;
			}
		}

		if(!isUpdateExit) {
			System.out.println("*****������ �����Ͱ� �����ϴ�.*****");	
		} else {
			System.out.println("*****���������� �����Ǿ����ϴ�.*****");
		}
	}
	
	static void delete(ArrayList<MemberInfo> list, Scanner sc) {
		String numStr;
		do {
			System.out.println("===�˻��� �׸��� �����ϼ���===");
			infoMenu();
			numStr = sc.nextLine();
			try {
				int num = Integer.parseInt(numStr);
				switch(num) {
				case 1:
					System.out.println("������ �Է��ϼ���:");
					String sName = sc.nextLine();
					isDeleteMember(list, sName);
					break;
				case 2:
					System.out.println("���̸� �Է��ϼ���:");
					Integer sAge = Integer.parseInt(sc.nextLine());
					isDeleteMember(list, sAge);
					break;
				case 3:
					System.out.println("E-Mail�� �Է��ϼ���:");
					String sEmail= sc.nextLine();
					isDeleteMember(list, sEmail);
					break;
				case 4:
					System.out.println("�ּҸ� �Է��ϼ���:");
					String sAddress = sc.nextLine();
					isDeleteMember(list, sAddress);
					break;
				case 5:
					break;
				default:
					System.out.println("�˻� �׸��� ���ڸ� �Է��ϼ���.");
				}
			} catch(Exception e) {
				System.out.println("�˻��� �׸��� ���ڷ� �Է��ϼ���");
			}
			
		} while(!numStr.equals("5"));
	}
	
	static void isDeleteMember(ArrayList<MemberInfo> list, Object obj) {
		boolean isDeleteExit = false;
		for(int i = list.size() - 1; i >= 0; i--) {
			if(obj.equals(list.get(i).getName())) {
				printMemberInfo(list, i);
				list.remove(list.get(i));
				isDeleteExit = true;
			} else if(obj.equals(list.get(i).getAge())) {
				printMemberInfo(list, i);
				list.remove(list.get(i));
				isDeleteExit = true;
			} else if(obj.equals(list.get(i).getEmail())) {
				printMemberInfo(list, i);
				list.remove(list.get(i));
				isDeleteExit = true;
			} else if(obj.equals(list.get(i).getAddress())) {
				printMemberInfo(list, i);
				list.remove(list.get(i));
				isDeleteExit = true;
			}
			
			if(!isDeleteExit) {
				System.out.println("*****����� �����Ͱ� �����ϴ�.*****");	
			} else {
				System.out.println("*****���������� ���� �߽��ϴ�.*****");
			}
		}

	}

	static void printMemberInfo(ArrayList<MemberInfo> list, int i) {
		System.out.println("===== Get(" + i + ")��° ��� ���=====");
		System.out.println("�̸� : " + list.get(i).getName());
        System.out.println("���� : " + list.get(i).getAge());
        System.out.println("�̸��� : " + list.get(i).getEmail());
        System.out.println("�ּ� : " + list.get(i).getAddress());
	}

	static void printAll(ArrayList<MemberInfo> list) {
		if(list.size() == 0) {
			System.out.println("=====����� �����Ͱ� �����ϴ�.=====");
		} else {
			System.out.println("=======����� ����մϴ�.=======");
			for(int i = 0; i < list.size(); i++) {
				printMemberInfo(list, i);
			}
		}
	}
}
