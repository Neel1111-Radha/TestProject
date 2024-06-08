package javaPractice;

import java.util.Arrays;

public class SwapElementArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,2};
		int temp = a[0];
		int size = a.length;
		
		a[0] = a[size-1];
		a[size-1] = temp;
		
		System.out.println(Arrays.toString(a));
		

	}

}
