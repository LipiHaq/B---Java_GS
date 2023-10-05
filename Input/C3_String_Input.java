package C_Input;
import java.util.Scanner;
public class C3_String_Input {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter First Participant Name: ");
		String Person1 = obj.nextLine();
		System.out.print("Enter Second Participant Name: ");
		String Person2 = obj.nextLine();
		System.out.print("Enter Third Participant Name: ");
		String Person3 = obj.nextLine();
		System.out.println("Today's Participants are "+Person1+","+Person2+","+Person3);
		
	}

}
