package quiz;

import java.util.Scanner;

public class Quiz_GradeCounter {

	public static void main(String[] args) throws Exception {
		// 점수를 입력받아 수우미양가를 보여주는 프로그램
		// 조건-점수가 -1이면 프로그램 종료
		// switch문과 if문 둘 다 사용 가능
		
		Scanner scanner = new Scanner(System.in);	
		
//		int score = 0;		
//		while(score != -1) {
//			System.out.println("점수를 입력해주세요.");
//			score = scanner.nextInt();
//			
//			if(score >= 90) {
//				System.out.println("수");			
//			} else if(score >= 80) {
//				System.out.println("우");
//			} else if(score >= 70) {
//				System.out.println("미");
//			} else if(score >= 60) {
//				System.out.println("양");
//			} else {
//				System.out.println("가");
//			} 			
//		}	
		
		int N = 0;
		
		while(true) {
			System.out.println("점수를 입력해주세요.");
			N = scanner.nextInt();
			switch(N/10) {
				case 10, 9:
					System.out.println("수");
					break;
				case 8:
					System.out.println("우");
					break;
				case 7:
					System.out.println("미");
					break;
				case 6:
					System.out.println("양");
					break;
				case 5, 4, 3, 2, 1:
					System.out.println("가");
					break;
		}
		if(N == -1) {break;}		
		
		}
		scanner.close();
	}

}
