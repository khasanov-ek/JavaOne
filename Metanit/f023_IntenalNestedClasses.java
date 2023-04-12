public class f023_IntenalNestedClasses {
	
	public static void main(String[] args) {
		System.out.println("Внутренние и вложенные классы");
		
		Person tom = new Person("Tom", "qwerty");
		tom.displayPerson();
		tom.account.displayAccount();
		
		Person2 sam = new Person2("Sam");
		sam.setAccount("qwerty");
		
	}
	
}

class Person {
	private String name;
	Account account;
	
	Person(String name, String password) {
		this.name = name;
		account = new Account(password);
	}
	
	public void displayPerson() {
		System.out.printf("Person \t Name: %s \t Password: %s \n", name, account.password);
	}
	
	public class Account {
		
		private String password;
		
		Account(String pass) {
			this.password = pass;
		}
		
		void displayAccount() {
			System.out.printf("Account Login: %s \t Password: %s \n", Person.this.name, password);
		}		
	}	
}

class Person2 {
	private String name;
	
	Person2(String name) {
		this.name = name;
	}
	
	public void setAccount(String password) {
		class Account {
			void display() {
				System.out.printf("Account Login: %s \t Password: %s \n", name, password);
			}
		}
		
		Account account = new Account();
		account.display();
		
	}
	
}