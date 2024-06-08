package javaPractice;

public class MaxMinArray {

	public static void main(String[] args) {
	
		int a[] = {10,35, 19,40};
		
		int max = a[0];
		
		for(int i = 1; i <a.length; i++) 
		{
			if(a[i] > max) 
			{
				max = a[i];
			}
		}
		
		System.out.println("Max Values is: " + max);

		 int min = a[0];
		 for(int i = 1 ; i < a.length; i ++) 
		 {
			 if(a[i] < min) {
				 min = a[i];
			 }
		 }
		 
		 System.out.println("Min value is: " + min);
	}

}
