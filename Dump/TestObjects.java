
public class TestObjects {
	public static void main(String[] args) {
		System.out.println("Array of objects");
		System.out.println("****************");
		
		Object[] result = new Object[3];
		result[0] = "name";
		result[1] = 2;
		result[2] = 200;

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "     ");
		}
		
		System.out.println("\n********************");
		
		Object[][] result2 = new Object[3][3];
		result2[0][0] = "name1";
		result2[1][0] = 1;
		result2[2][0] = 100;
		result2[0][1] = "name2";
		result2[1][1] = 2;
		result2[2][1] = 200;
		result2[0][2] = "name3";
		result2[1][2] = 3;
		result2[2][2] = 300;
		
		for (int i = 0; i < result2.length; i++) {
			for (int j = 0; j < result2[i].length; j++) {
				System.out.print(result2[i][j] + "        ");
			}
			System.out.println("");
		}
		
		System.out.print("\n");
		
		Object[][] result3 = new Object[3][3];
		result3[0][0] = 1;
		result3[0][1] = "Row 1";
		result3[0][2] = 100;
		result3[1][0] = 2;
		result3[1][1] = "Row 2";
		result3[1][2] = 200;
		result3[2][0] = 3;
		result3[2][1] = "Row 3";
		result3[2][2] = 300;
		
		
		for (int i = 0; i < result3.length; i++) {
			for (int j = 0; j < result3[i].length; j++) {
				System.out.print(result3[i][j] + "       ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n*** result7 *****************");
		
		Object[][] result7 = {{1, "Row1", 100}, {2, "Row2", 200}};
		for (int i = 0; i < result7.length; i++) {
			for (int j = 0; j < result7[i].length; j++) {
				System.out.print(result7[i][j] + "       ");
			}
			System.out.print("\n");
		}
		

	}
}