import java.awt.*;
import javax.swing.*;

public class Gr1 extends JFrame{
	Gr1(String s){
		super(s);
		setLayout(null);
		setSize(300,500);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint1(Graphics g){
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 300, 800);
		g.setColor(Color.BLACK);
		g.drawOval(90, 50, 100, 100);
		g.drawLine(140, 150, 140, 300);
		g.drawLine(140, 300, 100, 400);
		g.drawLine(140, 300, 180, 400);
		g.drawLine(140, 200, 75, 250);
		g.drawLine(140, 200, 205, 250);
	}
	
	public static void main(String[] args) {
		new Gr1("");
	}
}