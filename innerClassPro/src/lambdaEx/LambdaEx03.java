package lambdaEx;

interface Unit7{
	//void move(String s);
	//int getLength(String s);
	//int sum(int a, int b);
	void move();
}

public class LambdaEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit7 unit =()-> System.out.println("aaa");
		
		//Unit7 unit=(a, b)->{
		//	return  a+b;
		//};
		//System.out.println(unit.sum(10,20));
		//Unit7 unit= s->	System.out.println("Lambda Unit7");
		//Unit7 unit = s->{
		//	return s.length();
		//	};
			
		//int len=unit.getLength("abcd");
		//System.out.println(len);
		//unit.move("Lambda Unit7");
		
	}

}
