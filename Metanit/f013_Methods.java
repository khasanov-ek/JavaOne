public class f013_Methods {
	public static void main(String[] args) {
		System.out.println("Методы");
		hello();
		welcome();
	}
	
	// public static 				- модификаторы  
	// void(ничего не возвращает) 	- возвращаемое значение
	
	static void hello() {
		System.out.println("Hello");
		welcome();
	}
	
	static void welcome() {
		System.out.println("Welcome to Java 10");
	}
	
}