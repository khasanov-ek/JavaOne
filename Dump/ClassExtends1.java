/* 
https://metanit.com/java/tutorial/3.5.php
*/

public class ClassExtends1 {
	
	public static void main(String[] args) {
	   System.out.println("Class Extends1");
	   Person tom = new Person("Tom");
	   tom.display();
	   //---
	   Employee1 sam = new Employee1("Sam", "Microsoft");
	   sam.display();
	   sam.work();
	   //---
	   Employee2 david = new Employee2("David", "Oracle");
	   david.display();
	   
	   //Динамическая диспетчеризация методов
	   Person garry = new Employee2("Garry", "IBM");
	   garry.display();
	   
	}
}


	
class /* final (Запретить наследование) */ Person {
	String name;
	public String getName(){ 
		return name; 
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public /* final (Запретить переопределение)*/ void display() {
		System.out.println("Name: " + name);
	}
	
}

//добавляем поле Company и добавляем метод work
class Employee1 extends Person {
	String company;
	
	public Employee1(String name, String company) {
		super(name);
		this.company = company;
	}
	
	public void work() {
		System.out.printf("%s works in %s \n", getName(), company);
	}
	
}

//переопределение метода display() родительского класса
class Employee2 extends Employee1 {
	
	public Employee2(String name, String company) {
		super(name, company);
	}
	
	@Override
	public void display() {
		System.out.printf("Name: %s \n", getName());
		System.out.printf("Works in %s \n", company);
	}

}



	


