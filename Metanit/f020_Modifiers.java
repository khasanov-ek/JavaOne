public class f020_Modifiers {
	
	public static void main(String[] args) {
		System.out.println("Модификаторы доступа и инкапсуляция");
		
		Person kate = new Person("Kate", 32, "Baker Street", "+12334567");
		kate.displayName();
		kate.displayAge();
		kate.displayPhone();
		//kate.displayAddress();  // !!! Модификатор private
		
		//сокрытие данных внутри некоторой области видимости называется инкапсуляцией.
		
	}
	
}

class Person {
	
	String name;
	protected int age;
	public String address;
	private String phone;
	
	public Person(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	public void displayName() {
		System.out.printf("Name: %s \n", name);
	}
	
	void displayAge() {
		System.out.printf("Age: %s \n", age);
	}
	
	private void displayAddress() {
		System.out.printf("Address: %s \n", address);
	}
	
	protected void displayPhone() {
		System.out.printf("Phone: %s \n", phone);
	}
	
	
	
}