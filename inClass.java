/*
cd D:\GitHub\JavaOne & D:
javac inClass.java & java inClass
*/


public class inClass {
	
	// Статический вложенный класс
	public static class VnutriClass { 
		public static void Message() {
			System.out.println("Call Message");
		}
	}
	
	
	// Внутренний класс
	private Inner mInner;
	public inClass() {
		mInner = new Inner();
	}
	
	Inner getInner() {
		return mInner;
	}
	
	public class Inner {
		public static void Message() {
			System.out.println("Call Inner Message");
		}
	}
		
		
	//=== main =========================
	public static void main(String[] args) {
		System.out.println("******* Call inClass *******");
		
		System.out.println("Static inner class");
		VnutriClass.Message();
		System.out.println("============================");
		inClass.VnutriClass vnutriClass = new inClass.VnutriClass();
		vnutriClass.Message();
		System.out.println();
		System.out.println("============================");
		System.out.println("Inner class");
		inClass inclass = new inClass();
		//inClass.Inner inner = inclass.getInner();
		inClass.Inner inner = inclass.getInner();
		inner.Message();
		
		
		
	}
	
	
}