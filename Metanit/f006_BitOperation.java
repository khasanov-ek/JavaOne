public class f006_BitOperation {
	
	public static void main(String[] args) {
		System.out.println("Bit Operation");
		
		byte vValueB = 7;    // 0000 0111    byte -- 1 байт(8 бит) = 8 разрядов 
		short vValueS = 7;  // 0000 0000 0000 0111  short - 2 байт(16 бит) = 16 разрядов 
		
		// & (логическое умножение)
		int vValueA1 = 2; // 010
		int vValueB1 = 5; // 101
		System.out.println(vValueA1 + "&" + vValueB1 + " = " + (vValueA1 & vValueB1));  // (0*1, 1*0, 0*1) дает результат 000.
		
		int vValueA2 = 4; // 100
		int vValueB2 = 5; // 101
		System.out.println(vValueA2 + "&" + vValueB2 + " = " + (vValueA2 & vValueB2));  // (1*1, 0*0, 0 *1) = 100  равно десятичное 4 
		
		// | (логическое сложение)
		int vValueA3 = 2; // 100
		int vValueB3 = 5; // 101
		System.out.println(vValueA3 + " | " + vValueB3 + " = " + (vValueA3 | vValueB3));  // результат 7 - 111 
		
		int vValueA4 = 4; // 100
		int vValueB4 = 5; // 101
		System.out.println(vValueA4 + " | " + vValueB4 + " = " + (vValueA4 | vValueB4)); // результат 5 - 101
		
		// ^ (логическое исключающее или) XOR 
		int vNumber1 = 45;  // 1001 значение которое надо зашифровать 
		int vKey1 = 102;      // Ключ шифрования 
		int vEncrypt1 = vNumber1 ^ vKey1;
		System.out.println("Зашифрованное число = " + vEncrypt1);
		
		int vDecrypt1 = vEncrypt1 ^ vKey1;
		System.out.println("Расшифрованное число = " + vDecrypt1);
		
		// ~ (логическое отрицание)
		byte vValueA5 = 12;		// 0000 1100     
		System.out.println("~vValueA5 = " + ~vValueA5);  //  1111 0011   или -13
		
		// Операции сдвига
		/* 
		  Если исходное число, которое надо сдвинуть в ту или другую сторону, делится на два, то фактически получается умножение или деление на два. 
		*/
		System.out.println("4 << 1 = " + (4 << 1));
		System.out.println("16 >> 1 = " + (16 >> 1));
		
		
		
	}
}