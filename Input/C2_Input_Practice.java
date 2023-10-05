package C_Input;

import java.util.Scanner;

public class C2_Input_Practice {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		System.out.print("My name is: ");
		String name = obj.nextLine();
		System.out.print("My age is: ");
		int age = obj.nextInt();
		System.out.print("My birth year is: ");
		int birthyear = obj.nextInt();
		System.out.print("My State is: ");
		String state = obj.next();
		System.out.print("My Subject is: ");
		String Subject = obj.next();
		
		System.out.println("My name is "+name+", " +"My age is "+age+", " +"My birth year is "+birthyear+", " +"I live in "+state+", " +"My Subject is "+Subject);
	
	}

}
