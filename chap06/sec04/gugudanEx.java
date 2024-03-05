package sec04.exam;

import java.util.Scanner;

public class gugudanEx {

	public static void main(String[] args) {
		// 단을 외부데이터로 입력 받아서 구구단을 출력하는 메서드 만들기
		
		gugudan gugu = new gugudan();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단을 입력하세요");
		int dan = scanner.nextInt();
		gugu.gugudan1(dan);
		
		
		scanner.close();
		
		

		
		
		
	}

}
