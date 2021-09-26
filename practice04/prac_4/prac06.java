package practice04;

import java.util.Scanner;

class C1
{
	private double x,y;
	private int radius;
	public C1(double x, double y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show()
	{
		System.out.println("(" + x +"," + y +")"+radius);
	}
	public int getradius()
	{
		return radius;
	}
	public double getx()
	{
		return x;
	}
	public double gety()
	{
		return y;
	}
}

public class prac06 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		C1 c[] = new C1[3];
		for(int i=0; i<3; i++)
		{
			System.out.print("x,y,radius >>");
			double x1 = scanner.nextDouble();
			double y1 = scanner.nextDouble();
			int radiu = scanner.nextInt();
			c[i] = new C1(x1,y1,radiu);
			
		}
		int max = c[0].getradius();
		int count = 0;
		
		for(int i=1;i<3;i++)
		{
			if(max<c[i].getradius())
			{
				max = c[i].getradius();
				count = i;
			}
		}
		
		System.out.println("가장 면적이 큰 원은 ("+c[count].getx()+","+c[count].gety()+")"+c[count].getradius() );

		scanner.close();
	}

}
