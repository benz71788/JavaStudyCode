package ex6_3_method_intro;

public class main_arg1 {
	
	public static void main(String[] args) {
		
//		for(int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		for(String arg : args) {
			System.out.println(arg);
		}
	}
	

}
