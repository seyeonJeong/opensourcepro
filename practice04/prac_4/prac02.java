package practice04;

import java.util.Scanner;

class Grade{
	int math,science,english;
	int average;
	
	public Grade(){
		math = 0;
		science = 0;
		english = 0;
		average = 0;
	}
	
	public int calcavg(int math, int science, int english)
	{
		return (math+science+english)/3;
	}
}

public class prac02 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		Grade class1;
		class1 = new Grade();
		class1.math = scanner.nextInt();
		class1.science = scanner.nextInt();
		class1.english = scanner.nextInt();
		class1.average = class1.calcavg(class1.math,class1.science,class1.english);
		
		System.out.println("�����"+class1.average);
		
		scanner.close();
	}
	


}
