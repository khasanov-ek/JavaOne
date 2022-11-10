import java.text.*;
import javax.swing.*;

public class CompoundInterest {
	public static void main(String[] args){
		final int STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		
		//Установить процентные ставки от 10 до 15?
		double[] interestRate = new double[NRATES]; 
		for (int j = 0; j < interestRate.length; j++)
			interestRate[j] = (STARTRATE + j) / 100.0;
		
		double[][] balance = new double[NYEARS][NRATES];
		
		//Установить исходный баланс равным 100000
		for (int j = 0; j < balance[0].length; j++)
			balance[0][j] = 10000;
		
		//Вычислить доход для будущих лет
		for (int i = 1; i < balance[i].length; i++) {
			for (int j = 0; j < balance[i].length; j++) {
				// Взять баланс с прошлого года из предыдущей строки
				double oldBalance = balance[i - 1][j];
				
				// Вычислить доход
				double interest = oldBalance * interestRate[j];
				
				// Вычислить баланс текущего года
				balance[i][j] = oldBalance + interest;
			}
		}
		
		// Распечатать одну строку с доходами
		NumberFormat formatter = NumberFormat.getPercentInstance();
		for (int j = 0; j < interestRate.length; j++) {
			System.out.print("      ");
			System.out.print(formatter.format(interestRate[j]));
		}
		System.out.println();
		
		// Распечатать таблицу доходов
		
		formatter = NumberFormat.getCurrencyInstance();
		for (int i = 0; i < balance.length; i++) {
			// Напечтать строку таблицы 
			for (int j = 0; j < balance[i].length; j++) {
				System.out.print("  ");
				System.out.print(formatter.format(balance[i][j]));
			}
			System.out.println();
		}
	}
}
