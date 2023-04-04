public class f019_ClassObject {
	
	public static void main(String[] args) {
		System.out.println("Классы. Объектно-ориентированное программирование");
		
		//Person tom;		 
        Person tom = new Person(); // создание объекта  => пустой объект (new Person => конструктор)
		tom.displayInfo();
		
		tom.name = "Tom";
		tom.age = 34;
		tom.displayInfo();
		
		Person bob = new Person();
		bob.displayInfo();
		
		Person scott = new Person("Scott");
		scott.displayInfo();
		
		Person sam = new Person("Sam", 25);
		sam.displayInfo();
		
	}
	
	
	static class Person {
		String name;
		int age;
		// Три конструктора 
		// this представляет ссылку на текущий экземпляр класса
		Person() {
			/* name = "Undefined";
			age = 18;
			//or 
			*/
			this("Undefined", 18);
		}
		
		Person(String n) {
			/* 
			name = n;
			age = 18; */
			// or ==>
			this(n, 18);
		}
		
		Person(String n , int a) {
			/* 
			name = n;
			age = a ; */
			// or ==>
			this.name = n;
			this.age = a;
		}
		
		void displayInfo() {
			System.out.printf("Name: %s \tAge: %d\n", name, age);
		}
	}
	
	
	
	
}