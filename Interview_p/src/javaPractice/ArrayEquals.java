package javaPractice;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a1[] = {1,2,3,4,5};
        int a2[] = {1,2,3,4,5};
        
        //using equals method;
        
        Boolean status = Arrays.equals(a1, a2);
        
        if(status == true) {
        	System.out.println("Arrays are equal");
        } else {
        	System.out.println("Arrays are not equal");
        }
	}

}
