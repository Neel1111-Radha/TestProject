package javaPractice;

public class StringPalindrome {

	public static void main(String[] args) {
		String s = "boob";
		String Revs= " ";
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Revs = c + Revs;
		}

		System.out.println("Reverse Str:" + Revs); 
       
	if(s.equals(Revs) ) {
		System.out.println("String is Palindrome");	
	}
	
	
	
	}
}
