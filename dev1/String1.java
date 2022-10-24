import javax.swing.*;


public class String1
{
  public static void main(String[] args)
	{
		char str1[] = {'a', 'b', 'c'};
		String str2 = new String(str1);
		String str3 = "asD";
		String vStr = "Строка1";
		System.out.println(vStr);
		System.out.println(str3);
		System.out.println(str2);
		
		System.out.println("We will not use 'Hello, World!'");
		
		String name1 = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Привет " + name1);
		System.exit(0);
		
	}
}