package practice;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    String a = "Hello";
    String b = "World";
    
    a = a+b;
    
    b = a.substring(0, a.length()-b.length());
    a = a.substring(b.length());
    
    System.out.println(a);
    System.out.println(b);
	}

}
