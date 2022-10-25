//javac Switch.java & java Switch
//Многовариантное ветвление 
import javax.swing.*;

public class Switch {
	public static void main(String[] args) {
		System.out.println("Operator Switch");
		String input = JOptionPane.showInputDialog("Choose an option(1, 2, 3, 4)");
		int choice = Integer.parseInt(input);
		
		switch(choice)
		{
			case 1:
			   System.out.println("Option One");
			   break;
			case 2:
			   System.out.println("Option Two");
			   break;
			case 3:
				System.out.println("Option Three");
				break;
			default :
				System.out.println("Wrong choice");
				break;
		}	
		
		System.out.println("Operator break");
		System.out.println("---------------------------");
		
		int years = 0;
		int balance = 10;
		int payment = 5;
		int interestRate = 10;
		int goal = 100;
		balance += payment;  //=>>  balance = balance + payment
		
		System.out.println("balance += payment => balance = balance + payment" );
		System.out.println("balance = " + balance);
		System.out.println("payment = " + payment);

		while (years <= 100 && balance < goal) {
			balance += payment;
			double interest = balance * interestRate / 100;
			System.out.println("years = " + years);
			//if (balance >= goal) break;
			years++;
		}
		
		
		System.exit(0);
		System.out.println("Programm is completed!!!");  //не вызовется !!!! 
		//Вызов метода System.exit завершает работу текущей JVM и завершает работу программы. 
		//Этот метод не возвращается нормально. Это означает, что последующий код после System.exit фактически недоступен
	}
}