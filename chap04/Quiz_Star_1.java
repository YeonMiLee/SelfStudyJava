package quiz;

import java.util.Scanner;

public class Quiz_Star_1 {

	public static void main(String[] args) {
		// 숫자를 입력받아 별 출력하기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요: ");
		int star = scanner.nextInt();
		
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				if(j == i) {
					System.out.println();
				}
			}	
		}
		
		
		
		
		scanner.close();
	

	}

}
