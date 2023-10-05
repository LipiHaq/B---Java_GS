package E_Parameters;

public class E1_Parameters {
	//creating a method here
	int Aaddnumber(int a, int b) {
		System.out.println("Sum are: ");
		return a+b;
	}

	public static void main(String[] args) {
		E1_Parameters obj = new E1_Parameters();
		System.out.print(obj.Aaddnumber(23,12));
		System.out.print(obj.Aaddnumber(20,12));

	}

}
