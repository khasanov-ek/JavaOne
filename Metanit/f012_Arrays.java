public class f012_Arrays {
	public static void main(String[] args){
		System.out.println("Arrays");
		
		//Одномерные массивы
		// ======================
		//Объявление
		int nums1[];
		//Инициализация
		nums1 = new int[4];
		// значение по умолчанию - число 0.
		System.out.println("nums1[1] = " + nums1[1]);
		
		// Объявление + инициализация
		int nums3[] = new int[4];
		int[] nums4 = new int[5];
		
		int[] nums5 = new int[] {1, 2, 3, 4, 5};
		int[] nums6 = {1, 2, 3, 4, 5};
		
		int[] nums7 = new int[4];
		nums7[0] = 1;
		nums7[1] = 2;
		nums7[2] = 3;
		nums7[3] = 4;
		System.out.println(nums7[2]);
		
		//длина массива
		int[] nums8 = {1, 2, 3, 4, 5};
		int length = nums8.length;
		
		// Многомерные массивы
		// ====================
		int[][] nums9 = {{0, 1, 2}, {3, 4, 5}};
		//or
		int[][] nums10 = new int[2][3];
		
		nums9[1][0] = 44;
		System.out.println("nums9[1][0] = " + nums9[1][0]);
		
		//Зубчатый массив
		int[][] nums11 = new  int[3][];
		nums11[0] = new int[2];
		nums11[1] = new int[3];
		nums11[2] = new int[5];
		
		
		// foreach 
		int[] array1 = new int[] {1, 2, 3, 4, 5};
		for (int i : array1) {
			System.out.print("i = " + i + ", ");
		}
		// or 
		System.out.println("");
		for (int i = 0; i < array1.length; i++) {
			System.out.print("array1(" + i + ") = " + array1[i] + ", ");
		}
		
		System.out.println("");
		int[][] nums2 = new int[][]
		{
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums2[i].length; j++) {
				System.out.printf("%d ", nums2[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}
}