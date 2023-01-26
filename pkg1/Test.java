package pkg1;

public class Test {
	
  static public final int cPlus = 1;	
  static public final int cMinus = 2;	
  static public final int cMulti = 3;	
  static public final int cDivide = 4;	
  
  
  public static Double Calculator(Double pArg1, Double pArg2, int pSign) {
	System.out.println("pArg1 = " + pArg1 + ", pArg2 = " + pArg2);
	//System.out.println("pSign= " + pSign);
	
	switch(pSign) {
		case cPlus:
			return pArg1 + pArg2;
		case cMinus:
			return pArg1 - pArg2;
		case cMulti:
			return pArg1 * pArg2;
		case cDivide:
			return pArg1 / pArg2;
		default :
			System.out.println("Wrong choice");
			break;
	}	
	return pArg1;
  }	  
  
  
  public static int Recursion(int pArg1, int pCounter) {
	  
	  if (pCounter > 3) {
		  System.out.println("Stop: pCounter = " + pCounter);
		  return 0;
	  }
	  else  {
		  System.out.println("Call recursion");
		  return Recursion(1, pCounter + 1);
	  }
	  
  }
  
  
}
