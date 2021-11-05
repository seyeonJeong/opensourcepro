package practice8;
import java.io.File;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class prac8_14 {
	private File currentDir = null;
	private File subFiles [] = null;
	
	public prac8_14(String dirName) {
		currentDir = new File(dirName);
	}

	private void showSubDirtories() {
		System.out.println("\t[" + currentDir.getPath() + "]");
		subFiles = currentDir.listFiles();
		for(File f : subFiles) {
			System.out.print(((f.isFile())?"file":"dir"));
			System.out.printf("%-15s", "\t\t" + f.length() + "����Ʈ");
			System.out.println("\t\t" + f.getName());
		}		
	}
	
	private void mkdir(String dirName) {
		File newDir = new File(currentDir, dirName); // ������� �ϴ� dirName�� ��ü ��θ� ����� 
		if(newDir.exists()) // �̹� �����Ѵٸ�
			System.out.println("�̹� �����ϴ� �����̳� ���͸� �̸��Դϴ�.");
		else {
			System.out.println(dirName + " ���͸��� �����Ͽ����ϴ�.");
			newDir.mkdir(); // ���͸� ����
			showSubDirtories();
		}
	}
	private void rename(String src, String dest) {
		File srcFile = new File(currentDir, src); // �ҽ� ���� ��θ� 
		File destFile = new File(currentDir, dest); // ���� ���� ��θ� 
		if(destFile.exists()) // �̹� �����Ѵٸ�, �̸� �ٲ� ������
			System.out.println("�̹� �����ϴ� �����̳� ���͸� �̸��Դϴ�. �̸� �ٲ� �� �����ϴ�.");
		else {
			System.out.println(src + "�� " + dest + " �̸� �����Ͽ����ϴ�.");
			srcFile.renameTo(destFile); // �̸� ����
			showSubDirtories();
		}
	}
	
	private boolean contains(String filename) {
		for(File f : subFiles) {
			if(f.getName().equalsIgnoreCase(filename))
				return true;
		}
		return false;
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***** ���� Ž�����Դϴ�. *****");
		showSubDirtories();
		
		while(true) {
			System.out.print(">>");
			String line = scanner.nextLine().trim(); // �� ������ �а� �յڿ� �Է��� ��ĭ �����
			StringTokenizer st = new StringTokenizer(line, " "); // �� ĭ���� �и�
			String command = st.nextToken(); //ù��° ���ڿ�
			if(command.equals("�׸�"))
				break; // ���α׷� ����
			if(command.equals("..")) {
				String s = currentDir.getParent();
				if(s == null) // s�� null�̸�, currentDir�� ���� �ֻ��� ���͸��� �θ� ���͸��� ����
					continue;
				else { 					
					currentDir = new File(currentDir.getParent());
					showSubDirtories();
				}

			}
			if(command.equalsIgnoreCase("mkdir")) {
				try {
					String dirName = st.nextToken(); //�ι�° ���ڿ�
					mkdir(dirName);
				} catch(NoSuchElementException e) {
					System.out.println("������ ���͸����� �־����� �ʾҽ��ϴ�!");
				}
			}
			else if(command.equalsIgnoreCase("rename")) {
				try { 
					String src = st.nextToken(); //�ι�° ���ڿ�
					String dest = st.nextToken(); //�ι�° ���ڿ�
					rename(src, dest);
				} catch(NoSuchElementException e) {
					System.out.println("�� ���� ���ϸ��� �־����� �ʾҽ��ϴ�.!");
				}
			}
			else { // command�� ������丮�̸�
				if(contains(command)) { // ���� ���͸��� �����̳� ������丮���
					if(new File(currentDir, command).isDirectory()) { // ���͸����
						currentDir = new File(currentDir, command);
						showSubDirtories();
					}
					else { // ������ ���
						System.out.println("\t���͸��� �ƴմϴ�.!");
					}
				}
			}
		}
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		prac8_14 fe = new prac8_14("c:\\");
		fe.run();
	}
}
