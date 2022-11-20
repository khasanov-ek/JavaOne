import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaExample {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("Java Example");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JTextField jTextField = new JTextField();
		jTextField.setBounds(50, 50, 150, 20);
		
		JButton jButton = new JButton("Submit");
		jButton.setBounds(50, 100, 100, 20);
		
		JButton Button2 = new JButton("Button2");
		Button2.setBounds(50, 120, 100, 20);
		
		JLabel jLabel = new JLabel();
		jLabel.setBounds(50, 150, 350, 40);
		
		
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			   System.out.println("Click Button");
			   if (!jTextField.getText().equals("")) 
				   jLabel.setText(jTextField.getText());
			   else
				   jLabel.setText("Please write something in the edit box!");
			}
		});
		
		Button2.addActionListener(e -> button2Pressed());		
		
		jFrame.add(jLabel);
		jFrame.add(jTextField);
		jFrame.add(jButton);
		jFrame.add(Button2);
		jFrame.setSize(400, 400);
		jFrame.setLayout(null);
		jFrame.setVisible(true);
		
	}
	
	static void button2Pressed() {
		System.out.println("Button1 Pressed!!!");
		/* 
		if (!jTextField.getText().equals("")) 
			jLabel.setText(jTextField.getText());
	    else
			jLabel.setText("Please write something in the edit box!");
	    */
	}
}
