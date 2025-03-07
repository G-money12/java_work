package abstractPro;
// 추상 메소드 1개이상 있으면 추상 class를 적어줘야 한다.



abstract class Shape{
	public Shape(){}
	public void paint() {
		draw();
	}
	abstract public void draw();
	}

class Line extends Shape{
	public String toString() {
		return "Line";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Line");
	}

	
}

class Rect extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rect");
	}
	
}
class Circle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	
}
abstract class MyComponent{
	String name;
	public void load(String name) {
		this.name=name;
	}
}

public class AbstractEx01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape s1=new Shape();
		//MyComponent c1=new MyComponent();
		Line l1=new Line();
		Rect r1=new Rect();
		Circle c1=new Circle();
		l1.draw();
		r1.draw();
		c1.draw();
	}

}
// 추상class는 객체를 만들수 없다.