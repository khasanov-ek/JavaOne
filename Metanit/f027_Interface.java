public class f027_Interface {
	
	private static final String cMethod = "Интерфесы";
	
	public static void main(String[] args) {
		
		final String cDelimiter = "*******************************";
		System.out.printf("%s\n%s\n", cMethod, cDelimiter);
		
		
		Book b1 = new Book("Java. Complete Reference", "H.Shildt");
		b1.print();
		/*
		Класс Book и класс Journal связаны тем, что они реализуют интерфейс Printable. Поэтому мы динамически в программе можем создавать объекты Printable как экземпляры обоих классов:
		*/
		Printable printable = new Book("Oracle", "Tom Kyte");
		printable.print();
		printable = new Journal("Foreign Policy");
		printable.print();
		
		printable = new Journal("Magazine");
		printable.print2();
		
		
		Printable p = new Journal("Foreign Affars");
		p.print();
		//Интерфейс не имеет метода getName, необходимо явное приведение
		String name = ((Journal)p).getName();
		System.out.println(name);
		
		//*****************
		//Сатический метод
		Printable.read();
		
	}
	
}


interface Printable{
	//Статические методы
	static void read() {
		System.out.println("Read printable");
	}
	
	//Методы по умолчанию -->>
	default void print2() {
		System.out.println("Undefinded printable");
	}
	// << ----
	
	
	void print();
}

class Book implements Printable {
	
	String name;
	String author;
	
	Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public void print() {
		System.out.printf("%s (%s) \n", name, author);
	}
	
}

class Journal implements Printable {
	
	private String name;
	
	String getName() {
		return name;
	}
	
	Journal(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(name);
	}
}