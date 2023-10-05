package I2_HW_MultiLayer_Inheritance;

public class I21_CollegeStudent extends I22_Student {
	
	I21_CollegeStudent(String Name) {
		super(Name);
	}

	String Major;
	
	void Show() {
		System.out.println("The student's Major is: " + Major);
	}
}
