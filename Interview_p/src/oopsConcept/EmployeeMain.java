package oopsConcept;

public class EmployeeMain {

	public static void main(String[] args) {
        Employee cl1 = new Employee();
		
		cl1.eid = 1234;
		cl1.ename = "Neelima";
		cl1.job = "Automation Test Engineer";
		cl1.sal = 70000;
		
		cl1.method();		

		Employee cl2 = new Employee();
		cl2.eid = 1134;
		cl2.ename = "John";
		cl2.job = "Manager";
		cl2.sal = 50000;
		cl2.method();
	}

}
