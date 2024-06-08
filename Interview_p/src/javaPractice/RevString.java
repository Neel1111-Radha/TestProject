package javaPractice;

public class RevString {

	public static void main(String[] args) {
		String name = " hi Neelima Jaiswal";
		System.out.println(name.length());
		
		// Reverse the String
		
		String revstr = " ";
		
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			//System.out.println(ch);
			revstr = ch + revstr;
		}
         System.out.println("rev String: " + revstr);
		
	}

}
