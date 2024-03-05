package sec02.exam;

import java.util.Scanner;

public class WileSumFrom1To100Ex {

	public static void main(String[] args) {
		// 1~100까지의 합
		
//		int sum = 0;
//		int i = 1;
//		
//		while(i<=100) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1~" + (i-1) + "합: " + sum);
		
		
		// 1~30까지의 합, true 사용
//		int sum = 0;
//		int i = 1;
//		
//		while(true) {
//			sum += i;
		
//			i++;
//			if(i == 31) {break;}			
//		}
//		System.out.println("1~" + (i-1) + "합: " + sum);
		
		
		//입력받아서		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scanner.nextInt();
		
		int sum = 0;
		int i = 1;
				
		while(i<=num) {
			sum += i;
			i++;		
		}
		System.out.println("1~" + (i-1) + "합: " + sum);
		
		
		
		scanner.close();
	}

}
