public class f015_Return {
	
	public static void main(String[] args) {
		System.out.println("Оператор return. Результаты метода");
		
		int x = sum(1, 2, 3);
		int y = sum(1, 4, 9);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println(daytime(7));
		System.out.println(daytime(13));
		System.out.println(daytime(18));
		System.out.println(daytime(2));
		daytime2(7);
		daytime2(13);
		daytime2(18);
		daytime2(2);
		
		
		
	}
	
	static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	
	static String daytime(int hour) {
		if (hour > 24 || hour < 0)
			return "Invalid data";
		else if (hour > 21 || hour < 6)
			return "Good Night";
		else if (hour >= 15)
			return "Good Evening";
		else if (hour >= 11)
			return "Good After Noon";
		else
			return "Good morning";
	}
	
	static void daytime2(int hour) {
		if (hour > 24 || hour < 0)
			return;
		else if (hour > 21 || hour < 6)
			//return "Good Night";
			System.out.println("Good Night");
		else if (hour >= 15)
			//return "Good Evening";
			System.out.println("Good Evening");
		else if (hour >= 11)
			//return "Good After Noon";
		    System.out.println("Good After Noon");
		else
			//return "Good morning";
			System.out.println("Good morning");
	}
	
	
	
	
	
}