
public class Arguments {
   
   public static void main(String[] args) {
	   System.out.println("Командная строк аргументы запуска");
	   System.out.println("---------------------------------");
	   
	   //System.out.println(args.length);
		
		if (args.length > 0) {     //Проверка на наличие параметров
			if (args[0].equals("-h")) 
				System.out.println("Здравствуй, ");
			else if (args[0].equals("-g"))
				System.out.println("Прощай, ");
			//Печатает другие аргументы командной строки
			for (int i = 1; i < args.length; i++) {
				System.out.println(" " + args[i]);
				System.out.println("!");
			}
		}
	   
   }

}

