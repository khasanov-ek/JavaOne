import javax.swing.*;

public class condition
{
  public static void main(String[] args)
	{
		System.out.println("We will not use 'Hello, World!'");
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Привет " + name);
		
		String money = JOptionPane.showInputDialog("How mach money do you have?");
		
	System.out.println("Money = " + money);
		
		if (money == "100") {
		//if (money.equals("100") && "1" == "1") {  // and
		//if (money.equals("100") || "1" == "1") { 	// or
		  System.out.println("Equl");
		}
		else {
		  System.out.println("Not Equl");	
		}
		
		
		System.exit(0);
	}
}