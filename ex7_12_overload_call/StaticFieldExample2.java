package ex7_12_overload_call;

public class StaticFieldExample2 {
	
	public static void main(String[] args) {
		LimitedValue lv = new LimitedValue();
		lv.setValue(200000);
		System.out.println("lv.value = " + lv.value);
		System.out.println("상한값 = " + LimitedValue.UPPER_LIMIT);
		System.out.println("정수의 상한값 = " + Integer.MAX_VALUE);
		System.out.println("정수의 하한값 = " + Integer.MIN_VALUE);
	}

}
