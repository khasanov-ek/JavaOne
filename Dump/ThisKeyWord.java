public class ThisKeyWord {
	
	public static void main(String[] args) {
		System.out.println("Клчевое слово This");
		
		Human h1 = new Human();
		h1.setName1("Строка1");
		h1.setName2("Строка2");
	}
	
}

class Human {
	
	String name = "Global" ;
	
	public void setName1(String name) {
		//name = newName;
		name = name;
		//this.name = name;
		System.out.println("name(1) = " + name);
		System.out.println("name(2) = " + this.name);
	}
	
	public void setName2(String newName) {
		name = newName;
		System.out.println("name(3) = " + name);
		System.out.println("name(4) = " + this.name);
		
	}
}


