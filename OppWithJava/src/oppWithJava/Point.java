package oppWithJava;

public class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY(){
		return y;
	}
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
public class Color{	
	private String z;
	
	public Color (String z) {		
		this.z=z;
	}
	
	public String getZ() {
		return z;
	}
	protected void move(int x, int y, String z) {		
		this.z=z;
	}
}
}
