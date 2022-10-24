public class syntax
{
	//Константа для класса 
		final double CM_PER_INCH = 2.54;
		int sInt = 33;
		
  public static void main(String[] args)
	{
		System.out.println("We will not use 'Hello, World!'");
		//Константа 
		final double CM_PER_INCH_LOCAL = 2.54;
		//Объявление
		double salary = 1;
	    int vacationDays = 2;
		int x, y, z;  // не рекомендуется 
		long earthPopulation = 3;
		char yesChar;
		boolean done = true;	
		//Присваивание
		yesChar = 'S';
		//Операторы 
		//http://www.java-study.ru/24-operatory.html
		//Операторы отношения и логические операторы в языке Java
		//http://www.java-study.ru/25-logich.html
		
		//Математические функции и константы в языке Java
		double x2 = 4;
		double y2 = Math.sqrt(x2);
		System.out.println(y2);
		double y3 = Math.pow(x2, 2);
		System.out.println(y3);
		//Строки 
		String vStr = "Строка1";
		System.out.println(vStr);
		String vStr2 = vStr.substring(0, 3);
		System.out.println(vStr2);
		char vChar = vStr.charAt(5);
		System.out.println(vChar);
		//Проверка строк на равенство в языке Java
		
		
	}
  
}