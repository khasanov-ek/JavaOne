
public class Return {
  
  public static void main(String[] args) {
    System.out.println(getHelloMessage());
	int vX = 10;
	int vY = 20;
	System.out.println(vX + " + " + vY + " = " + ReturnPlus(vX, vY));
	System.out.println(vX + " - " + vY + " = " + ReturnMinus(vY, vX));
	
	
  }
  
				
  
  public static String getHelloMessage() {
	 return "Hello World";
  }  
  
  public static Number ReturnPlus(int pX, int pY) {
	  return pX + pY;
  }
  
  public static Number ReturnMinus(int pX, int pY) {
	  return pY - pX;
  }
  
}