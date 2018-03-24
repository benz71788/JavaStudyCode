package ex9_2_null;

class RefTypeExample6 {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Point point = null;
		try {
			System.out.println(point.x);
			System.out.println(point.y);
		} catch(java.lang.NullPointerException n) {
			System.out.println("null ¿‘¥œ¥Ÿ.");
		}
	}

}
