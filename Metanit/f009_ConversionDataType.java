/* 
   https://metanit.com/java/tutorial/2.2.php
   Преобразование базовых типов даных  
*/   

public class f009_ConversionDataType {
	public static void main(String[] args) {
		System.out.println("Conversion Data Type");
		
		int a = 4;
		
		//byte b = a; // !!! Error(incompatible types: possible lossy conversion from int to byte)
		//byte 1 байт (диапозон значение -128 до 127)
		byte b = (byte)a;  
		System.out.println("byte b = " + b);
		
		double d = (double)a;
		System.out.println("double d= " + d);
		
		short vValueShort = (short)a;
		System.out.println("short vValueShort = " + vValueShort);
		
		byte vValueByte = 7;
		int vValueInt = vValueByte;
		
		/*
		Расширяющие автоматические преобразования представлены следующими цепочками:
		byte -> short -> int -> long
		int -> double
		short -> float -> double
		char -> int
		*/
		
		//Явные преобразования
		long vValueLong1 = 4;
		int  vValueInt1 = (int)vValueLong1;
		System.out.println("Explicit conversions vValueInt1 = " + vValueInt1);
		
		//Потеря данных при образовании 
		int vValueInt2 = 5;
		byte vValueByte2 = (byte)vValueInt2;
		System.out.println("vValueByte2 = " + vValueByte2);
		
		int vValueInt3 = 258;
		byte vValueByte3 = (byte)vValueInt3;
		System.out.println("vValueByte3 = " + vValueByte3);  //Вернет 2
		
		
		// Усечение рациональных чисел до целых
		double vValueDouble4 = 56.99;
		int vValueInt4 = (int)vValueDouble4;
		System.out.println("vValueInt4 = " + vValueInt4);  //вернет 56
		//Применяем округдение 
		double vValueDouble5 = 56.99;
		int vValueInt5 = (int)Math.round(vValueDouble5);
		System.out.println("vValueInt5 = " + vValueInt5);  //вернет 57
		
		
		// Преобразование при операциях
		int vValueInt6 = 3;
		double vValueDouble6 = 4.6;
		double vValueTotal6 = vValueInt6 + vValueDouble6;
		System.out.println("vValueTotal6 = " + vValueTotal6);
		
		byte vValueByte7 = 3;
		short vValueShort7 = 4;
		byte vValueTotal7 = (byte)(vValueByte7 + vValueShort7);
		System.out.println("vValueTotal7 = " + vValueTotal7);
		
		//Если в операциях участвую данные типа char,  то они преобразуются в int
		int vValueInt8 = 'b' + 5;
		System.out.println("vValueInt8 = " + vValueInt8);
		
	}
}