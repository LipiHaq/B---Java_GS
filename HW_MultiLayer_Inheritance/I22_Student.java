package I2_HW_MultiLayer_Inheritance;

public class I22_Student extends I23_Person {

	I22_Student(String Name) {
		super(Name);
	}

	int StudentAge; 
	
	void StudentInfo (String name, int ID) {
		System.out.println("Student's name is: "+name);
		System.out.println("The student's ID Number is: "+ID);
		System.out.println("The students's age is: "+StudentAge);
		
	}
}
