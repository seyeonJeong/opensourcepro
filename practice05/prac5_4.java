package practice05;
import java.util.Scanner;
abstract class Converter2 {
abstract protected double convert(double src);
abstract protected String getSrcString();
abstract protected String getDestString();
protected double ratio;
public void run2() {
Scanner scanner = new Scanner(System.in);
System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
System.out.print(getSrcString() + "을 입력하세요>> ");
double val = scanner.nextDouble();
double res = convert(val);
System.out.println("변환 결과: " + res + getDestString() + "입니다.");
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
