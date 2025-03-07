package test01;
	
public class DefaultConstructor {
	int radius;
	void set(int r) {radius=r;}
	double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor pizza=new DefaultConstructor();     // class와 메소드는 이름이 같아야하며
		pizza.set(3);										   // 컴파일러가 자동 완성한것은 이름을 제대로 적어야한다.
	}

}
