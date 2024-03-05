package quiz;

public class Quiz_Exam06 {

	public static void main(String[] args) {
		// 2차원 배열에 학년별(4년)로 1,2학기 성적을 저장하고,
		// 4년 전체 평점 평균을 출력하세요.
		
		
		int scores[][] = { {88, 89}, {78, 90}, {95, 90}, {99, 100} };
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {					
				sum += scores[i][j];				
			}
		}
		
		System.out.println("총점: " + sum);
		int n = scores.length;      //4
		int m = scores[1].length;	//2
		System.out.println("평균: " + sum / (n*m));
		

	}

}
