//javac Cycle2.java & java Cycle2

public class Cycle2 
{
	public static void main(String[] args)
	{
		System.out.println("Definite Cycle");
		System.out.println("-----------------------------------");
		
		for (int i = 1; i <= 10; i++) System.out.println("Cycle  i++ = " + i);
		
		for (int i = 10; i > 0; i--) System.out.println("Cycle  --i = " + i);
		
		int i = 0;
		while ( i < 10) {
			i++;
			System.out.println("While i = " + i);
		}
	}
}