package practice05;
import java.util.Scanner;
abstract class Shape{
private Shape next;
public Shape() {next = null;}
public void setNext(Shape obj) {next = obj;}
public Shape getNext() {return next;}
public abstract void draw();
}

class Line extends Shape
{
	String name = "line";
	public void draw()
	{
		System.out.println("Line");
	}
}
class Rect extends Shape
{
	String name = "Rect";
	public void draw()
	{
		System.out.println("Rect");
	}
}

class Circle extends Shape
{
	String name = "circle";
	public void draw()
	{
		System.out.println("Circle");
	}
}
public class prac5_12
{
	private Shape head, tail;
	private Scanner scanner;
	public prac5_12()
	{
		head = null;
		tail = null;
		scanner = new Scanner(System.in);
	}
	public void run()
	{
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		while(true)
		{
			System.out.println("����(1),����(2),��κ���(3),����(4)>>");
			int n = scanner.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("Line(1),Rect(2),Circle(3)>>");
			    n = scanner.nextInt();
			    insert(n);
			    break;
		    case 2:
		    	System.out.println("������ ������ ��ġ >> ");
		        n = scanner.nextInt();
		        delete(n);
		        break;
		    case 3:
		    	print();
		        break;
		    case 4:
		    	System.out.println("beauty�� �����մϴ�.");
		        scanner.close();
		        return;
			}
		}
	}
	public void insert(int draw)
	{
		Shape gra;
		switch(draw)
		{
		case 1:
			gra = new Line();
			break;
		case 2:
			gra = new Rect();
			break;
		case 3:
			gra = new Circle();
			break;
		default:
			System.out.println("�ٽ� �Է��� �ּ���.");
			return;
			
		}
		if(head == null)
		{
			head = gra;
			tail = gra;
		}
		else
		{
			tail.setNext(gra);
			tail = gra;
		}
	}
	public void print()
	{
		Shape a = head;
		while(a!=null)
		{
			a.draw();
			a = a.getNext();
		}
	}
	public void delete(int n)
	{
		Shape cur = head;
		Shape tp = head;
		int a;
		if(n == 1)
		{
			if(head == tail)
			{
				head = null;
				tail = null;
				return;
			}
			else
			{
				head = head.getNext();
				return;
			}
		}
		for(a=1;a<n;a++)
		{
			tp = cur;
			cur = cur.getNext();
			if(cur == null)
			{
				System.out.println("������ �� �����ϴ�.");
				return;
			}
		}
		if(a == n)
		{
			tp.setNext(cur.getNext());
			tail = tp;
		}
		else
			tp.setNext(cur.getNext());
	}
	public static void main(String[] args)
	{
		prac5_12 editor = new prac5_12();
		editor.run();
	}
}


