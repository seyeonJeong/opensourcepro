package practice04;

class Rectangle
{
	int x,y,width,height;
	Rectangle(int a, int b, int w, int h){
		x = a;
		y = b;
		width = w;
		height = h;
	}
	public int square() {
		return width*height;
	}
	public void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"*"+height+"인 사각형");
		
	}
	boolean contains(Rectangle r)
	{
		if(x<r.x&&y<r.y) 
			if((width+x)>(r.x+r.width)&&(height+y)>(r.y+r.height))
				return true;
		
		return false;

	}
}

public class prac04 {
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
		
	}

}
