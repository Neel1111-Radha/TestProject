package javaPractice;

public class PerfectNo1_1000 {
	
		public static  boolean demo(int n) {
			
			int sum = 0;
			
			for(int i = 1 ; i <= n-1; i++) {
				if(n%i == 0) {
					sum = sum + i;			
				
				}
			}	
			//System.out.println("Sum of all its factors are: "+sum);
			
		if(n==sum) {
		return true;
		}else {
		return false;
		}
		
			
		}
		
		public static void main(String[] args) {
	 
			for(int i = 1; i <=1000; i++) {
				if(demo(i) == true) {
					System.out.println(i + " ");
					
				}
			}
		
		}
}


