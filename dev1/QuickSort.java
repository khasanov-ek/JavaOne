import java.util.Arrays;

public class QuickSort {
	
	public static int sCounter = 1;    
	
	public static void quickSort(int[] array, int low, int high) {
		if (array.length == 0)
			return;  //Завершить выполнение , если длинна массива равна 0
	
		if (low >= high) 
			return;	 //Завершить выполнение если уже нечего делить
		
		System.out.println("sCounter = " + sCounter);
		sCounter++;
		System.out.println("low = " + low + ", high = " + high);
		System.out.println(Arrays.toString(array));
		
		//Выбрать опорный элемент 
		int middle = low + (high - low) / 2;
		System.out.println("middle = " + middle);
		int opora = array[middle];
		System.out.println("opora = " + opora);
		
		//разделить на подмассивы который больше и меньше опорного элемента
		int i = low, j = high;
		while(i <= j) {
			while(array[i] < opora) {
				i++;
			}
			while(array[j] > opora) {
				j--;
			}
			if (i <= j) {  //меняем местами
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		//Вызов рекурсии для сортировки левой и правой части 
		if (low < j) 
			quickSort(array, low, j);
		if (high > i)
			quickSort(array, i, high);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Быстрая сортировка");
		int[] x = {8, 0, 4, 7, 3, 7, 10, 12, -3};
		System.out.println("Было");
		System.out.println(Arrays.toString(x));
		System.out.println("------------------------");
		
		int low = 0;
		int high = x.length - 1;
		
		
		quickSort(x, low, high);
		
		System.out.println("------------------------");
		System.out.println("Стало");
		System.out.println(Arrays.toString(x));
	}
	
}