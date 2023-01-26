package pkg1;

/*
cd d:\Github\JavaOne
cls & javac pkg1/Crm1.java & java startCrm1
*/

public class Crm1 {
	
	static public double sRemain = 0;
	//Minimum paymeny %
	static public int sPrcMp = 10;
	//Commision for service
	static public int sCommissionService = 70;
	
	
	
	public static void StartCrm1() {
		Purchase(1000.00);
		Purchase(2000.00);
		Purchase(3000.00);
		System.out.println("=== ExecAdjusting start ===");
		//Ajusting
		if (ExecAdjusting() == 0) {
			System.out.println("Contract Ajusting success");
		}
		else {
			System.out.println("Contract Ajusting not success");
		}
		System.out.println("=== ExecAdjusting end ===");
		
		
	}
	
	public static void Purchase(Double pAmount) {
		System.out.println("Amount purchase = " + pAmount);
		sRemain = sRemain - pAmount;
		System.out.println("Current remain = " + Remain());
	}
	
	public static double Remain() {
		return sRemain;
	}
	
	public static double CommissService() {
		return sCommissionService;
	}
	
	public static double CalcMP() {
		return Math.abs(sRemain) / 100 * sPrcMp + CommissService(); 
	}
	
	public static int ExecAdjusting() {
		System.out.println("Calculate Minimum Payment = " + CalcMP());
		return 0;
	}
	
}