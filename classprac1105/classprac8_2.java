package classprac1105;
import java.io.*;

public class classprac8_2 {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
		fin = new FileInputStream("c:\\Temp\\hangul.txt");
		in = new InputStreamReader(fin, "UTF-8");
		int c;
		System.out.println("���ڵ� ���� ������ " + in.getEncoding());
		while ((c = in.read()) != -1) {
		System.out.print((char)c);
		}
		in.close();
		fin.close();
		} catch (IOException e) {
		System.out.println("����� ����");
		}
		}

}
