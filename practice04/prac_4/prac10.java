package practice04;

import java.util.Scanner;

class Dictionary{
	private static String[] kor = {"���","�Ʊ�","��","�̷�","���"};
	private static String[] eng = {"love","baby","money","future","hope"};
	public static String KortoEng(String word)
	{
		for(int i=0;i<kor.length;i++)
		{
			if(word.equals(kor[i])) {
				if(i%2==0)
					System.out.print(word+"��");
				else
					System.out.print(word+"��");
				return eng[i];
			}

		}
		return "false";
		
	}
}

public class prac10 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true)
		{
			System.out.print("�ѱ� �ܾ�?");
			String words = scanner.next();
			if(words.equals("�׸�"))
				break;
			String eng = Dictionary.KortoEng(words);
			if(eng.equals("false"))
				System.out.println(words+"�� ���� ������ �����ϴ�.");
			else
				System.out.println(eng);
			
			
		}
	}

}
