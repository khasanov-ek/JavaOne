public class f010_Condition {
	
	public static void main(String[] args) {
		System.out.println("Condition constructs");
		
		int vNum1 = 4;
		int vNum2 = 4;
		
		if (vNum1 > vNum2) {
			System.out.println("The first digit is greater than the second");
		}
		else if (vNum1 < vNum2){
			System.out.println("The first digit is less than the second");
		}
		else {
			System.out.println("Both number are equal");
		}
		
		int vNum3 = 8;
		int vNum4 = 6;
		
		if (vNum3 > vNum4 && vNum3 > 7) {
			System.out.println("The first digit is greater than the second and greater then seven");
		}
		
		
		int vNum5 = 7;
		switch(vNum5) {
			case 1: 
				System.out.println("The number is equal 1");
				break;
			case 7:
				System.out.println("The number is equal 7");
				vNum5++;
				break;
			case 8:
				System.out.println("The number is equal 8");
				break;
			default:
				System.out.println("The number is not equal 1, 7, 8");
			
		}
		
		int vNum6 = 3;
		int vOutput1 = 0;
		switch(vNum6) {
			case 1:
				vOutput1 = 3;
				break;
			case 2:
			case 3:
			case 4:
				vOutput1 = 6;
				break;
			case 5:
				vOutput1 = 12;
				break;
			default:
				vOutput1 = 24;
		}
		System.out.println("vOutput1 = " + vOutput1);
		
		//Тернараня операция
		int vX = 3;
		int vY = 2;
		//начала проверяется условие x<y. И если оно соблюдается, то z будет равно второму операнду - (x+y), //иначе z будет равно третьему операнду.
		int vZ = vX < vY ? (vX + vY) : (vX - vY);
		System.out.println("vZ = " + vZ);
		
		
	}
	
}