package quiz_Calculator;

public class CalculatorEx {
	//결과출력 예시) add:5, subtract:-1, average:3.0
	
	public static void main(String[] args) {
		
		CalcMethod calc = new CalcMethod();
		int[] array = {1, 2, 3, 4, 5};
		
		System.out.println("add: " + calc.add(2, 3));
		System.out.println("subtract: " + calc.subtract(2, 3));
		System.out.println("average: " + calc.average(array));		
	}	
}

