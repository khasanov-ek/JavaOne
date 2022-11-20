import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameTest {	
	
	public static void main(String[] args) {
		System.out.println("Start JFrameTest");
		
		JFrame frame = new JFrame("Test Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);	
		
		
		
		System.out.println("End JFrameTest");
	}
	
}