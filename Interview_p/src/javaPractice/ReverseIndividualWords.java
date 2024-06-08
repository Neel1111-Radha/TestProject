package javaPractice;

public class ReverseIndividualWords {

	public static void main(String[] args) {
		
		String str = "Neelima Jaiswal";
		
		String[] array = str.split("//s");
		String reverse = " ";
		
		                                                                                     
		
		for(String a : array) {
			StringBuilder sb = new StringBuilder(a);
			sb.reverse();
			reverse = reverse + sb.toString() + " ";
		}
		
		System.out.println(reverse);
	   

	}

}
