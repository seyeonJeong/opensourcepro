package classprac1112;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class classprac7 extends JFrame{
	private JLabel la = new JLabel();
	public classprac7() {
	setTitle("Key Code ���� : F1Ű:�ʷϻ�, % Ű �����");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.addKeyListener(new MyKeyListener());
	c.add(la);
	setSize(300,150);
	setVisible(true);
	c.setFocusable(true);
	c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {

		public void keyPressed(KeyEvent e) {
		la.setText(e.getKeyText(e.getKeyCode()));

		if(e.getKeyChar() == '%')
		getContentPane().setBackground(Color.YELLOW);
		else if(e.getKeyCode() == KeyEvent.VK_F1)
		getContentPane().setBackground(Color.GREEN);
		}
		}
		public static void main(String [] args) {
		new classprac7();
		}
}