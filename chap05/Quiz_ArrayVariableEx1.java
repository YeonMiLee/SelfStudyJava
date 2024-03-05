package quiz;

import java.util.Scanner;

public class Quiz_ArrayVariableEx1 {

	public static void main(String[] args) {
//		1. 정수 10개를 입력받은 후 세번째, 다섯번째와 마지막으로 입력받은 정수를 차례로 출력
//		입력 ex) 5 3 9 6 8 4 2 8 10 1
//		출력 ex) 9 8 1
		
		Scanner scanner = new Scanner(System.in);
		
		
		int[] Array = new int[10];
		for(int i=0; i<Array.length; i++) {
			Array[i] = scanner.nextInt();					
		}
		
		System.out.print(Array[2] + " " + Array[4] + " " + Array[Array.length-1]);

		
		
		
		scanner.close();
	}
}

