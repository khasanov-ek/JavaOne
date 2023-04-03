import java.util.Scanner;

public class f018_Exception {
	
	public static void main(String[] args) {
		System.out.println("Введение в обработку исключений");
		
		/* 
		int[] numbers = new int[3];
		numbers[4] = 45;
		System.out.println(numbers[4]);
		*/
		
		try {
			int[] numbers = new int[3];
			numbers[7] = 45;
			System.out.println(numbers[7]);
		} 
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			// !!!!   Выполняеться всегда есть исключение или нет !!!!
			System.out.println("Блок finally");
		}
		
		// ===========================================================
		// Обработка нескольких исключений ===
		//
		int[] numbers2 = new int[3];
		try {
			numbers2[5] = 45;
			numbers2[6] = Integer.parseInt("gfd");
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Выход за пределы массива");
		}
		catch (NumberFormatException ex) {
			System.out.println("Ошибка преобразования строки в число");
		}
		
		// ============================================================
		// throw
		//
		try {
			Scanner in = new Scanner(System.in);
			int x = in.nextInt();
			if (x >= 30) {
				throw new Exception("Число должно быть меньше 30");
			}
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
		System.out.println("Программа завершена");
		
		
	}
	
}