package E_Parameters;

public class E3_Parameters_HW {
	int Add (int a, int b,int c) {
	System.out.print("The result of the sum are: ");
	return a+b+c;}
	
	
	int Multiply (int d, int e) {
	System.out.print("The result of the multiplications are: ");
	return d*e;}
	
	void Remainder(int f, int g){
		System.out.print("The result of the division are: ");
		System.out.println(f%g);
	}
	public static void main(String[] args) {
		E3_Parameters_HW obj = new E3_Parameters_HW ();
		System.out.println(obj.Add(23,12,12));
		System.out.println(obj.Multiply (23,12));
		obj.Remainder(2,2);
	}
}
