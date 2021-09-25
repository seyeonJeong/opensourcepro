package practice04;

public class classprac04 {
	String title;
	String author;
	public classprac04(String t) { // 생성자
	title = t; author = "작자미상";
	}
	public classprac04(String t, String a) { // 생성자
	title = t; author = a;
	}
	public static void main(String [] args) {
	classprac04 littlePrince = new classprac04("어린왕자", "생텍쥐페리");
	classprac04 loveStory = new classprac04("춘향전");
	System.out.println(littlePrince.title + " " + littlePrince.author);
	System.out.println(loveStory.title + " " + loveStory.author);
	}
}
