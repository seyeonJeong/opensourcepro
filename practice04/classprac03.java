package practice04;

public class classprac03 {
	int radius;
	String name;
	public classprac03() { // �Ű� ���� ���� ������
	radius = 1; name = ""; // radius�� �ʱⰪ�� 1
	}
	public classprac03(int r, String n) { // �Ű� ������ ���� ������
	radius = r; name = n;
	}
	public double getArea() {
	return 3.14*radius*radius;
	}
	public static void main(String[] args) {
	classprac03 pizza = new classprac03(10, "�ڹ�����"); // classprac03 ��ü ����, ������ 10
	double area = pizza.getArea();
	System.out.println(pizza.name + "�� ������ " + area);
	classprac03 donut = new classprac03(); // classprac03 ��ü ����, ������ 1
	donut.name = "��������";
	area = donut.getArea();
	System.out.println(donut.name + "�� ������ " + area);
	}

}
