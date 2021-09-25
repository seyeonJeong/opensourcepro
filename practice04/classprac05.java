package practice04;

public class classprac05 {
	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	public classprac05() {
	this("", "");
	System.out.println("생성자 호출됨");
	}
	public classprac05(String title) {
	this(title, "작자미상");
	}
	public classprac05(String title, String author) {
	this.title = title; this.author = author;
	}
	public static void main(String [] args) {
	classprac05 littlePrince = new classprac05("어린왕자", "생텍쥐페리");
	classprac05 loveStory = new classprac05("춘향전");
	classprac05 emptyclassprac05 = new classprac05();
	classprac05 bible = new classprac05("Bible");

	bible.show();
	}

}
