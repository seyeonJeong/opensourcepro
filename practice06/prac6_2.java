package practice06;

public class prac6_2 {
	private int x, y, radius;
	
	public prac6_2(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle("+x+","+y+")������"+radius;
	}
	
	public boolean equals(Object obj) {
		prac6_2 p = (prac6_2)obj;
		if(p.x == x && p.y == y) //�߽��� ������ ���� ���̴�.
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		prac6_2 a = new prac6_2(2, 3, 5); // �߽� (2, 3)�� ������ 5�� ��
		prac6_2 b = new prac6_2(2, 3, 30); // �߽� (2, 3)�� ������ 30�� ��
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if(a.equals(b))
			System.out.println("���� ��");
		else 
			System.out.println("���� �ٸ� ��");
	}
}
