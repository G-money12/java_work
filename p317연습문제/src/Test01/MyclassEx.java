package Test01;

public class MyclassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass<String> s=new MyClass<>();
		s.set("Hello");
		System.out.println(s.get());
		
		MyClass<Integer> n=new MyClass<>();
		n.set(10);
		System.out.println(n.get());
	}

}
