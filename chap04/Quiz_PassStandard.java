package quiz;

import java.util.Scanner;

public class Quiz_PassStandard {

	public static void main(String[] args) {
		// 학생의 국영수 점수를 받아 통과여부 표시
		// 국영수 총합이 210 미만시 탈락
		// 만약 점수 하나가 60미만시 탈락
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("국어 점수를 입력하세요: ");
		int kor = Integer.parseInt(scanner.nextLine());		
		System.out.println("영어 점수를 입력하세요: ");
		int eng = Integer.parseInt(scanner.nextLine());
		System.out.println("수학 점수를 입력하세요: ");
		int math = Integer.parseInt(scanner.nextLine());
		
		sum = kor + eng + math;
		
		if (sum < 210 || (kor < 60 || math < 60 || eng < 60)) {
			System.out.println("탈락");
		} else {
			System.out.println("합격");
		}
			
				
		scanner.close();
		} 
		
	}


