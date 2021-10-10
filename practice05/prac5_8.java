package practice05;
class Point2 {
private int x, y;
public Point2() {this.x = 0; this.y = 0;}
public Point2(int x, int y) {this.x = x; this.y = y;}
public int getX() {return x;}
public int getY() {return y;}
protected void move(int x, int y) {this.x = x; this.y = y;}
}


public class prac5_8 extends Point2 {
	public prac5_8(int x, int y)
	{
		super(x,y);
		if(x<0||y<0)
			move(0,0);
	}
	public prac5_8()
	{
	}
	
	protected void move(int x, int y)
	{
		if(x>=0 && y>=0)
			super.move(x,y);
	}
	public String toString()
	{
		return "(" + getX() + "," + getY() + ")의 점";

	}
	public static void main(String[] args) {
		prac5_8 p = new prac5_8();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		prac5_8 p2 = new prac5_8(-10, -10);
		System.out.println(p2.toString() + "입니다.");
		}


	

}
