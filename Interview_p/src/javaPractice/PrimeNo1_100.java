package javaPractice;

public class PrimeNo1_100 {
	
	public static boolean prime(int n) {
		
		int count = 0;
		
		for(int i = 1; i <=n ; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		
		if(count == 2) {
			return true;
		}else {
			return false;
		}
		
		
		
	}
	public static void main(String[] args) {
		for(int i = 1; i <=100; i++) {
			if(prime(i) == true) {
             System.out.print(i + " ");				
			}
		}

	}

}
