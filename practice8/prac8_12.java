package practice8;
import java.io.*;
import java.util.*;
public class prac8_12 {
	private File targetFile = null;
	Vector<String> lineVector = new Vector<String>();
	
	public prac8_12() { }
	
	private void readFile(String fileName) {
		targetFile = new File(fileName);
		try {
			Scanner fScanner = new Scanner(new FileReader(targetFile));
			while(fScanner.hasNext()) { // ������ ���� ������ ��� �б�
				String line = fScanner.nextLine(); // �� ���� �а�
				lineVector.add(line); // �� ������ ���Ϳ� ����
			}			
			fScanner.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Vector<Integer> searchWord(String word) { // word�� ���Ե� ���� ��ȣ���� ���ͷ� ����
		Vector<Integer> noVector = new Vector<Integer>();
		for(int i=0; i<lineVector.size(); i++) {
			String line = lineVector.get(i);
			if(line.indexOf(word) != -1) 
				noVector.add(i);
		}
		
		return noVector;
	}

	private void printLines(Vector<Integer> noVector) {
		for(int i=0; i<noVector.size(); i++) {
			int lineNo = noVector.get(i);
			String line = lineVector.get(lineNo);
			System.out.println(lineNo + ":" + line);
		}
	}
	
	public void run() {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();

		readFile(fileName); // ������ ���� ������ ���ͷ� �о����
		
		while(true) {
			System.out.print("�˻��� �ܾ ����>> ");
			String line = scanner.nextLine();
			if(line.equals("�׸�"))
				break; // ���α׷� ����
			Vector<Integer> noVector = searchWord(line); // line�� �ܾ �����ϴ¸�� ���� ��ȣ ����
			printLines(noVector);
		}
		scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
	public static void main(String[] args) {
		prac8_12 ws = new prac8_12();
		ws.run();
	}
}
