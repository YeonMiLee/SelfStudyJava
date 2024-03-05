package quiz;

import java.util.Scanner;

public class Quiz_StudentArray {

	public static void main(String[] args) {
		// 학생수(array)와 학생들의 점수를 입력받아,
		// 최고 점수 및 평균 점수를 구하는 프로그램
						
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
								
		Scanner scanner = new Scanner(System.in);	
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");			
			System.out.print("선택> ");	
			
			int number = Integer.parseInt(scanner.nextLine());		
									
			if(number == 1) {							
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());		
				scores = new int[studentNum];
			} else if(number == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("score["+i+"]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());							
				}
			} else if(number == 3) {	
				for(int i=0; i<scores.length; i++) {
					System.out.println("score["+i+"]: " + scores[i]);										
					
				}
			} else if(number == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;	
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if(number == 5) {
				run = false;
			}			
		}
		System.out.print("프로그램 종료");
		scanner.close();		

	}
}
