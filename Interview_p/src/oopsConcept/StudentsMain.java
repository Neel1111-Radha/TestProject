package oopsConcept;

public class StudentsMain {

	public static void main(String[] args) {
		Student st1 = new Student();
		//st1 contains rollNo, name, grade, enterdata()
		
		st1.rollNo = 01;
		st1.name = "Aakash";
		st1.grade = 'A';
		st1.enterdata();
		
		
		st1.rollNo = 02;
		st1.name = "Aakansha";
		st1.grade = 'B';
		st1.enterdata();
		
		st1.rollNo = 03;
		st1.name = "Aashish";
		st1.grade = 'A';
		st1.enterdata();
		
		Student st2 = new Student();
		st2.rollNo = 4;
		st2.name = "Bhavana";
		st2.grade = 'B';
		st2.enterdata();
		
		

	}

}
