import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Example {

	
  public static void main(String args[]) {
	JFrame MainWindow = new JFrame("example");
	JButton Button1 = new JButton("click me");
	Button1.setBounds(10, 10, 85, 20);
    //Событие на кнопку -->>
	
	//<<----
	
	JOptionPane.showMessageDialog(null, "Message Box");
	
	System.out.println("Test");
	
	MainWindow.add(Button1);
	MainWindow.setSize(300, 300);
	MainWindow.setLayout(null);
	MainWindow.setVisible(true);
	MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  
  

}
