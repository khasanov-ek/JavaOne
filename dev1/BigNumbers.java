//Big numbers 

import java.math.*;

public class BigNumbers {
	public static void main(String[] args) {
		System.out.println("Big Numbers");
		System.out.println("-----------------------------");
		
		BigInteger a = BigInteger.valueOf(100);
		BigInteger b = BigInteger.valueOf(200);
		
		BigInteger c = a.add(b); // c = a + b
		System.out.println("c = " + c);
		
		c = c.divide(BigInteger.valueOf(100));
		System.out.println("c = " + c);
		
		BigInteger d = c.multiply(b.add(BigInteger.valueOf(3))); // d = c * (b + 3)
		System.out.println("d = " + d);
		
		
		double doubleValue = 100.7777;
		BigDecimal e = BigDecimal.valueOf(100.3333);
		System.out.println("e = " + e);
		System.out.println("doubleValue = " + doubleValue);
		
		System.out.println("e = "  + e.setScale(2, /* BigDecimal.ROUND_CEILING*/ BigDecimal.ROUND_HALFUP));
		System.out.println("e = " + e);
		
	
	}
	
}