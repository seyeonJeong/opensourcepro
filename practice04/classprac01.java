package practice04;

public class classprac01 {
	int radius; // ���� ������ �ʵ�
	String name; // ���� �̸� �ʵ�
	public classprac01() { } // ���� ������
	public double getArea() { // ���� ���� ��� �޼ҵ�
	return 3.14*radius*radius;
	}
	public static void main(String[] args) {
	classprac01 pizza;
	pizza = new classprac01(); // classprac01 ��ü ����
	pizza.radius = 10; // ������ �������� 10���� ����
	pizza.name = "�ڹ�����"; // ������ �̸� ����
	double area = pizza.getArea(); // ������ ���� �˾Ƴ���
	System.out.println(pizza.name + "�� ������ " + area);
	classprac01 donut = new classprac01(); // classprac01 ��ü ����
	donut.radius = 2; // ������ �������� 2�� ����
	donut.name = "�ڹٵ���"; // ������ �̸� ����
	area = donut.getArea(); // ������ ���� �˾Ƴ���
	System.out.println(donut.name + "�� ������ " + area);
	}

}
