package javaPractice;

import java.util.HashMap;

public class CharacterOccurance {

	public static void main(String[] args) {
		
		String str = "aabbccdd";
		
		HashMap<Character, Integer> Hm = new HashMap <Character, Integer>();
		
		for(int i =0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(Hm.containsKey(ch)) {
				int count = Hm.get(ch);
				count++;
				
				Hm.replace(ch, count);				
				
			}else {
				Hm.put(ch, 1);
			}
					
		}
         for(char key : Hm.keySet()) {
        	 System.out.print(key+ ""+ Hm.get(key));
        	 //System.out.println(key + Hm.get(key));
         }
	}

}
