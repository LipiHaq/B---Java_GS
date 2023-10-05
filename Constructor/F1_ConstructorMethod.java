package F_Constructor;

public class F1_ConstructorMethod {

	F1_ConstructorMethod(int a, int b){
		System.out.println("Hello Constructor 1");
		System.out.println("sum are: " + (a+b));
	}
	
	F1_ConstructorMethod(int a, int b, int c){
		System.out.println("Hello Constructor 2");
		System.out.println("sum are: " + (a+b)+c);
	}
	void Sum() {
		System.out.println("This is Sum");
		
		
	}
	public static void main(String[] args) {
		F1_ConstructorMethod obj = new F1_ConstructorMethod(45, 10);
		F1_ConstructorMethod obj1 = new F1_ConstructorMethod(45, 10, 11);
		obj.Sum();

	}

}
