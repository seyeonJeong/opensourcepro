package practice04;

public class classprac04 {
	String title;
	String author;
	public classprac04(String t) { // ������
	title = t; author = "���ڹ̻�";
	}
	public classprac04(String t, String a) { // ������
	title = t; author = a;
	}
	public static void main(String [] args) {
	classprac04 littlePrince = new classprac04("�����", "�������丮");
	classprac04 loveStory = new classprac04("������");
	System.out.println(littlePrince.title + " " + littlePrince.author);
	System.out.println(loveStory.title + " " + loveStory.author);
	}
}
