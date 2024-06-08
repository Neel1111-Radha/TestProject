package javaPractice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        
        String org_string = str;
        
        System.out.println("String is: " + str);
        
        String rstr = " ";
        
        for(int i = 0; i < str.length(); i++) {
        	char ch = str.charAt(i);
        	rstr = ch+rstr;
        }
        
        System.out.println("Reverse String: " + rstr);
        
        if(rstr.equals(org_string)) {
        	
        	System.out.println(org_string + "String is palindrome");
        }else {
        	System.out.println(org_string + "String is Not Palindrome");
        }
        
	}
	

}
