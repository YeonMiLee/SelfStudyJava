package sec04.exam;

public class CalculatorEx_2 {

	public static void main(String[] args) {
		Calculator_2 myCalc = new Calculator_2();
		
		double result1 = myCalc.areaRectangle(10);
		
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이= " + result1);
		System.out.println("직사각형 넓이= " + result2);
	}

}
