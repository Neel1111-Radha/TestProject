package javaPractice;

public class AddNo_onString {

	public static void main(String[] args) {
		String s = "abgcf10ght20hjgy27";
		
		// 1+2+2+7 = 12
		
		s = s.replaceAll("[a-z]", "");
		int n = Integer.parseInt(s);
		System.out.println(s);
		
		int sum = 0;
		
		while(n!=0) 
		{
			sum = sum + n%10;
			n = n/10;
		}
       System.out.println("sum of the digit: " + sum);
	}
	

}
