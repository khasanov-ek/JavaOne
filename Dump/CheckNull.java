//Работа с NULL.
/* 
https://javarush.com/groups/posts/1080-9-vejshey-o-null-v-java
*/

public class CheckNull {
	public static void main(String[] args) {
		System.out.println("Null in Java");
		
		String str1 = null;
		if (str1 == null) {
			System.out.println("(str1 == null)");
		}
		
		if (str1.equals(null)) {
			System.out.println("str1.equals(null)");
		}
		
	}
}