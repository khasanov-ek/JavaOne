/* 
Компиляция	: javac study/Program.java
Запуск 	 	: java study.Program

*/

package study;

//import java.util.Scanner;
import java.util.*; // импорт всех классов из пакета java.util
// Статический импорт
import java.lang.System.*;
import java.lang.Math.*;

public class Program {
	public static void main(String[] args) {
		Person kate = new Person("Kate", 32);
		kate.displayInfo();
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		int x = in.nextInt();
		// or 
		// import java.util.Scanner
		Scanner in2 = new Scanner(System.in);
		int y = in2.nextInt();
		
		System.out.println("x = " + x + ", y = " + y);
		
		//класс Date имеется и в пакете java.util, и в пакете java.sql. И если нам надо одновременно использовать два этих класса, то //необходимо указывать полный путь к этим классам в пакете
		//java.util.Date utilDate = new java.util.Date();
		//java.sql.Date sqlDate = new java.sql.Date();
		
		double result1 = Math.sqrt(9);
		System.out.println("result1 = " + result1);
		
		
	}
}

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void displayInfo() {
		System.out.printf("Name: %s\t Age: %d\n", name, age);
	}
}