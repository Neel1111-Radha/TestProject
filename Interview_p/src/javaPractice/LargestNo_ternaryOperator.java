package javaPractice;

public class LargestNo_ternaryOperator {

	public static void main(String[] args) {
		int a = 500;
		int b = 700;
		int c = 300;
		
		int largest = a>b ? a:b;
		largest = c>largest ? c: largest;
		
		System.out.println(largest + " is the largest");

	}

}
