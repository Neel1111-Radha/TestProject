package javaPractice;

public class RemoveCharfromString {

	public static void main(String[] args) {
		String s = "d5de5dd56d5dd";
		s = s.replaceAll("[a-z]", "");		
		
		int a = Integer.parseInt(s);
		
		int sum =0;
		while (a!=0) {
			sum += a%10;
			a = a/10;
		}
		System.out.println(sum);
        
		
		
		
	}

}
