import java.util.Scanner;

public class f004_ConsoleInput {
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.print("Hello world!\n");
		
		/* 
			Вывод на консоль
		*/
		
		int vIntValue1 = 5;
		int vIntValue2 = 7;
		System.out.println("vIntValue1 = " + vIntValue1 + ", vIntValue2 = " + vIntValue2);
		//or so
		/* 
		%d: для вывода целочисленных значений.
		%x: для вывода шестнадцатеричных чисел
		%f: для вывода чисел с плавающей точкой
		%e: для вывода чисел в экспоненциальной форме, например, 1.3e+01
		%c: для вывода одиночного символа
		%s: для вывода строковых значений
		*/
		System.out.printf("vIntValue1 = %d" + ", vIntValue2 = %d", vIntValue1, vIntValue2);
		String vName = "Tom";
		int vAge = 30;
		float vHeight = 1.7f;
		System.out.printf("Name: %s, Age %d, Height %.3f\n", vName, vAge, vHeight);
		
		
		/* 
			Ввод с консоли
		*/ 
		Scanner in = new Scanner(System.in);
		System.out.print("Input number = ");
		int num = in.nextInt();
		// or so
		System.out.printf("Your number: %d\n", num);
		
		//in.close();
		//===
		Scanner in2 = new Scanner(System.in);
		System.out.print("Input name: ");
		String vName2 = in2.nextLine();
		System.out.print("Input age: ");
		int vAge2 = in2.nextInt();
		System.out.print("Input height: ");
		float vHeight2 = in2.nextFloat();
		System.out.printf("Name: %s, Age %d, Height %.3f\n", vName2, vAge2, vHeight2);
		in2.close();
		
		
		System.out.println("\n");
		System.out.println("Bye");
	}
	
}