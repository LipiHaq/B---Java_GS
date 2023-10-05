package D_Condition;
import java.util.*;
public class D2_Condition_HW {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int yearA =obj.nextInt();
		if ((yearA %400 ==0) || (yearA%4==0 && yearA%100!=0)) {
			
			System.out.println ("This is a leap year");}
		else {
			System.out.println ("This is not a leap year");}
		}

}
