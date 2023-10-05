package M_MethodReturn_Obj;

public class M4_MethodReturn_Practice_Main {

//	int num1;
//	int num2 ;
//	int num3;
//	int Sum;	
//	
//	int AddNumbers() {	
//		System.out.print("Sum is: ");
//		int Sum = num1+num2+num3;
//		return Sum;
//		}

	int num7;
	int num8 ;
	int num9;
	int Multiplication;	
	
	int MultiplicationNumbers() {	
		System.out.print("Multiplication: ");
		int Multiplication = num7*num8*num9;
		return Multiplication;
		}
	public static void main(String[] args) {
		M2_Sum obj = new M2_Sum();
		obj.num1 = 1;
		obj.num2 = 1;
		obj.num3 = 2;
		System.out.println(obj.AddNumbers());
		
		M3_Substract obj1 = new M3_Substract();
		obj1.num4 = 1;
		obj1.num5 = 1;
		obj1.num6 = 2;
		System.out.println(obj1.SubstractNumbers());
	
		M4_MethodReturn_Practice_Main  obj2 = new M4_MethodReturn_Practice_Main ();
		obj2.num7 = 1;
		obj2.num8 = 1;
		obj2.num9 = 2;
		System.out.println(obj2.MultiplicationNumbers());
	}

}
