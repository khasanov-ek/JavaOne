
public class DistancePoint {
	
	public static void main(String[] args) {
		
		System.out.println("CalcDistance = " + CalcDistance(1.5, 5, 10.5, 7));
		System.out.println("sqrt(9) = " + Math.sqrt(9));
		System.out.println("Math.pow(3,3) = " + Math.pow(3,3));
	}
	
	
	/* 
	d = √ (х А – х В) 2 + (у А – у В) 2
	Вычисление расстояния между взятыми на плоскости двумя точками А (х А; у А) и В (х В; у В), 
	выполняется по формуле d = √ (х А – х В) 2 + (у А – у В) 2), где d – длина отрезка, который соединяет эти точки на плоскости. 
	Если один из концов отрезка совпадает с началом координат, а другой имеет координаты М (х М; у М), 
	то формула для вычисления d примет вид ОМ = √ (х М 2 + у М 2).
	*/
	
	public static Number CalcDistance(double pX1, double pY1, double pX2, double pY2) {
		
		if (pX1 == pX2) {
			System.out.println("Horizontal Line");
			return pY2 - pY1;
		} 
		else if (pY1 == pY2) {
			System.out.println("Vertical Line");
			return pX2 - pX1;
		}
		else {
			System.out.println("Calculate distance");
			return Math.sqrt( Math.pow((2 - 1), 2) + Math.pow((5 - 3), 2));
			//return 3;
		}
		
		//return 0;
		
	}
	
}