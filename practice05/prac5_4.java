package practice05;
import java.util.Scanner;
abstract class Converter2 {
abstract protected double convert(double src);
abstract protected String getSrcString();
abstract protected String getDestString();
protected double ratio;
public void run2() {
Scanner scanner = new Scanner(System.in);
System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
System.out.print(getSrcString() + "�� �Է��ϼ���>> ");
double val = scanner.nextDouble();
double res = convert(val);
System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�.");
scanner.close();
}
}

public class prac5_4 extends Converter2
{
	public prac5_4(double ratio)
	{
		this.ratio = ratio;
	}
	protected double convert(double src)
	{
		return src / ratio;
	}
	
	protected String getSrcString()
	{
		return "Km";
	}
	
	protected String getDestString()
	{
		return "Mile";
	}
	
	public static void main(String[] args)
	{
		prac5_4 toMile = new prac5_4(1.6);
		toMile.run2();
	}
}
