package quiz;

import java.util.Scanner;

public class Quiz_Gugudan_2 {

	public static void main(String[] args) {
		// 1. do while문 사용하여 구구단2단 출력
			
		int i = 1;
		do {			
			System.out.println("2" + " X " + i + " = " + (2*i));
			i++;
		} while(i < 10);
		System.out.println();
		
		
		
		// 2. while문 사용 scanner로 입력 받은 숫자의 단만 출력
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("출력하고자 하는 단을 입력하세요.");
		int dan = scanner.nextInt();
		int j = 1;
		
		while(j <= 9) {		
			System.out.println(dan + " X " + j + " = " + (dan * j));
			j++;			
		}
		
		
		scanner.close();
	}
	

}