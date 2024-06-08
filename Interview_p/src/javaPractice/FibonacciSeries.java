package javaPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// series of sum of two previous num's
		
		int n = 6;
		int firstnum = 0;
		int secondnum = 1;
		int nextnum;
		
		for(int i = 1; i <=n; i++){
			System.out.print(firstnum + " ,");
			nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;
		}

	}

}

