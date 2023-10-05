package G_Inheritance;

public class G2_Programmer_Main extends G1_Employee{

	int bonus = 2000;
	
	public static void main(String[] args) {
		G2_Programmer_Main obj = new G2_Programmer_Main();
		System.out.println(obj.salary);
		System.out.println(obj.bonus);

	}

}
