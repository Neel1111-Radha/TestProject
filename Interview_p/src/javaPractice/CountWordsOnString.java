package javaPractice;

import java.util.Scanner;

//import java.util.Scanner;
public class CountWordsOnString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		
		String s = sc.nextLine();
		//String s = "My name is Neelima";
		int count = 1;
		
		for(int i =0; i<s.length()-1; i++) {
			if((s.charAt(i)== ' ') && (s.charAt(i+1) != ' ')) {
				count++;
			}			
			
		}
		
		System.out.println("No of Words: " + count);

	}

}
