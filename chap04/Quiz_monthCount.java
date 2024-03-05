package quiz;

import java.util.Scanner;

public class Quiz_monthCount {

	public static void main(String[] args) {
		// switch사용
		// 월(int)을 입력받아 해당 월의 일수를 보여주는 프로그램 작성
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("월을 입력하세요: ");
		
		int month = scanner.nextInt();
		
		switch(month) {
			case 1: case 3: case 5: case 7:
			case 8:	case 10: case 12:
				System.out.println("31일까지 입니다.");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("30일까지 입니다.");
				break;
			default:
				System.out.println("28일까지 입니다.");

		}

		scanner.close();

	}

}
