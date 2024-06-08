package javaPractice;

public class Countalphabets {

	public static void main(String[] args) {
		String s = "Java is Object Oriented Language";
		s = s.replaceAll("[^a]", "");
		System.out.println(s.length());

	}

}
