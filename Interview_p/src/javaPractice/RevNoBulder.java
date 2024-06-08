package javaPractice;

import java.util.Scanner;

public class RevNoBulder {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No: ");
		
		int num = sc.nextInt();
		
		System.out.println("Print no: " + num);
		
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Rev No: " + rev);
	}
}
