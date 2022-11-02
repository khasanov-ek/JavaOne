import javax.swing.*;

public class JavaSwing {
	
	public static void main(String[] args) {
	    //System.out.println("JButton Class");
		JFrame a = new  JFrame("Example");
		
		//Кнопка  
		JButton b = new JButton("click me");
		b.setBounds(10, 10, 85, 20);
		a.add(b);
		
		//Текстовове поле
		JTextField c = new JTextField("eduareka");
		c.setBounds(10, 30, 200, 20);
		a.add(c);
		
		
		a.setSize(300, 300);
		a.setLayout(null);
		a.setVisible(true);
		
		
	}
}
