package practice07;
import java.util.Vector;
import java.util.Scanner;
public class prac7_4 {
	public static void main(String[] args) {
		Vector<Integer> stack = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����) >> ");
			int num = sc.nextInt();
			if(num == 0)
				break;
			stack.add(num);
			int avr =0;
			for(int i=0; i<stack.size(); i++) {
				System.out.print(stack.get(i)+" ");
				avr += stack.get(i);
			}
			System.out.println();
			avr /= stack.size();
			System.out.println("���� ��� "+avr);
		}
		
		sc.close();
	}
}