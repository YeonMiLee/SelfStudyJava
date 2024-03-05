package quiz;

import java.util.Scanner;

public class gugudanOver {

	public static void main(String[] args) {
		// 숫자가 하나만 입력되면 해당 숫자의 구구단을 출력
		// 두번째 숫가자 입력되면 작은 수부터 큰수까지 구구단 출력하기
		// 매서드 오버로딩
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단을 입력하세요.");
		System.out.println(">");		
		int dan1 = Integer.parseInt(scanner.nextLine());
		gugudan(dan1);
		
		System.out.println("두번째 숫자를 입력하세요.");
		System.out.println(">");
		int dan3 = Integer.parseInt(scanner.nextLine());
		gugudan(dan1, dan3);
		
		scanner.close();

	}
	
	public static void gugudan(int n) {		
			System.out.println(n + "단");
			for(int i=1; i<=9; i++) {
				System.out.println(n + " X " + i + " = " + (n*i));
			}
	}
			
	public static void gugudan(int n, int m) {
		if(n < m) {
			for(int i=n; i<=m; i++) {
				System.out.println(i + "단");
				for(int j=1; j<=9; j++) {
					System.out.println(i + " X " + j + " = " + (i*j));
				}
			}
		} else if(n > m) {
			for(int i=m; i<=n; i++) {
				System.out.println(i + "단");
				for(int j=1; j<=9; j++) {
					System.out.println(i + " X " + j + " = " + (i*j));
				}
			}
		} else {
			for(int i=1;i<=9;i++) {
				System.out.println(n+"*"+i+"="+(n*i));
			}
		}
	}
}
