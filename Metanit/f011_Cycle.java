public class f011_Cycle {
	public static void main(String[] args) {
		System.out.println("f011_Cycle");
		
		// for while do..while
		
		//for
		System.out.println("Cycle for");
		for (int i = 1; i < 9; i++) {
			System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
			System.out.println("i = " + i);
		}
		
		/* Бесконечный цикл
		int vInt1 = 1;
		for (; ;) {
			System.out.printf("Квадрат числа %d равен %d \n", vInt1, vInt1 * vInt1);
		}
		*/
		/* не работает
		n = 10;
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			System.out.println("i = " + i + ", j = " + j + ", i * j = ");
		}
		*/
		
		// do
		System.out.println("Cycle do");
		int vInt2 = 7;
		do {
			System.out.println(vInt2);
			vInt2--;
		}
		while (vInt2 > 0);
		
		int vInt3 = -1;
		do {
			System.out.println(vInt3);
			vInt3--;
		}
		while(vInt3 > 0);
		
		// while
		System.out.println("Cycle while");
		int vInt4 = 6;
		while (vInt4 > 0) {
			System.out.println("vInt4 = " + vInt4);
			vInt4--;
		}
		
		// continue break
		System.out.println("continue and break");
		for (int i = 0; i < 10; i++){
			// заканчиваем на 5
			if (i == 5)
				break;
			System.out.println("i = " + i);
		}
		
		for (int i = 0; i < 10; i++) {
			//пропускаеи 5
			if (i == 5)
				continue;
			System.out.println("i = " + i);
		}
		
		
		
	}

}