package javaPractice;

import java.util.HashSet;

public class CommonArrayElements {

	public static void main(String[] args) {
		String str1[] = {"Hi", "Hello", "Java","C#"};
		String str2[] = {"Hi", "Python", "Java","C++"};
		
		HashSet<String> hs = new HashSet<>();
		
		for(int i = 0; i <str1.length; i++) {
			for(int j = 0; j <str2.length; j++) {
				if(str1[i] == str2[j]) {
					hs.add(str1[i]);
					break;
				}
			}
		}
		
   System.out.println("common Elements are: " + hs);
	}

}
