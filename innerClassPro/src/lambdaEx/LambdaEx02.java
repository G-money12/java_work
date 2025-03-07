package lambdaEx;

interface Unit6{
	void move(String s);
}

public class LambdaEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit6 unit=new Unit6() {

			@Override
			public void move(String s) {
				// TODO Auto-generated method stub
				System.out.println(s);
			}
			
		};		// 새미 콜론을 붙이기 익명의 내부 클래스
		unit.move("Lambda : Unit6");
	}

}
