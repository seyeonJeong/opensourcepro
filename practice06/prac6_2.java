package practice06;

public class prac6_2 {
	private int x, y, radius;
	
	public prac6_2(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle("+x+","+y+")반지름"+radius;
	}
	
	public boolean equals(Object obj) {
		prac6_2 p = (prac6_2)obj;
		if(p.x == x && p.y == y) //중심이 같으면 같은 원이다.
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		prac6_2 a = new prac6_2(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
		prac6_2 b = new prac6_2(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else 
			System.out.println("서로 다른 원");
	}
}
