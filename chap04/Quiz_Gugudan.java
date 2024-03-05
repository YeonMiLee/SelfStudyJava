package quiz;

import java.util.Scanner;

public class Quiz_Gugudan {

	public static void main(String[] args) {
		// Scanner로 두개의 숫자 입력받은 후 
		// 첫번째 입력 값은 단/ 두번째 입력 값은 배수로 구구단 데이터 출력

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("출력하고자 하는 단을 입력하세요.");
		int dan = scanner.nextInt();
		System.out.println("출력하고자 하는 데이터를 입력하세요.");
		int num = scanner.nextInt();
		
		
		for(int j=1; j<10; j++) {			
			if (j % num == 0) {
				System.out.println(dan + " X " + j + " = " + (dan * j));	
			}
		}
		
		
		
		
		scanner.close();
	}

}


