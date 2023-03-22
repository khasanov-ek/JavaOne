/*
  https://metanit.com/java/tutorial/2.1.php
  Основы програмирования 
  Переменные и константы
  
  тип_данных имя_переменной;
 
*/

public class f002_ValueConst {
	
	public static void main(String[] args) {
		System.out.println("Переменные и константы");
		System.out.println("**********************");
		System.out.println("Переменные");
		
		
		int x;
		x = 10;
		System.out.println("x = " + x);
		
		int y = 11;
		System.out.println("y = " + y);
		//*****************************
		/* 
		Если не присвоить значение
		error: variable z might not have been initialized 
		*/
		int z;
		//System.out.println("z = " + z);
		
		//*****************************
		int m, n;
		m = 10;
		n = 11;
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		//*****************************
		int o = 8, p = 15;
		System.out.println("o = " + o + ", p = " + p);
		
		//*****************************
		// начиная с Java 10 добавлено ключевое слово var
		var r = 10; //тип переменной выводится из того значения, которое ей присваивается
		//var s; s = 11;       --так нельзя ( Ошибка, переменная не инициализирована)
		// var t = 15, u = 17; --так нельзя 
		
		System.out.println("r = " + r);
		
		System.out.println("**********************");
		System.out.println("Константы");
		/*
			Константа объявляется как переменная , только вначале идет ключевое слово 
			final
		*/
		
		final int LIMIT = 5;
		System.out.println("LIMIT = " + LIMIT);
		
		

	}
	
}