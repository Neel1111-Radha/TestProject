package javaPractice;
import java.util.*;
public class CharOcc_Naveen {

	public static void main(String[] args) {
		 String s = "test to";
		 
		 HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		 
		 char c[] = s.toCharArray();
		 
		 for(char a : c) {
			 if(hm.containsKey(a)){
				/* int count = hm.get(a);
				 count++;
				 hm.replace(a, count);*/
				 
				 hm.put(a, hm.get(a) + 1);
				 
			 }else {
				 hm.put(a, 1);
			 }
			 
		 }	
		 
 System.out.println(s + " " + hm);
		 
	}

}
