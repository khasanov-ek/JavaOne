//javac cycle.java & java cycle
public class cycle 
{
	public static int sBalance = 7;    
	
	public static void main(String[] args)
	{
		int vBalance = 0;
		int vGoal 	 = 7;
		int vVar1    = 4;
		int vVar2    = 2;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		};
		
		
		System.out.println("vBalance = " + vBalance); 
		System.out.println("sBalance = " + sBalance); 
		
		while (vBalance < vGoal) {
	      vVar1 += vVar2;
		  System.out.println("vVar1 = " + vVar1 + ", vVar2 = " + vVar2); 	
		  vBalance++;	   
		}
		System.out.println("vBalance = " + vBalance);
		
		
		System.out.println("-------------------------");
		
		vBalance = 0;
		System.out.println("vBalance = " + vBalance);
		
		
		
		do  {
			System.out.println("vBalance = " + vBalance);
		    vBalance++; 
			}
		while (vBalance < 7);
		
		
	}
}