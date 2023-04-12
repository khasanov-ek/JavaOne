public class f024_Inheritance {
	
	public static void main(String[] args) {
		System.out.println("Наследование");
		
		Person tom = new Person("Tom");
		tom.display();
		
		Employee sam = new Employee("Sam", "Microsoft");
		sam.display();
		//sam.work();
		
		//Динамическая диспетчеризация методов
		Person Larry = new Employee("Larry", "Oracle");
		Larry.display();
		
		
	}
		
}

//Запрет наследование 
//public final class Person {
//
class Person {
	String name;
	public String getName() { return name; }
	
	public Person (String name) {
		this.name = name;
	}
	
	//Запрет переопределения методов
	//public final void display()
	//
	public void display() {
		System.out.println("Name: " + name);
	}
}

class Employee extends Person {
	
	String company;
	
	public Employee(String name, String company) {
		super(name);
		this.company = company;
	}
	public void work() {
		System.out.printf("%s works in %s \n", getName(), company);
	}
	
	//Переопределение методов(Переопределим метод display)
	@Override
	public void display() {
		//System.out.printf("Name: %s \n", getName());
		//System.out.printf("Works: %s \n", company);
		// or
		super.display();
		System.out.printf("Works: %s \n", company);
		
	}
	
	
	
}