package javaPractice;

public class ArrayEquals1 {

	public static void main(String[] args) {
		
		// using our own logic , without using equals method
		
		int a1[] = {1,22,3,4,5};
		int a2[] = {1,2,3,4,5};
		
		boolean status = true;
		
		if(a1.length == a2.length) {
			
			for(int i =0; i < a1.length; i++) {
				if(a1[i] != a2[i]) {
					status = false;
				}
			}			
			
		}else {
			status= false;
		}
		
       if(status == true) {
    	   System.out.println("arrays are equal");
       }else {
    	   System.out.println("arrays are not equal");
       }
	}

}
