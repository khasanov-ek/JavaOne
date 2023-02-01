import java.util.Scanner;

public class ClassException1 {
	public static void main(String[] args) {
		System.out.println("Class Exception");
		System.out.println("***************");
		
		try  {
			int [] Numbers = new int[3];
			//Numbers[4] = 45;
			Numbers[7] = Integer.parseInt("asd");
			System.out.println("Numbers[4] = " + Numbers[4]);
		}
		/* 
		catch(Exception ex) {
			ex.printStackTrace();
		}
		*/
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Выход за пределы массива");
		}
		catch(NumberFormatException ex) {
			System.out.println("Ошибка преобразования из строки в число");
		}
		/* 
		finally {
			System.out.println("Блок finally");
		}
		*/
		
		try {
			Scanner in = new Scanner(System.in);
			int x = in.nextInt();
			if (x >= 30) {
				throw new Exception("Число X должно быть меньше 30");
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("exit = 1");
	}
} 

