package quiz;

import java.util.Scanner;

public class Quiz_BMIcaculator {

	public static void main(String[] args) {			
		// 스캐너 클래스를 이용하여 학생의 키(float)와 몸무게(float)를 받아서 BMI(float)를 계산해서 표출
		// 18.5이하 저체중/ ~25 정상/ ~30 과체중/ ~40 비만/ 그 이상 고도비만
		// 계산법 : 몸무게/(키^2) 	
		// 두번째 수에 0 또는 0.0이 입력되었을 경우 "무한대"가 출력되도록				
		
		float weight = 0;
		float height = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키를 입력해 주세요.");
		height = scanner.nextFloat();
		height *= 0.01;
		System.out.println("몸무게를 입력해 주세요.");
		weight = scanner.nextFloat();
		
		
		float bmi = weight / (height * height);
		
		if(bmi<=18.5) {
			System.out.println("저체중입니다.");
		} else if(bmi<=25) {
			System.out.println("정상입니다.");
		} else if(bmi<=30) {
			System.out.println("과체중입니다.");
		} else if(bmi<=40) {
			System.out.println("비만입니다.");
		} else {
			System.out.println("고도비만 입니다.");
		}	
			
		scanner.close();
	
	}
}