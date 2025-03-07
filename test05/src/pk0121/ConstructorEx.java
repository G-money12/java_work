package pk0121;

class A{
	public A() {
		super();
		System.out.println("생성자A");
	}
	public A(int x) {
		System.out.println(x);
	}
}
class B extends A{
	public B(int x) {
		super(x);
		System.out.println("생성자B");
	}
}
class C extends B{
	public C(int x) {
		super(x);
		System.out.println("생성자C");
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C(1);
	}

}
