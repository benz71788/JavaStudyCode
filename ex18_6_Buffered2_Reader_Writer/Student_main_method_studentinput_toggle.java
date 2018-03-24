package ex18_6_Buffered2_Reader_Writer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Student_main_method_studentinput_toggle {
	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<Student>();
		input(list);
	}

	static void input(ArrayList<Student> list) {
		String name = "";
		int kor, eng, math;
		String[] arr = new String[4];
		try (BufferedReader reader = new BufferedReader(new FileReader("studentinput.txt"));) {
			while (true) {
				String str = reader.readLine();// ���Ϸ� ���� �� �྿ �о��.
				if (str == null)
					break;
				//�������� �и��ؼ� �̸�, ����, ����, ���� ���� �����ɴϴ�.
				StringTokenizer toke = new StringTokenizer(str, " ");	// 1. StringTokenizer ���
				for(int i = 0; i < arr.length; i++) {
					arr[i] = toke.nextToken();
				}
				name = arr[0];
				kor = Integer.parseInt(arr[1]);
				eng = Integer.parseInt(arr[2]);
				math = Integer.parseInt(arr[3]);
				Student student = new Student(name, kor, eng, math);	
				
				// or
				
//				String[] st = str.split(" ");		// 2. split ���
//				name = st[0];
//				kor = Integer.parseInt(st[1]);
//				eng = Integer.parseInt(st[2]);
//				math = Integer.parseInt(st[3]);
//				Student student1 = new Student(name, kor, eng, math);	
				
				//Student ��ü ���� �� list�� �߰��մϴ�.
				list.add(student);
				
			}
			print(list);
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
	}

	static void print(ArrayList<Student> list) {
		System.out.println("==========   �л���   /  ���� �������ϱ�  ==========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).name + "\t" + list.get(i).kor + "\t" + list.get(i).eng + "\t"
					+ list.get(i).math + "\t" + list.get(i).getTotal() + "\t");
			System.out.printf("%.1f\n", list.get(i).getAverage());
		}

		for (int j = 0; j < 45; j++) {
			System.out.print("=");
		}

		System.out.print("\n����\t");
		System.out.print(Student.korTotal + "\t");
		System.out.print(Student.engTotal + "\t");
		System.out.print(Student.mathTotal + "\t");

	}
}
