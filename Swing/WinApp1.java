import javax.swing.*;

public class WinApp1 /* extends JFrame implements ActionListener */{
	
	
	public static void main(String[] args) {
		System.out.println("Start WinApp1");
		/* 
		JFrame 	a = new JFrame("Example");
		JButton b = new JButton("Click Me");
		JTextField c = new JTextField("eduareka");
		c.setBounds(50, 100, 200, 30);
		a.add(c);
		b.setBounds(30, 90, 85, 20);
		a.add(b);
		a.setSize(300, 300);
		a.setLayout(null);
		a.setVisible(true);
		*/
		new WinApp1();
		//System.exit(0);
	}
	
	WinApp1() {
		JFrame 	a = new JFrame("Example");
		JPanel 	p = new JPanel();
		p.setBounds(60, 50, 80, 40);
		JButton b = new JButton("Click Me");
		b.setBounds(30, 90, 85, 20);
		p.add(b);
		a.add(p);
		a.setSize(300, 300);
		a.setLayout(null);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}