package classprac1112;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class classprac1 extends JFrame  {
	public classprac1() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // Action ������ �ޱ�
		c.add(btn);
		setSize(350, 150);
		setVisible(true); }
		
		public static void main(String [] args) {
		new classprac1();
		}
		}
		class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
		b.setText("�׼�");
		else
		b.setText("Action");
		}
}
