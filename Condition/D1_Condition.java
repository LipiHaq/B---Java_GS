package D_Condition;
import java.util.*;
public class D1_Condition {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);	
		System.out.println("Enter your age: ");
		int age = obj.nextInt();
		if(age >= 18) {
			System.out.println("You are eligible to vote");
		}
		else {
		System.out.println("You are not eligible to vote");
		}	
	
//	Class Exercise 1:
//		System.out.print("Enter a number: ");
//		int num = obj.nextInt();
//		if (num %2==0){
//			System.out.println("It is an even number");
//		}
//		else {
//			System.out.println("This is an odd number");
//		}

//// Class Exercise 2:
//		System.out.print("Enter your Grade: ");
//		int grade = obj.nextInt();
//		if (grade >=90 && grade <=100){
//			System.out.println("Your grade is A");
//		}
//		else if(grade >=80 && grade <90) {
//			System.out.println("Your grade is B");
//		}
//		else if  (grade >=70 && grade <80) {
//			System.out.println("Your grade is C");
//		}
//			else if  (grade >=60 && grade <70) {
//				System.out.println("Your grade is D");
//			}
//				else if  (grade >=50 && grade <60) {
//					System.out.println("Your grade is F");
//				}
//					else {
//						System.out.println("Invalid Number");
//					}	
			
//Class Exercise 3:
	
		System.out.print("Enter a number: ");
		int numA =obj.nextInt();
		if (numA ==1) {
			System.out.println ("Today is Saturday");
		}
			else if (numA ==2) {
				System.out.println ("Today is Sunday");
		}
			else if (numA ==3) {
				System.out.println ("Today is Monday");
		}
			else if (numA ==4) {
				System.out.println ("Today is Tuesday");
		}
			else if (numA ==5) {
				System.out.println ("Today is Wednesday");
		}
			else if (numA ==6) {
				System.out.println ("Today is Thursday");
		}
			else if (numA ==7) {
				System.out.println ("Today is Friday");
		}
			else if (numA ==5) {
				System.out.println ("Today is Wednesday");
		}
			else {
				System.out.println ("Invalid Number");	
		}		
			
	}
}


	
	

	
