import javax.swing.*;

public class WinApp2 {
	
	JMenu menu;
	JMenuItem a1, a2;
	
	WinApp2() {
		JFrame a = new JFrame("Example");
		menu = new JMenu("Options");
		JMenuBar m1 = new JMenuBar();
		a1 = new JMenuItem("Example1");
		a2 = new JMenuItem("Example2");
		menu.add(a1);
		menu.add(a2);
		m1.add(menu);
		a.setJMenuBar(m1);
		a.setSize(400, 400);
		a.setLayout(null);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {
		System.out.println("Start WinApp2");
		new WinApp2();
	}
}

