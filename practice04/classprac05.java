package practice04;

public class classprac05 {
	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	public classprac05() {
	this("", "");
	System.out.println("������ ȣ���");
	}
	public classprac05(String title) {
	this(title, "���ڹ̻�");
	}
	public classprac05(String title, String author) {
	this.title = title; this.author = author;
	}
	public static void main(String [] args) {
	classprac05 littlePrince = new classprac05("�����", "�������丮");
	classprac05 loveStory = new classprac05("������");
	classprac05 emptyclassprac05 = new classprac05();
	classprac05 bible = new classprac05("Bible");

	bible.show();
	}

}
