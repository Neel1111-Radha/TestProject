package javaPractice;

public class Four {

	public static void main(String[] args) {
		/*
		  Write a Java program to print the results of the following operations. 
		  Test Data: 
		  a. -5 + 8 * 6 
		  b. (55+9) % 9 
		  c. 20 + -3*5 / 8 
		  d. 5 + 15 / 3 * 2 - 8 % 3
		  Expected Output : 43 1 19 13
		 */

		
		// Neelima's Way
		
		int a = -5 + 8 * 6;
		System.out.println(a);
		
		int b = (55+9) % 9;
		System.out.println(b);
		
		int c = 20 + -3*5 / 8;
		System.out.println(c);
		
		int d = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println(d);
		
		
		// Actual Way
		
		System.out.println(-5 + 8 * 6);
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
	}
	

}
