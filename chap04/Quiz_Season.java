package quiz;

import java.util.Scanner;

public class Quiz_Season {

	public static void main(String[] args) {
		// 월(int) 입력받아 해당 월의 계절 호출하기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력해 주세요: ");
		
		int month = scanner.nextInt();
		
		switch(month) {
			case 1, 2, 12 :
				System.out.println(month + "월은 겨울 입니다.");
				break;
			case 3, 4, 5 :
				System.out.println(month + "월은 봄 입니다.");
				break;
			case 6, 7, 8 :
				System.out.println(month + "월은 여름 입니다.");
				break;
			case 9, 10, 11 :
				System.out.println(month + "월은 가을 입니다.");
				break;
			default:
				System.out.println("");
				break;

	}	
		
		
		scanner.close();

	}

}
