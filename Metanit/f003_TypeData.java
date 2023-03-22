public class f003_TypeData {
	
	public static void main(String[] args) {
		System.out.println("Type data");
		
		//boolean type
		boolean isActive = false;
		boolean isAlive = true;
		
		//byte: хранит целое число от -128 до 127 и занимает 1 байт
		byte vByteValue1 = 3;
		byte vByteValue2 = 8;
		
		//short: хранит целое число от -32768 до 32767 и занимает 2 байта
		short vShortValue1 = 3;
		short vShortValue2 = 8;
		
		//int: хранит целое число от -2147483648 до 2147483647  и занимает 4 байта
		int vIntValue1 = 4;
		int vIntValue2 =7;
		
		//long: хранит целое число от -9 квинтилионов до 9 квинтилионов и занимает 8 байт
		long vLongValue1 = 1000000;
		long vLongValue2 = 1000001;
		
		//float: число с плавающей точкой 4 байта
		float vFloatValue1 = 8.5F;  
		float vFloatValue2 = 2.7F;
		System.out.println("vFloatValue1 = " + vFloatValue1);
		System.out.println("vFloatValue2 = " + vFloatValue2);
		
		//double: число с плавающей точкой 8 байт
		double vDoubleValue1 = 8.5;
		double vDoubleValue2 = 2.7;
		System.out.println("vDoubleValue1 = " + vDoubleValue1);
		System.out.println("vDoubleValue2 = " + vDoubleValue2);
		
		//char: одиночный символ в кодировке UTF-16(Юникод) занимает 2байта значения от 0 до 65535
		char vCharValue1 = 's';
		System.out.println("vCharValue1 = " + vCharValue1);
		// Таблица символов Юникода https://unicode-table.com/ru/
		System.out.println("\u2764 " + " - " + "\u00A9"); //Символы в консоль не выводятся
		System.out.println("\u0068\u0065\u006c\u006c\u006f"); //hello
		
		System.out.println("==========================================");
		/*
			******* Целы числа *******
		*/
		byte 	vByteValue3 = 1;
		short 	vShortValue3 = 2;
		long  	vLongValue3 = 2121;
		
		//надо добавить к числу суффикс l или L, который указывает, 
		//что число представляет тип long:
		long vLongValue4 = 2147483649l; 
		long vLongValue5 = 2147483649L; 
		
		//другие исчисления
		int vIntValue3 = 0x6F;  // 16-теричная система, число 111
		System.out.println("vIntValue3 = " + vIntValue3); 
		int vIntValue4 = 010; // 8-ричная система, число 8
		System.out.println("vIntValue4 = " + vIntValue4); 
		int vIntValue5 = 0b1101; // 2-ичная система, число 13
		System.out.println("vIntValue5 = " + vIntValue5); 
		
		
		/*
			******* Числа с плавающей точкой *******
		*/
		float vFloatValue3 = 30.6f;
		System.out.println("vFloatValue3 = " + vFloatValue3);
		
		double vDoubleValue3 = 30.6;
		System.out.println("vDoubleValue3 = " + vDoubleValue3);
		
		
		/*
		  ******* Символы и строки *******
		*/
		
		char vCharValue2 = 'e';
		System.out.println("vCharValue2 = " + vCharValue2);
		char vCharValue3 = 102; // значение от 0 до 65535 
		System.out.println("vCharValue3 = " + vCharValue3);
		
		String hello = "Hello .....";
		System.out.println(hello);
		
		String vText1 = "Hello \nworld";
		System.out.println(vText1);
		
		String vText2 = "Строка 1, \n" +
						"Строка 2, \n" +
						"Строка 3, \n" +
						"Строка4.";
		System.out.println(vText2);	

		//=== JDK15 разрешает использовать тройные кавычки ===/
		System.out.println("=== JDK15 ===");
		String vText3 = """
						Строка1,
						Строка2,
						Строка3,
						Строка4.
						""";
		System.out.println(vText3);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}