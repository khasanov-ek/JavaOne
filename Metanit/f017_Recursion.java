public class f017_Recursion {
	
	public static void main(String[] args) {
		System.out.println("Рекурсивные функции");
		System.out.println("Factorial recurcion = " + factorial(3));
		System.out.println("Factorial cycle = " + factorial2(3));
		System.out.println("Fibonachi(3) = " + fibonachi(3));
	}
	
	static int factorial(int x) {
		if (x == 1) {
			return 1;
		}
		return x * factorial(x - 1);
	}
	
	static int factorial2(int x) {
		int result = 1;
		for (int i = 1; i <= x; i++) {
			result *= i;
		}
		return result;
	}
	
	static int fibonachi(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		else {
			return fibonachi(n - 1) + fibonachi(n - 2);
		}
			
			
	}
	
	
}