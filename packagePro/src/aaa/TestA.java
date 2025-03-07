package aaa;
														
class TestB{                
	private int a;
	void func1() {
		 a=10;
	 }
	 public void func2() {
		 System.out.println("func2");
	 }
}

public class TestA {
	void func1() {
		TestB b=new TestB();
		//b.a=10;                    private int a; 이기때문에 같은 class내에서만 사용가능하다.
		b.func1();
	}
	public void func2() {
		System.out.println("func2");
	}
}
