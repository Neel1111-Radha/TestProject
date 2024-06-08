package oopsConcept;

public class FamilyMain {

	public static void main(String[] args) {
		Family f1 = new Family();
		
		//f1 will acces all the variables and methods (User defined)
		
		f1.name = "Shiv Dayal Dhruva";
		f1.age = 67;
		f1.relation = "Father";
		f1.Designation = "Assistant Engineer State Gov";		
		f1.info();
		
		Family f2 = new Family();
		
		f2.name = "Geeta Dhruva";
		f2.age = 58;
		f2.relation = "Mother";
		f2.Designation = "HouseWife";
		f2.info();
		
		Family f3 = new Family();
		f3.name = "Neelam Jaiswal";
		f3.age = 35;
		f3.relation = "Sister";
		f3.Designation = "Software Test Engineer";
		f3.info();
		
		Family f4 = new Family();
		f4.name = "Vikrant Jaiswal";
		f4.age = 33;
		f4.relation = "Brother";
		f4.Designation = "Mechanical Engineer";
		f4.info();
		

	}

}
