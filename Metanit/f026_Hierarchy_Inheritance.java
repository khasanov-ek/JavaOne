public class f026_Hierarchy_Inheritance {
	
	static final String cMethod = "Иерархия наследования";
	
	public static void main(String[] args) {
		final String cDelimiter = "*********************";
		System.out.printf("%s\n", cMethod);
		System.out.printf("%s\n", cDelimiter);
		
		Person tom = new Person("Tom");
		tom.display();
		
		Person sam = new Employee("Sam", "Oracle");
		sam.display();
		
		Person bob = new Client("Bob", "DeutscheBank", 3000);
		bob.display();
		
		Object kate = new Client("Kate", "DeutscheBank", 2000);
		((Person)kate).display();
		
		//Оператор instanceof
		Object larry = new Client("Larry", "DeutscheBank", 5000);
		if (larry instanceof Employee) {
			Employee employeeLarry = (Employee) larry;
			employeeLarry.display();
		} else {
			System.out.println("Conversion is invalid");
		}
		
		
	}
}


class Person {
	
	private String name;
	
	public String getName() { return name; }
	
	public Person (String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.printf("Person %s \n", name);
	}
}


class Employee extends Person {
	
	private String company;
	
	public Employee(String name, String company) {
		super(name);
		this.company = company;
	}
	
	public String getCompany() { return company; }
	
	public void display() {
		System.out.printf("Employee %s works in %s \n", super.getName(), company);
	}	
}

class Client extends Person {
	
	private int sum;
	private String bank;
	
	public Client(String name, String bank, int sum) {
		super(name);
		this.bank = bank;
		this.sum = sum;
	}
	
	public void display() {
		System.out.printf("Client %s has account in %s \n", super.getName(), bank);
		System.out.printf("%s has sum = %d\n", super.getName(), getSum());
	}
	
	public String getBank() { return bank; }
	public int getSum() { return sum; }
	
}