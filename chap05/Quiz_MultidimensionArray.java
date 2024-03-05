package quiz;

public class Quiz_MultidimensionArray {

	public static void main(String[] args) {
		// 파스칼 삼각형 출력하는 프로그램
		// 첫번째 줄 첫번째 행은 1로 초기화 한 후 
		// 다음줄부터 바로 위 값과 바로 위 왼쪽 값을 더한 값이 적용됨
		// 6행6열 배열로 풀이
		
		
		int[][] a = new int[6][6];
		int i, j;
		
		a[1][1] = 1;
		System.out.print(a[1][1]);
		System.out.println();
		
		for(i=2; i<a.length; i++) {
			for(j=1; j<=i; j++) {
				a[i][j] = a[i-1][j-1] + a[i-1][j];
				System.out.print(a[i][j]);				
			}
			System.out.println();
		}
	}

}
