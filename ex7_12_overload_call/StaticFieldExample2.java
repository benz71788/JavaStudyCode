package ex7_12_overload_call;

public class StaticFieldExample2 {
	
	public static void main(String[] args) {
		LimitedValue lv = new LimitedValue();
		lv.setValue(200000);
		System.out.println("lv.value = " + lv.value);
		System.out.println("���Ѱ� = " + LimitedValue.UPPER_LIMIT);
		System.out.println("������ ���Ѱ� = " + Integer.MAX_VALUE);
		System.out.println("������ ���Ѱ� = " + Integer.MIN_VALUE);
	}

}
