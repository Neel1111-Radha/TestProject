package javaPractice;

public class DuplicateArray {

	public static void main(String[] args) {
		String str[] = {"Java", "Python", "c++", "Ruby","Java"};
		
		for(int i = 0; i < str.length; i++) {
			
			for(int j = i+1; j< str.length; j++) {
				if(str[i].equals(str[j])) {
					System.out.println("Found Duplicate Element: " + str[i]);
				}
			    }
			
			}
		
		

	}

}
