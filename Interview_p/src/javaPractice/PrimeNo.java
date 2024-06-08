package javaPractice;

public class PrimeNo {

	public static void main(String[] args) {
		// Prime No must be divisible by only 2 no. 
		// itself and 1
		// Condition 1 : no. > 1
		// Condition 2 : no. % 1 and no. only
		
		
		int num = 10;		
		int count = 0;	
		
		if(num > 1) {			
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					count++;
				}
			}			
			if(count == 2) {
				System.out.println("Num is prime no");
			}
			
			
		}else {
			System.out.println("num is not prime no");
		}

	}

}
