package javaPractice;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		// Palindrome No. is 131 ulta sidha eksaman

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		 int org_no = num;
		 
		 int rev = 0;
		 while(num !=0) {
			 rev = rev*10 + num%10;
			 num = num/10;
			 	 }
		System.out.println("Revrs No: " + rev);
		
		if(org_no == rev) {
			System.out.println("No is Palindrome No.");
		}else {
			System.out.println("No is not Palindrome No.");
		}
		
	}

}
