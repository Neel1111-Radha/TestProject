package javaPractice;

public class ArraySum {

	public static void main(String[] args) {
		// Sum of array
		
		int a [] = {2,3,4,5,8,9};
		int sum = 0;
		
		for(int i = 0; i <a.length; i++) {
			sum = sum + a[i];
		}
       System.out.println(sum);
       
       //enhanced for loop
       
       int r[] = {1,4,9};
       int add = 0;
       
       for(int x: r) {
    	   add = add+ x;
       }
       System.out.println(add);
	}

}
