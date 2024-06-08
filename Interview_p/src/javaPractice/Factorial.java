package javaPractice;

public class Factorial {

	public static void main(String[] args) {
		// 5! = 5*4*3*2*1 = 120
		
		int num = 10;
		long factorial = 1;
		
//		for(int i = 1; i<= num; i++) {
//			factorial = factorial *i;
//		}
		
		for(int i = num; i>=1; i--) {
			factorial = factorial *i;
		}
       System.out.println("Factorial of num is: " + factorial);
	}

}
