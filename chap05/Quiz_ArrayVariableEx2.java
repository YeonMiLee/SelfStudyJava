package quiz;

import java.util.Scanner;

public class Quiz_ArrayVariableEx2 {

	public static void main(String[] args) {		
//		2. 100개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가
//		0이 입력되면 0을 제외하고 그때까지 입력된 정수를 가장 나중에 입력된 정수부터
//		차례대로 출력하시오.
//		입력 ex) 3 5 10 55 0 
//		출력 ex) 55 10 5  3
		
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[100];
		int i, cnt = 0;
		
		for(i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
			
			if(arr[i]==0) {
				break;
			}
			cnt++;
		}
		for(i=cnt-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		
		scanner.close();

	}

}
