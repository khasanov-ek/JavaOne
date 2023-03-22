public class f005_ArithmeticOper {
	
	public static void main(String[] args) {
		System.out.println("f005_ArithmeticOper");
		System.out.println("===================");
		
		System.out.println("Addition Operation ");
		int vAddA = 10;
		int vAddB = 7;
		int vAddC = vAddA + vAddB;
		int vAddD = 4 + vAddB;
		System.out.println("vAddC = " + vAddC);
		System.out.println("vAddD = " + vAddD);
		
		System.out.println("\nSubtraction Operation");
		int vSubA = 10;
		int vSubB = 7;
		int vSubC = vSubA - vSubB;
		int vSubD = 4 - vSubA;
		System.out.println("vSubC = " + vSubC);
		System.out.println("vSubD = " + vSubD);
		
		System.out.println("\nOperation multiplication");
		int vMultiA = 10;
		int vMultiB = 7;
		int vMultiC = vMultiA * vMultiB;
		int vMultiD = vMultiB * 5;
		System.out.println("vMultiC = " + vMultiC);
		System.out.println("vMultiD = " + vMultiD);
		
		System.out.println("\nOperatiion divided");
		int vDivideA = 20;
		int vDivideB = 5;
		int vDivideC = vDivideA / vDivideB;
		double vDivideD = 22.5 / 4.5;
		System.out.println("vDivideC = " + vDivideC);
		System.out.println("vDivideD = " + vDivideD);
		// *** !!!! ***
		//Следует учитывать два целых числа округляются до целого
		double vDivideK1 = 10 / 4;   // = 2
		System.out.println("vDivideK1 = (10 / 4) = " + vDivideK1);
		double vDivideK2 = 10.0 / 4;
		System.out.println("vDivideK2 = (10.0 / 4) = " + vDivideK2);
		
		System.out.println("\nReceipt of the balance (%)");
		int vBalanceA = 33;
		int vBalanceB = 5;
		int vBalanceC = vBalanceA % vBalanceB;  // = 3 
		int vBalanceD = 22 % 4; 				// = 2  (22 - 4 * 5) = 2
		System.out.println("vBalanceC = (" + vBalanceA + " % " + vBalanceB + ") = " + vBalanceC);
		System.out.println("vBalanceD = (22 % 4) = " + vBalanceD);
		
		System.out.println("\nOperation increment");
		int vIncrementA1 = 8;
		int vIncrementB1 = ++vIncrementA1;
		System.out.println("Prefix vIncrementA1 = " + vIncrementA1 + ", vIncrementB1 = " + vIncrementB1);
		int vIncrementA2 = 8;
		int vIncrementB2 = vIncrementA2++;
		System.out.println("Postfix vIncrementA2 = " + vIncrementA2 + ", vIncrementB2 = " + vIncrementB2);
		int vDecrementA1 = 8;
		int vDecrementB1 = --vDecrementA1;
		System.out.println("Prefix vDecrementA1 = " + vDecrementA1 + ", vDecrementB1 = " + vDecrementB1);
		int vDecrementA2 = 8;
		int vDecrementB2 = vDecrementA2--;
		System.out.println("Postfix vDecrementA2 = " + vDecrementA2 + ", vDecrementB2 = " + vDecrementB2);
		
		System.out.println("\nPriority operation");
		/* 1. ++ -- Postfix
		   2. ++ -- Prefix
		   3. Miltiplaction -> divided -> balances
		   4. Addition -> Substraction
		 */
		 
		 int vPriorityA = 8;
		 int vPriorityB = 7;
		 int vPriorityC = vPriorityA + 5 * ++vPriorityB;
		 System.out.println("vPriorityC = (a + 5 * ++b ) = " + vPriorityC);
		 
		 // !!! Следует отметить, что числа с плавающей точкой не подходят для финансовых и других вычислений,
		 // Поэтому в таких случаях обычно применяется класс BigDecimal
		 
		 
		 
		   
		
		
		
		
		
		
		
	}
	
}