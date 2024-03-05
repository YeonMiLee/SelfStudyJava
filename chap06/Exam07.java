package quiz;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// 입력 받은 두개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드를 정의
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 두개 입력해주세요.");
		System.out.println("> ");
		int ai = scanner.nextInt();

		System.out.println("> ");
		int bi = scanner.nextInt();
		
		maxNumber(ai, bi);		
		
		scanner.close();

	}
	public static void maxNumber(int a, int b) {
		
		if (a == b) {
			System.out.println("두 수가 같습니다.");
		} else if ( a > b) {
			System.out.println(a + " 와 " + b + " 중에 " + a + "가 더 큽니다.");
		} else if ( a < b) {
			System.out.println(a + " 와 " + b + " 중에 " + b + "가 더 큽니다.");
		}
	}
}
