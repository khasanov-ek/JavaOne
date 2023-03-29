public class f014_Params {
	public static void main(String[] args) {
		System.out.println("Параметры методов");
		sum(3, 4);
		display("Tom", 34);
		display("Bob", 28);
		display("Sam", 12);
		sum2(1, 2, 3);
		sum2(1, 2, 3, 4, 5);
		sum2();
		sum3("Welcome", 10, 20);
		
		
	}
	
	static void sum(int x, int y) {
		int z = x + y;
		System.out.println("z = " + z);
	}
	
	static void display(String name, int age) {
		System.out.println(name + ": " + age);
	}
	
	
	//Параметры переменной длины
	public static void sum2(int ... nums) {
		int result = 0;
		for (int n: nums) 
			result += n;	
		
		System.out.println("result = " + result);
	}
	
	static void sum3(String message, int ... nums) {
		System.out.println(message);
		int result = 0;
		for (int x : nums)
				result += x;
		System.out.println("result = " + result);
		
	}
	
}