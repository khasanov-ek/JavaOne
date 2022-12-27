public class Cat {
  private String name;
  
  public Cat(String name) {
	this.name = name;
  }
  
  public static void main(String[] args) {
	  Cat[] cats = new Cat[3];
	  cats[0] = new Cat("Томас");
	  cats[1] = new Cat("Бегемот");
	  cats[2] = new Cat("Филипп Маркович");
	  
	  Cat[][] cats2 = new Cat[3][5];
	  cats2[1][2] = new Cat("Пушок");
	  for (int i = 0; i < cats2.length; i++) {
		  for (int j = 0; j < cats2[i].length; j++) {
			  System.out.println(cats2[i][j]);
		  }
	  }
	  
	  //Инициализация двумерного массива
	  int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	  for (int i = 0; i < numbers.length; i++) {
		  for (int j = 0 ; j < numbers[i].length; j++) {
			  System.out.print(numbers[i][j]);
		  }
		  System.out.println("");
	  }
	  
	  
  }
}