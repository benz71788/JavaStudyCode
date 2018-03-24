package ex7_17_static_init;

public class Singleton {
	
	//Ŭ���� �ڽ��� Ÿ������ ���� �ʵ� ����
		// -> �ڽ��� ��ü�� ������ �ʱ�ȭ
		// -> private ���� ������ �ٿ� �ܺο��� �ʵ� �� ���� �Ұ��ϵ���
	private static Singleton single = new Singleton();	//�ʵ� single�� �ܺο��� ��� ���մϴ�.
		
	//�ܺο��� new�����ڷ� �����ڸ� ȣ���� �� ������ ����
	// -> private ���� �����ڸ� ������ �տ� ����
	private Singleton() {
		System.out.println("����� Singleton ������ �Դϴ�.");
	}
	
	//�ܺο��� ȣ���� �� �ִ� �����޼ҵ��� getinstance() ����
	// -> ���� �ʵ忡�� �����ϰ� �ִ� �ڽ��� ��ü ����
	public static Singleton getInstance() {
		System.out.println("����� getInstance�Դϴ�.");
		
		return single;
	}

}
