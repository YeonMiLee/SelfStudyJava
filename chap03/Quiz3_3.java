package quiz;

import java.util.Scanner;

public class Quiz3_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 두 -실수-를 입력(Scanner 이용)받아서 첫번째 수에 두번쨰 수를 나눈 결과를 출력
		// 첫번째 수에 두번쨰 수를 나눈 결과를 출력		
		// 두번째 수에 0 또는 0.0이 입력되었을 경우 "무한대"가 출력되도록
				
		
		
		System.out.println("첫번째 수: ");
		double num1 = Double.parseDouble(scanner.nextLine());
		System.out.println("두번째 수: ");
		double num2 = Double.parseDouble(scanner.nextLine());		
		
		System.out.println("------------------------");	
			
		double devide = num1 / num2;
		String result = (num2 != 0.0) ? String.valueOf(devide) : "무한대";
		
		System.out.println("결과: " + result);		
		
		scanner.close();
		
	}

}
