package practice04;

import java.util.Scanner;

class Phone
{
	private String name;
	private String tel;
	Phone(String name, String tel)
	{
		this.name = name;
		this.tel = tel;
	}
	public String getName()
	{
		return name;
	}
	public String getTel()
	{
		return tel;
	}
}

public class prac08 {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		System.out.print("�ο���>>");
		num = scanner.nextInt();
		Phone ph[] = new Phone[num];
		for(int i=0;i<num;i++)
		{
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = scanner.next();
			String phone = scanner.next();
			ph[i] = new Phone(name,phone);
		}
		System.out.println("����Ǿ����ϴ� . . .");
		for(int i=0;true;i++)
		{
			System.out.print("�˻��� �̸�>>");
			String name = scanner.next();
			int a = 0;
			if("�׸�".equals(name))
				break;
			for(int j=0;j<num;j++)
			{
				if(ph[j].getName().equals(name)) {
					System.out.println(ph[j].getName()+"�� ��ȣ��"+ph[j].getTel()+"�Դϴ�.");
					a = 1;
				}
			}
			if(a==0)
				System.out.println(name+"�� �����ϴ�.");
		
		}
		
	}

}
