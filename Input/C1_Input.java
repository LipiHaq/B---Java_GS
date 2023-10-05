package C_Input;
import java.util.Scanner;
public class C1_Input {

	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		System.out.print("Enter First Number: ");
		int num1 = obj.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = obj.nextInt();
		int sum = num1+num2;
		//System.out.println("Sum of two number are: " +sum);
		
		System.out.print("Enter Third Number: ");
		Float num3 = obj.nextFloat();
		System.out.print("Enter Fourth Number: ");
		Float num4 = obj.nextFloat();
		Float add = num1+num2+num3+num4;
		System.out.println("Sum of two number are: " +add);
		
	}

}
