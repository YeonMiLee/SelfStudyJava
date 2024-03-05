package quiz_Calculator;

public class CalcMethod extends Calculator {	
	//메소드 재정의
	
	@Override
	public int add(int a, int b) {		
		return a+b;
	}	
	@Override
	public int subtract(int a, int b) {
		return a-b;
	}	
	@Override
	public double average(int[] a) {			
		double sum = 0; 
		double average = 0;
		for(int i=0; i<5; i++) {
			sum += a[i];	
			average = (double) sum /5;
		}
		return average;
	}
}
