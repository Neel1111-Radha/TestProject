package javaPractice;

import java.util.Scanner;
public class Even_OddCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. :" );
        
        int num = sc.nextInt();
        
        int even = 0;
        int odd = 0;
        
        while(num != 0) {
        	int rem = num%10;
        	if(rem%2 == 0) {
        		even++;
        	} else {
        		odd++;
        	}
        	
        	num=num/10;
        }
        
        System.out.println("No of even no. :" + even);
        System.out.println("No of odd no. : " + odd);
	}

}
