package quiz;

import java.util.Scanner;

public class Quiz_GradeCounterEng {

	public static void main(String[] args) {
		// 성적을 받은 후 A+~F까지 분류하여 출력
		// 바깥에는 A,B,C,D만 판단 그 안에서 다시 if문
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요: ");
		int score = Integer.parseInt(scanner.nextLine());
		
		if(score>=90) {	
			System.out.print("A");
			if(score>=97) {
				System.out.print("+");
			} else if(score>=94) {
				System.out.print("0");
			} else if(score>=90) {
				System.out.print("-");
			}
		}		
//		if(score>=90) {						
//			if(score>=97) {
//				System.out.println("A+");
//			} else if(score>=94) {
//				System.out.println("A0");
//			} else if(score>=90) {
//				System.out.println("A-");
//			}
//		}
		else if(score>=80) {						
			if(score>=87) {
				System.out.println("B+");
			} else if(score>=84) {
				System.out.println("B0");
			} else if(score>=80) {
				System.out.println("B-");
			}
		} else if(score>=70) {						
			if(score>=77) {
				System.out.println("C+");
			} else if(score>=74) {
				System.out.println("C0");
			} else if(score>=70) {
				System.out.println("C-");
			}
		} else if(score>=60) {						
			if(score>=67) {
				System.out.println("D+");
			} else if(score>=64) {
				System.out.println("D0");
			} else if(score>=60) {
				System.out.println("D-");
			}
		} else {			
			System.out.println("F");
		}
		
		
		
		scanner.close();
		

	

	}
}
