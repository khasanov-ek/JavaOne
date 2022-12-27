import pkg1.*;

public class startPkg1 {
	
	//final int cPLUS =    1;
	final int cMINUS =   2;
	static final int cMULTI =   3;
	final int cDIVIDEd = 4;
	
	
	static int sArg1;
	static int sArg2;
	static Double sRet;
	
	public static void main(String[] args) {
		System.out.println("Call start Pkg1");
		
		final int cPLUS =    1;
		
		sArg1 = 9;
		sArg2 = 0;
		sRet = Test.Calculator(Double.valueOf(sArg1), Double.valueOf(sArg2), Test.cPlus);
		System.out.println("sRet = " + sRet);
		sRet = Test.Calculator(Double.valueOf(sArg1), Double.valueOf(sArg2), Test.cMinus);
		System.out.println("sRet = " + sRet);
		sRet = Test.Calculator(Double.valueOf(sArg1), Double.valueOf(sArg2), Test.cMulti);
		System.out.println("sRet = " + sRet);
		sRet = Test.Calculator(Double.valueOf(sArg1), Double.valueOf(sArg2), Test.cDivide);
		System.out.println("sRet = " + sRet);
		
	}
}