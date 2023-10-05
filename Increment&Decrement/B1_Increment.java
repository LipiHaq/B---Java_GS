//Homework
package B_Increment_Decrement;

public class B1_Increment {
	
	public static void main(String[] args) {
		int num1 = 17;
		System.out.println("Pre decrement: "+ --num1); //16
		num1++; //
		System.out.println("Post Increment: "+num1++); 
		System.out.println("Post decrement: "+num1--); 
		num1--;
		System.out.println("Pre Increment: "+ ++num1); 
		++num1;
		System.out.println("Pre decrement: "+ --num1); 
		System.out.println("Pre Increment: "+ num1++); 
	}
}

//	Pre-increment = 
//	++num --> increase by one and print that value.

//	Post-increment =
//	Num++ --> print current value, increase the value by one. 

//	Pre-decrement = 
//	--Num --> decrease by one and print that value.

//	Post-decrement =
//	Num -- --> print current value, decrease the value by one.
