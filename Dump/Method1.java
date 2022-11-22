import java.util.*;
import javax.swing.*;

public class Method1 {

	/* 
	private Object[] columnsHeader = new String[] {"id", "Str", "num"};
	private Object[][] array = new String[][] {
			{"1", "Строка1", "100"},
			{"2", "Строка2", "200"},
			{"3", "Строка3", "300"}
		};
    */
	public static void main(String[] args) {
		System.out.println("Method1");
		
		 
		Object[] columnsHeader = new String[] {"id", "Str", "num"};
		Object[][] array = new String[][] {
			{"1", "Строка1", "100"},
			{"2", "Строка2", "200"},
			{"3", "Строка3", "300"}
		};
		
		for (int i = 0; i < array.length; i++) {
		    System.out.println(array[i][1]);
		}
		
	}

}