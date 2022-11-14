import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		
		System.out.println("Calculator");
		System.out.println("---------------------------------");

		int vFirstVar = 10;
		int vSecondVar = 20;
		int vResult = vFirstVar + vSecondVar;
		
		System.out.println(vFirstVar + " + " + vSecondVar + " = " + vResult);
		System.out.print("Введите строку: ");
		Scanner sc1 = new Scanner(System.in);
		//int vNum1 = sc1.nextInt();
		//System.out.println("vNum1 = " + vNum1);
		String vStr1 = sc1.next();
		System.out.println("vStr1 = " + vStr1);
		
		System.out.print("Введите число: ");
		Scanner cs2 = new Scanner(System.in);
		if (cs2.hasNextDouble()) {
			double vDouble2 = cs2.nextDouble();
			System.out.println("vDouble2 = " + vDouble2);
		}
		else {
			System.out.println("Это не число!!!");
		}
		
		cs2.close();
	}
	
}