package ex4_09_assignment_op;

public class AssignmentExample {
	
	public static void main(String[] args) {
		
		char ch = '��';
		System.out.println(ch);
		
		int num = ch; //'��'�� unicode��
		System.out.println(num);
		
		num = ch + 1;
		System.out.printf("%c\n", num);
		System.out.printf("%d\n", num);
		
	}

}
