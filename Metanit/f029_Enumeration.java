public class f029_Enumeration {
	
	protected  static final String cMethod = "Перечисления enum"; 
	
	public static void main(String[] args) {
		
		final String cDelimeter = "****************************";
		System.out.printf("%s\n%s\n", cMethod, cDelimeter);
		
		Day current = Day.Monday;
		System.out.println(current);
		
		System.out.println("***** Book ************************");
		Book b1 = new Book("War and Peace", "L.Tolstoy", Type.Belletre);
		System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);
		
		switch(b1.bookType) {
			case Belletre:
				System.out.println(" Belletre");
				break;
			case Science:
				System.out.println(" Science");
				break;
			case Science_Fiction:
				System.out.println(" Science_Fiction");
				break;
			case Phantasy:
				System.out.println(" Phantasy");
				break;
		}
		
		
		// Методы перечислений
		Type[] types = Type.values();
		for (Type s : types) { System.out.println(s); }
		
		//Метод ordinal() возвращает порядковый номер определенной константы (нумерация начинается с 0):
		System.out.println(Type.Belletre.ordinal());
		
		//Конструкторы, поля и методы перечисления
		System.out.println(Color.RED.getCode());
		System.out.println(Color.GREEN.getCode());
		
		//
		Operation op = Operation.SUM;
		System.out.println(op.action(10,4));
		op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));    // 24
		
		
	}
}

enum Day {
	Monday,
	Tuesday,
	Wensdey,
	Thursday,
	Friday,
	Saturday,
	Sunday
}

class Book {
	
	String name;
	Type bookType;
	String author;
	
	Book(String name, String author, Type type) {
		bookType = type;
		this.name = name;
		this.author = author;
	}
}

enum Type {
	Science,
	Belletre,
	Phantasy,
	Science_Fiction
}


//Перечисления, как и обычные классы, могут определять конструкторы, поля и методы. 
enum Color {
	RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
	
	private String code;
	Color(String code) {
		this.code = code;
	}
	
	public String getCode() { return code; }
	
}

//Также можно определять методы для отдельных констант:
enum Operation {
	SUM {
			public int action(int x, int y) { return x + y;	}
	},
	SUBTRACT {
			public int action(int x, int y){ return x - y;}
    },
    MULTIPLY{
        public int action(int x, int y){ return x * y;}
    };
	
	public abstract int action(int x, int y);
}