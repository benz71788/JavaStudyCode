package ex5_7_continue;

public class ContinueExample2 {
	
	// ���� ���� - ���ѷ����� ��������.
	public static void main(String[] args) {
		int cnt = 0;
		while(cnt < 10) {
			if(cnt == 5) {
				continue;
			}
			System.out.println(cnt);
			cnt++;
		}
		System.out.println("Done.");
	}

}
