package practice04;

import java.util.Scanner;

public class classprac02 {
	int width;
	int height;
	public int getArea() {
	return width*height;
	}
	public static void main(String[] args) {
	classprac02 rect = new classprac02(); // ��ü ����
	Scanner scanner = new Scanner(System.in);
	System.out.print(">> ");
	rect.width = scanner.nextInt();
	rect.height = scanner.nextInt();
	System.out.println("�簢���� ������ " + rect.getArea());
	scanner.close();
	}
}
