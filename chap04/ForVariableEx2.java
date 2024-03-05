package sec02.exam;

import java.util.Scanner;

public class ForVariableEx2 {

	public static void main(String[] args) {
		// 2. 숫자를 입력받아 그 숫자까지의 팩토리얼 구하기
		// (단, 1~n을 곱하는게 아니라 n~1을 곱하는 방식)
		
		Scanner scanner = new Scanner(System.in);	
		
		int facto = 1;
		System.out.print("N을 입력해 주세요: ");					
		int N = scanner.nextInt();		
				
		for(int i = N; i >= 1; i--) {
//			System.out.println(facto + " * " + i);
			facto *= i; 
		}
		System.out.println(facto);
		
		scanner.close();

	}

}
