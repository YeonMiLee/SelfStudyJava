package quiz;

import java.util.Scanner;

public class gugudanTwoNum_T {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int min = scan.nextInt();
		int max = scan.nextInt();
		gugudan(min,max);
		
		
		scan.close();		
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
