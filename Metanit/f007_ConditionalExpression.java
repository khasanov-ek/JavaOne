public class f007_ConditionalExpression {
	
	public static void main(String[] args) {
		System.out.println("Conditional Expression");
		
		// Compare Operation
		// == 
		int a1 = 10;
		int b1 = 4;
		boolean c1 = a1 == b1;  // false
		boolean d1 = a1 == 10;  // true
		
		// != 
		int a2 = 10;
		int b2 = 4;
		boolean c2 = a2 != b2; // true
		boolean d2 = a2 != 10; // false
		
		// < (less than)
		int a3 = 10;
		int b3 = 4;
		boolean c3 = a3 < b3; // false
		
		// > (more than)
		int a4 = 10;
		int b4 = 4;
		boolean c4 = a4 > b4; // true
		
		// >= ( more or equal)
		boolean c5 = 10 >= 10; // true
		boolean d5 = 10 >= 4;  // true
		boolean e5 = 10 >= 20; // false
		
		// <= (less or equal)
		boolean c6 = 10 <= 10; //true
		boolean d6 = 10 <= 4;  // false
		boolean e6 = 10 <= 20; // true
		
		// | - or, & - and , ! - not, ^ - , || - , && -
		boolean x1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true => true
		boolean x2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false => false
		boolean x3 = (5 > 6) && (4 < 6); // 5 > 6 - false => false(второе выражение не вычисляется)
		boolean x4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
		boolean x5 = (5 < 6) ^ (4 > 6); // 5 < 6 - true, поэтому возвращается true (4 > 6 - false)
		boolean x6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false
		
		
		
		
	}
	
}