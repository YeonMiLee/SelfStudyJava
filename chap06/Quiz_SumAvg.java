package quiz;

import java.util.Scanner;

public class Quiz_SumAvg {

	public static void main(String[] args) {
		// 크기 5의 배열의 값을 입력받아 총점과 평균 호출하기
		
		int[] array = new int[5];		
		
		Scanner scanner = new Scanner(System.in);						
		
		System.out.println("정수 5개를 입력하시오.");	
		for(int i=0; i<array.length; i++) {
			array[i] = scanner.nextInt();	
		}
		int sum = sum(array);
		System.out.println("입력된 배열의 합은: " + sum);	
		int avg = avg(array);
		System.out.println("입력된 배열의 평균은: " + avg);	
		
				
		scanner.close();
	}
	
	
	
	public static int sum(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;		
	}
	
	public static int avg(int[] a) {
		int sum = 0;
		int count = 0;
		int avg = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
			count++;
		}
		avg = sum/count;
		return avg;		
	}

	

}
