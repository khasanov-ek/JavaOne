//Сеттеры и Геттеры ????
//import java.util.*;


public class Method2 {
	
	
	//Модификаторы доступа
	public static String str1;
	private static String str2;
	protected static String str3;
	
	//int[] myArray;
	//Object[] arrayOfObjects;
	
	public static void main(String[] args) {
		System.out.println("Method2");
		str1 = RetString("Строка в метод");
		System.out.println("str1 = " + str1);
		str2 = RetString("Строка в метод");
		System.out.println("str2 = " + str2);
		str3 = RetString("Строка в метод");
		System.out.println("str3 = " + str2);
		System.out.println("--------------------------");
		TestMethod1();
		
		// ****** Массивы ***********************
		//int[] myArray;
		//myArray = new int[3];
		//or so 
		int[] myArray = new int[3];
		System.out.println("myArray.length = " + myArray.length);
		String[] seasons = new String[4];
		seasons[0] = "Winter";
		seasons[1] = "Spring";
		seasons[2] = "Summer";
		seasons[3] = "Autumn";
		
		String[] seasons2 = new String[] {"Winter", "Spring", "Summer", "Autumn"};
		for (int i = 0; i < seasons2.length; i++) {
			System.out.println(seasons2[i]);
		}
		int[][] myTwoDimArray = new int[3][3];
	}
	
	public static void TestMethod1() {
		System.out.println("Test Method 1 (void нет возвращаемого значения)");
	}
	
	public static String RetString(String str) {
		String resultStr = str;
		//resultStr = str;
		return resultStr;	
	}		
	
	public Object[] methodReturnArray() {
		Object[] array = new Object[10];
		return array;
	}
	
}