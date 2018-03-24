package test.MemberInfoTest;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectFunctionMenu {

	public static void main(String[] args) {

		ArrayList<MemberInfo> list = new ArrayList<MemberInfo>();

		Scanner sc = new Scanner(System.in);

		do {
			menu(); //메뉴 출력하는 메서드 호출
			String select = sc.nextLine();
			// 숫자가 아니면 다시 메뉴 호출합니다.
			if (!isNumber(select)) {
				System.out.println("반드시 숫자 입력하세요.");
			} else {
				int selector = Integer.parseInt(select);
				switch (selector) {
				case 1:  //입력합니다.
					input(list, sc);
					break;
				case 2:	 //검색합니다.
					search(list, sc);
					break;
				case 3:
					update(list, sc);
					break;
				case 5:  //출력합니다.
					printAll(list);
					break;
				case 6: //종료합니다.
					System.out.println("종료합니다.");
					sc.close();
					return;
				default:
					System.out.println("1 또는 5 또는 6의 숫자를 입력하세요");
				}
			}
			System.out.println();
			} while (true);
	}

	static void menu() {
		System.out.println("다음 중 선택하세요(반드시 숫자 입력)");
	    	System.out.println("1. 입력");
	    	System.out.println("2. 검색");
	    	System.out.println("3. 수정");
	    	System.out.println("5. 출력");
	    	System.out.println("6. 종료");
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
			System.out.println("성명을 입력하세요?");
		    	String name = sc.nextLine();
		    	do {
		    		System.out.println("나이를 입력하세요?");
		    		age = sc.nextLine();
		    		try {
		    			ageInt = Integer.parseInt(age);
	    				break;
		    		} catch(Exception e) {
		    			System.out.println("나이는 숫자를 입력하셔야 합니다.");
		    		}
		    	} while(true);
		    	System.out.println("E-Mail을 입력하세요?");
		    	String email = sc.nextLine();
		    	System.out.println("주소를 입력하세요?");
		    	String address = sc.nextLine();
		    
		    	MemberInfo memberInfo = new MemberInfo();
		    	memberInfo.setName(name);
		    	memberInfo.setAge(ageInt);
		    	memberInfo.setEmail(email);
		    	memberInfo.setAddress(address);
		    	list.add(memberInfo);
		    do {
			    	System.out.println("계속할려면 y, 멈출려면 n을 입력?");
			    	end = sc.nextLine();
		    } while(!(end.equalsIgnoreCase("y")) && !(end.equalsIgnoreCase("n")));
		}
	}
	
	static void infoMenu() {
		System.out.println("1. 성명");
		System.out.println("2. 나이");
		System.out.println("3. E-Mail");
		System.out.println("4. 주소");
		System.out.println("5. 메뉴로 돌아가기");
		System.out.println("==>");
		
	}

	static void search(ArrayList<MemberInfo> list, Scanner sc) {
		String numStr;
		do {
			System.out.println("===검색할 항목을 선택하세요===");
			infoMenu();
			numStr = sc.nextLine();
			try {
				int num = Integer.parseInt(numStr);
				switch(num) {
				case 1:
					System.out.println("성명을 입력하세요:");
					String sName = sc.nextLine();
					isEqualsMember(list, sName);
					break;
				case 2:
					System.out.println("나이를 입력하세요:");
					Integer sAge = Integer.parseInt(sc.nextLine());
					isEqualsMember(list, sAge);
					break;
				case 3:
					System.out.println("E-Mail을 입력하세요:");
					String sEmail= sc.nextLine();
					isEqualsMember(list, sEmail);
					break;
				case 4:
					System.out.println("주소를 입력하세요:");
					String sAddress = sc.nextLine();
					isEqualsMember(list, sAddress);
					break;
				case 5:
					break;
				default:
					System.out.println("검색 항목의 숫자만 입력하세요.");
				}
			} catch(Exception e) {
				System.out.println("검색할 항목을 숫자로 입력하세요");
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
			System.out.println("*****검색된 데이터가 없습니다.*****");	
		}

	}
	
	static void update(ArrayList<MemberInfo> list, Scanner sc) {
		String numStr;
		do {
			System.out.println("===수정할 항목을 선택하세요===");
			infoMenu();
			numStr = sc.nextLine();
			try {
				int num = Integer.parseInt(numStr);
				String name = "";
				switch(num) {
				case 1:
					System.out.println("수정 전 성명을 입력하세요:");
					String beforeName = sc.nextLine();
					System.out.println("수정 후 성명을 입력하세요:");
					String afterName = sc.nextLine();
					isUpdateMember(list, name, beforeName, afterName);
					break;
				case 2:
					System.out.println("수정할 사람의 성명을 적어주세요:");
					name = sc.nextLine();
					System.out.println("수정 전 나이를 입력하세요:");
					Integer beforeAge = Integer.parseInt(sc.nextLine());
					System.out.println("수정 후 나이를 입력하세요:");
					Integer afterAge = Integer.parseInt(sc.nextLine());
					isUpdateMember(list, name, beforeAge, afterAge);
					break;
				case 3:
					System.out.println("수정할 사람의 성명을 적어주세요:");
					name = sc.nextLine();
					System.out.println("수정 전 이메일을 입력하세요:");
					String beforeEmail = sc.nextLine();
					System.out.println("수정 후 이메일을 입력하세요:");
					String afterEmail = sc.nextLine();
					isUpdateMember(list, name, beforeEmail, afterEmail);
					break;
				case 4:
					System.out.println("수정할 사람의 성명을 적어주세요:");
					name = sc.nextLine();
					System.out.println("수정 전 주소를 입력하세요:");
					String beforeAddress = sc.nextLine();
					System.out.println("수정 후 주소를 입력하세요:");
					String afterAddress = sc.nextLine();
					isUpdateMember(list, name, beforeAddress, afterAddress);
					break;
				case 5:
					break;
				default:
					System.out.println("수정 항목의 숫자만 입력하세요.");
				}
			} catch(Exception e) {
				System.out.println("수정할 항목을 숫자로 입력하세요");
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
			System.out.println("*****수정할 데이터가 없습니다.*****");	
		} else {
			System.out.println("*****성공적으로 수정되었습니다.*****");
		}
	}

	static void printMemberInfo(ArrayList<MemberInfo> list, int i) {
		System.out.println("===== Get(" + i + ")번째 사람 명단=====");
		System.out.println("이름 : " + list.get(i).getName());
        System.out.println("나이 : " + list.get(i).getAge());
        System.out.println("이메일 : " + list.get(i).getEmail());
        System.out.println("주소 : " + list.get(i).getAddress());
	}

	static void printAll(ArrayList<MemberInfo> list) {
		if(list.size() == 0) {
			System.out.println("=====출력할 데이터가 없습니다.=====");
		} else {
			System.out.println("=======명단을 출력합니다.=======");
			for(int i = 0; i < list.size(); i++) {
				printMemberInfo(list, i);
			}
		}
	}
}