import java.util.Arrays;

public class MultiArray {
	
	final static int NYEARS = 4;
	final static int NRATES = 4;
	
	
	public static void main(String[] args) {
	   String vStr = "";
	   
	   int[] Test = {3, 7, 5};
	   
	   int[][] magicSquare = {
		   {16,  3,  2, 13},
		   { 5, 10, 11,  8},
		   { 9,  6,  7, 12},
		   { 4, 15, 14,  1}
	   };
	   
	   /* System.out.println(magicSquare[0][0]);
	   System.out.println(magicSquare[1][1]);
	   System.out.println(magicSquare[2][2]);
	   System.out.println(magicSquare[3][3]); */
	   
	   for (int i = 0; i < magicSquare.length; i++) {
		   
		   /* for (int j = 0; j < magicSquare[i - 1][j]; j++) {
				System.out.println(magicSquare[i][j]);
		   }
		   */
		   vStr = vStr + magicSquare[0][i] + ", ";
	   }
	   System.out.println(vStr /* magicSquare[0][i] */);
	   System.out.println(Arrays.toString(Test));
	}
}