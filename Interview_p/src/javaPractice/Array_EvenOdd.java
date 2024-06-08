package javaPractice;

public class Array_EvenOdd {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		
		System.out.println("Print even no from an array:");
		
		for(int i = 0; i <a.length; i++){
			if(a[i]%2 == 0) {
				System.out.println(a[i]);
			}
		}
         
		
	System.out.println("Print Odd No.: ");
	
	for(int i = 0 ; i <a.length; i++) {
		if(a[i]%2!=0) {
			System.out.println(a[i]);
		}
	}
	
	
	int extract[] = {2,4,6,1};
	
	System.out.println("even's are");
	
	for(int x : extract) {
		try {
			if(x %2 == 0) {
				System.out.println(x);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("odds are:");
	
	for(int x : extract) {
		if(x%2 != 0) {
			System.out.println(x);
		}
	}
	
	}

}
