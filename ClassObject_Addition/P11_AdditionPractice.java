package P_ClassObject_Addition;

public class P11_AdditionPractice {


	void summation(int a, int b) {
		System.out.println("summation: " +(a+b));
			}

	void subtracton(int c, int d) {
		System.out.println("subtraction: " +(c-d));
		}

	void multiplication(int e, int f) {
		System.out.println("Multiplication: " + (e*f));
			}

	void division(int g, int h) {
		System.out.println("Division: " +(g/h));
	
	}
	
	public static void main(String[] args) {
		P11_AdditionPractice obj = new P11_AdditionPractice();
		obj.summation(2,2);
		obj.subtracton(2,2);
		obj.multiplication(3,2);
		obj.division(3,2);

	}

}
