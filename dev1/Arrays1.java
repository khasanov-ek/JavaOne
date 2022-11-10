
public class Arrays1 {
	public static void main(String[] args) {
		System.out.println("Java arrays");
		
		int[] a;  // Array declaration
		int[] b = new int[100];
		
		for(int i = 0; i < 100; i++) 
			b[i] = i;
		
		System.out.println("b[77] = " + b[77]);
		
		/*
		for (int i = 0; i < b.length; i++) 
			System.out.println(b[i]);
		*/
		
		int[] arr1;
		int arr2[];
		//Один массив можно скопировать в другой, но при этом обе переменные будут ссылаться на один и тот же массив.
		int[] smallPrimes = {2, 3, 5, 7, 11, 17};
		int[] luckyNumbers = smallPrimes;
		luckyNumbers[5] = 12;
		System.out.println(luckyNumbers[5]);
		
		//еобходимо скопировать все элементы одного массива в другой, следует использовать метод arraycopy из класса System
		//System.arraycopy(from, fromIndex, to, toIndex, count);
		
		
	}
}