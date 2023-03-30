public class f016_ReloadMethod {
	
	public static void main(String[] args) {
		System.out.println("Перегрузка методов");
		/*
		 В программе мы можем использовать методы с одним и тем же именем, но с разными типами и/или количеством параметров. 
		 Такой механизм называется перегрузкой методов (method overloading).
		*/
		
		System.out.println("sum(1) = " + sum(2, 3));
		System.out.println("sum(2) = " + sum(4.5, 3.2));
		System.out.println("sum(3) = " + sum(4, 3, 7));
		
	}
	
	
	static int sum(int x, int y) {
		return x + y;
	}
	
	static double sum(double x, double y) {
		return x + y;
	}

	static int sum(int x, int y, int z) {
		return x + y + z;
	}
	
	
}