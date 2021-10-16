package practice06;
import java.util.Scanner;
class Person0 {
	private int num1, num2, num3;
	public String name;
	public Person0(String name) {
		this.name = name;
	}
	public boolean game() {
		num1 = (int) ((Math.random()*3)+1);
		num2 = (int) ((Math.random()*3)+1);
		num3 = (int) ((Math.random()*3)+1);
		System.out.print("\t"+num1+"  "+num2+"  "+num3+"  ");
		if(num1 == num2 && num2 == num3)
			return true;
		else 
			return false;
	}
}
public class prac6_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		String name = sc.next();
		Person0 person1 = new Person0(name);
		System.out.print("2번째 선수 이름>>");
		name =sc.next();
		Person0 person2 = new Person0(name);
		String buffer = sc.nextLine();
		while(true) {
			System.out.print("["+person1.name+"]:<Enter>");
			buffer = sc.nextLine();
			if(person1.game()) {
				System.out.println(person1.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
			System.out.print("["+person2.name+"]:<Enter>");
			buffer = sc.nextLine();
			if(person2.game()) {
				System.out.println(person2.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
		}
		sc.close();
	}
}
