package Q_Inter_face;

interface A{
	void method1();
}
interface B{
	void method2();
}

public class MyClass implements A, B {
	public void method1(int a, int b) {
		System.out.println("Method1 value is:" + (a+b) );
	}
	public void method2(int a, int b, int c) {
		System.out.println("Method2 value is:" + (a+b+c));
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
}
