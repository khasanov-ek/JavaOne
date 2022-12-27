public class CompareValue {
	public static void main(String[] args) {
		System.out.println("Compare Values");
		System.out.println("********************************");
		compareDate(false);
		compareNumber(123, 456);
		compareNumber(7, 7);
		compareString("Строка1", "Строка1");
		
	}
	
	static void compareDate(boolean pParam1) {
		System.out.println("Compare Date");
		if  (pParam1) {
			System.out.println("pParam1 true");
		}
		else {
			System.out.println("pParam1 false else");
		}
		if (pParam1 == false) {
			System.out.println("pParam1 false");
		}
	}

	static void compareNumber(double pParam1, double pParam2) {
		System.out.println("compareNumber: pParam1 = " + pParam1 + ", pParam2 = " + pParam2);
		if (pParam1 == pParam2) {
			System.out.println("pParam1(" + pParam1 + ") = pParam2(" + pParam2 + ")");
		}
		else {
			System.out.println("pParam1(" + pParam1 + ") <> pParam2(" + pParam2 + ")");
		}	
	}
	
	static public void compareString(String pParam1, String pParam2) {
		System.out.println("compareString: pParam1 = " + pParam1 + ", pParam2 = " + pParam2);
		String vValue1 = "Строка1";
		String vValue2 = "Строка1";
		
		if (pParam1 == pParam2) {
			System.out.println("pParam1 == pParam2" +  "   if (Странно)");
		}
		else {
			System.out.println("else pParam1 == pParam2");
		}
		
		if (vValue1 == vValue2) {
			System.out.println("vValue1 == vValue" +  "   if");
		}
		else {
			System.out.println("else vValue1 == vValue2");
		}
		
		System.out.println(vValue1 == vValue2);
		System.out.println(pParam1 == pParam2);
		
		String s1 = "JavaRush - лучший сайт для изучения Java!";
        String s2 = new String("JavaRush - лучший сайт для изучения Java!");
		System.out.println("********");
        System.out.println("JavaRush - лучший сайт для изучения Java! " + s1 == s2);
		System.out.println("JavaRush - лучший сайт для изучения Java! " + s1.equals(s2));
		
		
	}


}

