package test01;

class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x:"+x+",y:"+y;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Point other=(Point)obj;         // down casting
		if(this.x==other.x && this.y==other.y)
			return true;
		else
			return false;
	}
	
}

public class ObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("abcd");
		String s2=new String("abcd");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		Point p1=new Point(2,3);
		Point p2=new Point(3,4);
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}

}
