package practice04;

import java.util.Scanner;

public class classprac02 {
	int width;
	int height;
	public int getArea() {
	return width*height;
	}
	public static void main(String[] args) {
	classprac02 rect = new classprac02(); // 객체 생성
	Scanner scanner = new Scanner(System.in);
	System.out.print(">> ");
	rect.width = scanner.nextInt();
	rect.height = scanner.nextInt();
	System.out.println("사각형의 면적은 " + rect.getArea());
	scanner.close();
	}
}
