public class f025_AbstaractClasses {
	
	static final String cMethod = "Абстрактные классы";
	
	public static void main(String[] args) {
		System.out.printf("%s \n", cMethod);
		final String cMethod2 = "*******************";
		System.out.println(cMethod2);
		
		Employee sam = new Employee("Sam", "Leman Brothers");
		sam.display();
		
		Client bob = new Client("Bob", "Leman Brothers");
		bob.display();
		
		System.out.println(cMethod2);
		Rectangle rec1 = new Rectangle(1, 1, 2, 2);
		System.out.printf("Perimeter = %f\n", rec1.getPerimeter());
		System.out.printf("Area = %f\n", rec1.getArea());
		
		
	}
}

//Абстрактные классы призваны предоставлять базовый функционал для классов-наследников.
abstract class Person {
	private String name;
	
	public String getName() { return name; }
	
	public Person(String name) {
		this.name = name;
	}
	
	public abstract void display();
}

class Employee extends Person {
	
	private String bank;
	
	public Employee(String name, String company) {
		super(name);
		this.bank = company;
	}
	
	public void display() {
		System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
	}
}

class Client extends Person {
	
	private String bank;
	
	public Client(String name, String company) {
		super(name);
		this.bank = company;
	}
	
	public void display() {
		System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
	}	
}

// Другой пример "Система геометрических фигур"
abstract class Figure {
	float x;  	// x - координата точки
	float y;	// y - координата точки
	
	Figure(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	// абсрактный метод получения перитметра 
	public abstract float getPerimeter();
	// абстрактный класс получения площади
	public abstract float getArea();
}

class Rectangle extends Figure {
	
	private float width;
	private float height;
	
	// Конструктор с обращением к конструктору класса Figure
	Rectangle(float x, float y, float width, float height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public float getPerimeter() {
		return width * 2 + height * 2;
	}
	
	public float getArea() {
		return width * height;
	}
	
}
