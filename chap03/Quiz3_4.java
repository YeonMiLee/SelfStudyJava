package quiz;

import java.util.Scanner;

public class Quiz3_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//0~999사이의 정수를 입력받아 각자릿수를 더한 결과를 출력
		
		System.out.println("0~999 사이의 숫자를 입력하세요: ");
		int x = scanner.nextInt();
		
		int sum;
		sum = x % 10;
		x /= 10;
		sum += x % 10;
		x /= 10;
		sum += x % 10;
		x /= 10;
		System.out.println("각 자릿수의 합= " + sum);		
		
		scanner.close();
	}

}
