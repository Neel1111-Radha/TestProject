package javaPractice;
import java.util.Scanner;

public class ReverseSentance {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter your string");
	    
	    String str1 = sc.nextLine();
	    
		//String str = "My name is Neelima Jaiswal";
		String Rvs = " ";
		
		String[] Str_arr = str1.split(" ");
		
		//System.out.println(Str_arr);
		
		for(int i = Str_arr.length-1; i>=0; i--) {
			Rvs =Rvs+ Str_arr[i] + " ";
		}
		
		System.out.println(Rvs);
	}
	

}
