package quiz;

import java.util.Scanner;

public class Quiz_Exam05 {

	public static void main(String[] args) {
		// 스캐너 이용하여 양수5개 입력받아 배열에 저장하고 제일 큰 수 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		int num1 = scanner.nextInt();
		System.out.println();
		int num2 = scanner.nextInt();
		System.out.println();
		int num3 = scanner.nextInt();
		System.out.println();
		int num4 = scanner.nextInt();
		System.out.println();
		int num5 = scanner.nextInt();
		
		
		// int[] intArray = new int[5];
		int[] intArray = {num1, num2, num3, num4, num5};
		int max = 0;
		
		// System.out.println("양수 5개를 입력하세요.");
		// for(int i=0; i<intArray.length; i++) {
		//		intArray[i] = scanner.nextInt();
		
		//		if(max < intArray[i]) {
		//			max = intArray[i];
		//		}
		//	}
		
		
		for(int i=0; i<intArray.length; i++) {
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		
		
		System.out.println("가장 큰 수는: " + max);
		
		
		
		scanner.close();
	}	

}
