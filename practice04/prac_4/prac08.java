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
		System.out.print("인원수>>");
		num = scanner.nextInt();
		Phone ph[] = new Phone[num];
		for(int i=0;i<num;i++)
		{
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String phone = scanner.next();
			ph[i] = new Phone(name,phone);
		}
		System.out.println("저장되었습니다 . . .");
		for(int i=0;true;i++)
		{
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			int a = 0;
			if("그만".equals(name))
				break;
			for(int j=0;j<num;j++)
			{
				if(ph[j].getName().equals(name)) {
					System.out.println(ph[j].getName()+"의 번호는"+ph[j].getTel()+"입니다.");
					a = 1;
				}
			}
			if(a==0)
				System.out.println(name+"이 없습니다.");
		
		}
		
	}

}
