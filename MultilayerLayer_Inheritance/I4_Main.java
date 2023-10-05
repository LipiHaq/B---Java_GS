package I_MultiLayer_Inheritance;

public class I4_Main extends I3_Kitten {

	public static void main(String[] args) {
		I4_Main obj = new I4_Main();
		I2_Dog obj1 = new I2_Dog();
		I3_Kitten obj2 = new I3_Kitten();
		obj.weep();
		obj1.barking();
		obj2.eat();
	}

}
