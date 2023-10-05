package N_ForLoops_WhileLoops_DoWhileLoops;
import java.util.*;
public class N2_Loop_Practice {

	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		System.out.print("Enter a value: ");
		int a = obj.nextInt();
		int sum =0;
		for (int i=1; i<=a; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}
}