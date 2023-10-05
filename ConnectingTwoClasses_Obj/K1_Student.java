package K_ConnectingTwoClasses_Obj;

public class K1_Student {

	int a =10;
	String name = "Lipi";
	
	public static void main(String[] args) {
		K1_Student obj =new K1_Student();
		System.out.println(obj.a);
		System.out.println(obj.name);
		
		K2_Lamp obj1 =new K2_Lamp ();
		obj1.turnOn();

	}

}
