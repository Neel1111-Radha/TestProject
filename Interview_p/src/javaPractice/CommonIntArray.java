package javaPractice;
import java.util.*;

public class CommonIntArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {1,9,8,7,2};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i = 0; i <a.length; i++) {
			for(int j = 0; j <b.length; j++) {
				if(a[i] == b[j] ) {
					hs.add(a[i]);
					break;
				}
			}
		}
   System.out.println("Common Integer from the arrays are: " + hs);
	}

}
