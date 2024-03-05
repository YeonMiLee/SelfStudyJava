package quiz;

import java.util.Scanner;

public class Quiz_Star_2 {

	public static void main(String[] args) {
		// 숫자를 입력받아 별 출력하기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = n; j > 0; j--) {				
				if(j > i) {
					System.out.print(" ");					
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		
		scanner.close();
	

	}

}
