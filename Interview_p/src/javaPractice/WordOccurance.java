package javaPractice;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		String str[] = {"java", "python", "Ruby", "java", "C#", "python"};
	    
	    HashMap<String, Integer> hm = new HashMap<>();
	    
	    for(String s: str) {
	    	if(hm.containsKey(s)) {
	    		hm.put(s, hm.get(s)+1);
	    	}else {
	    		hm.put(s, 1);
	    	}
	    }
	    
	    System.out.println("" + hm);

	}

}
