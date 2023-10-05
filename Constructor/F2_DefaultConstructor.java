package F_Constructor;

public class F2_DefaultConstructor {

	int a;
	int b;

//The following method is created by default so it will print 0 
//	B1_DefaultConstructor (){
//		a =0;
//		b=0;
//	}
	public static void main(String[] args) {
		F2_DefaultConstructor obj = new F2_DefaultConstructor();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
