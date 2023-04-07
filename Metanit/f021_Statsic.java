public class f021_Statsic {
	
	public static void main(String[] args) {
		System.out.println("Статические члены и модификаторы static");
		
		Person tom = new Person();
		Person bob = new Person();
		
		tom.displayId(); 
		bob.displayId(); 
		// System.out.println("Person.counter = " + Person.counter);  // Person.counter => private
		
		// Person.counter = 8;  // Person.counter => private
		
		Person sam = new Person();
		sam.displayId();
		// System.out.println("Person.counter = " + Person.counter);   	// Person.counter => private
		
		Person.displayCounter();
		
		//Статические константы
		double radius = 60;
		System.out.printf("Radius: %f \n", radius);
		System.out.printf("Area: %f \n", Math.PI * radius);
		
		System.out.println(Operation.sum(45, 23));
		System.out.println(Operation.subtract(45, 23));
		System.out.println(Operation.multiply(4, 23));
		
	}
	
}

class Operation {
	
	static int sum(int x, int y) {
		return x + y;
	}
	
	static int subtract(int x, int y) {
		return x - y;
	}
	
	static int multiply(int x, int y) {
		return x * y;
	}
	
}	

class Math {
	public static final double PI = 3.14;
}


class Person {
	
	private int id;
	private static int counter = 1;
	
	//==>>
	// == Статические инициализаторы
	static {
		counter = 1;
		System.out.println("Static initializer");
	}
	//<<==
	
	Person() {
		id = counter++;
		System.out.println("Constructor");
	}
	
	//  Статический метод
	public static void displayCounter() {
		System.out.printf("Counter: %d \n", counter);
	}
	
	public void displayId() {
		System.out.printf("Id: %d \n", id);
	}
	
}