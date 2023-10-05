package M_MethodReturn_Obj;

public class M1_MethodReturn {

	int AddNumbers() {
		System.out.print("Value is: ");
		return 5+9;
	}
	public static void main(String[] args) {
		M1_MethodReturn obj = new M1_MethodReturn();
		System.out.println (obj.AddNumbers());

	}

}
