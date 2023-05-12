import java.awt.*;
import javax.swing.*;


public class WinApp3 {

	WinApp3() {
		JFrame vFrame = new JFrame("Example");
		//JPanel vPanel1 = new JPanel();
		//vPanel1.setBounds(2, 2, 150, 356);
		//vPanel1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		
		//vFrame.add(vPanel1);
		vFrame.setSize(400, 400);
		//vFrame.setLayout(null);
		vFrame.setLocationRelativeTo(null);
		vFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Canvas vCanvas = new Canvas() {
			@Override
			public void paint(Graphics g) {
				g.drawLine(10, 10, 180, 180);
				g.setColor(Color.BLUE);
				g.drawOval(50, 50, 30, 30);
			}
		};
		vFrame.add(vCanvas);
		vFrame.setVisible(true);
	}
	

	public static void main(String[] args) {
		System.out.println("Start WinApp3");
		System.out.println("JPanel");
		new WinApp3();
	}
	
}