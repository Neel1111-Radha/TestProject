package javaPractice;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = sc.nextInt();
	//int a = ;
	int sum = 0;
	
	for(int i = 1 ; i <= a-1; i++) {
		if(a%i == 0) {
			sum = sum + i;			
		
		}
	}	
	//System.out.println(sum);
	
if(a==sum) {
	System.out.println(a + " is a perfect Number");
}else {
	System.out.println(a + " is not a perfect Number");
}	


	}

}
