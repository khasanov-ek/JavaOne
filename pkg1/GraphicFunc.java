package pkg1;

import java.awt.*;
import javax.swing.*;
import java.awt.Graphics2D;

/*
cd D:\GitHub\JavaOne & D:
javac pkg1/GraphicFunc.java & java startGraphicFunc
*/


public class GraphicFunc {
	
	public static void Test() {
		System.out.println("GraphicsFunc.Test");
		JFrame w=new JFrame("Окно с изображением");
		w.setSize(600, 400);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setLayout(new BorderLayout(1,1));
		w.setVisible(true);

	}
	
	public static void paint(Graphics g) {
		g.drawLine(0, 0, 10, 10);
	}
	
}
