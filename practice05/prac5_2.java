package practice05;

class TV{
	   private int size;
	   public TV(int size) { this.size = size; }
	   protected int getSize() { return size; }
	}
class ColorTV extends TV{
	private int nColors;
	public ColorTV(int size, int nColors)
	{
		super(size);
		this.nColors = nColors;
	}
	protected int getnColors()
	{
		return nColors;
	}
	public void printProperty()
	{
		System.out.println(getSize() + "��ġ " + nColors + "�÷�");
	}
}
	   

public class prac5_2 extends ColorTV
{
	private String ip;
	public prac5_2(String ip, int size, int nColors)
	{
		super(size,nColors);
		this.ip = ip;
	}
	public void printProperty()
	{
		System.out.println("���� IPTV�� " + ip + " �ּ��� " + getSize() + "��ġ " + getnColors() + "�÷�");
	}
	public static void main(String[] args)
	{
		prac5_2 myTV = new prac5_2("192.1.1.2",32,2048);
		myTV.printProperty();
	}
}
