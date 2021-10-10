package practice05;

class Point {
private int x, y;
public Point() {this.x = 0; this.y = 0;} //기본 생성자 추가
public Point(int x, int y) {this.x = x; this.y = y;}
public int getX() {return x;}
public int getY() {return y;}
protected void move(int x, int y) {this.x = x; this.y = y;}
}


public class prac5_6 extends Point {
	
	private String color;
	
	public prac5_6()
	{
		this.color = "Black";
	}
	
	public prac5_6(int x, int y)
	{
		super(x,y);
	}
	
	public void setXY(int x, int y)
	{
		move(x,y);
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public String toString()
	{
		return color + "색의 " + "(" + getX() + "," + getY() + ")의 점";
	}
	public static void main(String[] args) {
		prac5_6 zeroPoint = new prac5_6();
		System.out.println(zeroPoint.toString() + "입니다.");
		prac5_6 cp = new prac5_6(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
		}



}
