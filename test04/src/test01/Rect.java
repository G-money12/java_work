package test01;

public class Rect {
	int width;
	int height;
	
	public Rect() {}             // 기본생성자는 만들지 않으면 컴파일러가 만들어주지만, 하나이상 만든다면 기본생성자를 만들어야한다.
	
	public Rect(int w, int h) {
		width=w;
		height=h;
	}
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1=new Rect();
		System.out.println(r1.width);
		System.out.println(r1.height);
		System.out.println(r1.getArea());
	}

}
