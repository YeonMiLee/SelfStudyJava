package quiz;

public class Quiz_Exam04 {

	public static void main(String[] args) {
		// 양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 출력하기
			

		int[] intArray = {3, 5, 8, 4, 2};
		int max = 0;
		
		for(int i=0; i<intArray.length; i++) {
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		
		System.out.println("가장 큰 수는: " + max);
		
		
		
		
		
		
	

	}

}
