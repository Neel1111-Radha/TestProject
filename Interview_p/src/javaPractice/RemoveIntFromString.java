package javaPractice;

public class RemoveIntFromString {

	public static void main(String[] args) {
		String s = "d5de5dd56d5dd";
		
		s = s.replaceAll("[0-9]", "");
		System.out.println(s.length());
		
		

	}

}
