package classprac1008;
class Point1 {
private int x, y; // �� ���� �����ϴ� x, y ��ǥ
public Point1() {
this.x = this.y = 0;
}
public Point1(int x, int y) {
this.x = x; this.y = y;
}
public void showPoint() { // ���� ��ǥ ���
System.out.println("(" + x + "," + y + ")");
}
}
class ColorPoint1 extends Point1 {
private String color; // ���� ��
public ColorPoint1(int x, int y, String color) {
super(x, y); // Point�� ������ Point(x, y) ȣ��
this.color = color;
}
public void showColorPoint() { // �÷� ���� ��ǥ ���
System.out.print(color);
showPoint(); // Point Ŭ������ showPoint() ȣ��
}
}
public class classprac5_3 {
	public static void main(String[] args) {
		ColorPoint1 cp = new ColorPoint1(5, 6, "blue");
		cp.showColorPoint();
		}
}
