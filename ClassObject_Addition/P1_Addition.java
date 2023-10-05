package P_ClassObject_Addition;

public class P1_Addition {
	int num1 = 5;
	int num2 = 10;
// define the method 
//First Method
	void sum(int a, int b) {
			System.out.println("sum are: "+(a+b));
		}
//Second Method	
	void message(String msg, String msg2) {
		System.out.println(msg + " " +msg2);
	}
	
	void EvenOrOdd(int num) {
		if(num % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
//Main Method	
	public static void main(String[] args) {
		P1_Addition obj = new P1_Addition();
		System.out.println(obj.num1+ " " +obj.num2); {
		obj.sum(25,20); //Accessing the method outside of main method
		obj.message("Hello", "Lipi");
		obj.EvenOrOdd(20);
		}
	}
}
