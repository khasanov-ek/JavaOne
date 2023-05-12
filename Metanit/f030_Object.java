public class f030_Object {
	
	static final String cMethod = "Класс Object и его методы"; 

	public static void main(String[] args) {
		final String cDelimeter = "*****************************************";
		System.out.printf("%s\n%s\n", cMethod, cDelimeter);
		
		Person tom = new Person("Tom");
		
		//toString
		System.out.println(tom.toString());
		
		//hashCode
		System.out.println(tom.hashCode());
		
		//getClass
		System.out.println(tom.getClass());
		
		//equals
		Person bob = new Person("Bob");
		System.out.println(tom.equals(bob));
		Person tom2 = new Person("Tom");
		System.out.println(tom.equals(tom2));
	}

}

class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	//Переопределили toString
	@Override
	public String toString() {
		return "Person " + name;
	}
	
	@Override
	public int hashCode() {
		return 10 * name.hashCode() + 20456;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		return this.name.equals(p.name);
	}
	
}