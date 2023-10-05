package N_ForLoops_WhileLoops_DoWhileLoops;

public class N11_ForLoop_HW {

	public static void main(String[] args) {
		for (int i=1; i<= 50; i++) {
			
			if (i%3==0 && i%5==0){
			System.out.println("Lipi Haq");
		}
			
			else if (i%3 ==0) {
			System.out.println("Lipi");
		}
			else if (i%5==0) {
			System.out.println("Haq");
		}
			else {
			System.out.println(i);
		}		
		
		}
	}
}
