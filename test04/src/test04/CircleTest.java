package test04;
//class Circle1 {
//	public int radius;
//	public String name;
//	//	public Circle1() 
//	public double getArea() {
//		return 3.14*radius*radius;}}
public class CircleTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Circle1 donut=new Circle1();
//		donut.radius=2;
//		donut.name="자바도넛";
//		double area=donut.getArea();//		
//		System.out.println(donut.name);
//		System.out.println(donut.radius);
//		System.out.println(area);
		Circle pizza=new Circle();		
		pizza.name="자바피자";
		pizza.radius=10;
		double area=pizza.getArea();
		System.out.println(pizza.name);
		System.out.println(pizza.radius);
		System.out.println(area);
	}

}
