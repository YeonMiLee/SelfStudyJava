package quiz;

import java.util.Scanner;

public class Quiz3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 윗변의 길이, 아랫변의 길이, 높이를 입력(Scanner 이용)
		// 받아서 사다리꼴의 넓이(실수)를 구하여 출력하시오.
		
		// 사다리꼴 넓이 구하는 공식 : 
		//(lengthTop + lengthBottom) * height/2.0
		
		System.out.println("윗변: ");
		int lengthTop = Integer.parseInt(scanner.nextLine());
		System.out.println("아랫변: ");
		int lengthBottom = Integer.parseInt(scanner.nextLine());
		System.out.println("높이: ");
		int height = Integer.parseInt(scanner.nextLine());
		
		System.out.println("------------------------");		
		double area = (lengthTop + lengthBottom) * height / 2.0	;	
		
		System.out.println("사다리꼴의 넓이: " + area);
		
		scanner.close();
	}

}
