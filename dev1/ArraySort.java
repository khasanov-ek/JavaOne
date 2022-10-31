import java.util.*;
// Сортировка Массива Sort Array

public class ArraySort {
	public static void main(String[] args) {
		System.out.println("Сортировка массива");
		
		int[] Array1 = {4, 6, 8, 2, 1, 9, 2, 4, 7};
		Arrays.sort(Array1);
		
		String vStr = "";  //Инициализация 
		for (int i = 0; i < Array1.length; i++) {
			vStr = vStr + Array1[i] + ", ";
		}
		
		System.out.println(vStr);
		System.out.println(Arrays.toString(Array1));
	}	
}