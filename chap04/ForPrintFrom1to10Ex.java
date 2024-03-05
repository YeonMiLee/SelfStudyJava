package sec02.exam;

public class ForPrintFrom1to10Ex {

	public static void main(String[] args) {
		// 1부터 10까지 출력
		
		
//		for (int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		
		// 초기화식 2개 가능
//		for (int i=1, j=100; i<=10 && j<=105; i++, j++) {
//			System.out.println(i);
//			System.out.println(j);
//		}
		
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;			
		}
		
		System.out.println("1~" + (i-1) + "합 : " + sum);
	}

}
