package quiz;

import java.util.Scanner;

public class gugudanTwoNum {

	public static void main(String[] args) {
		// 두개의 숫자를 입력받아 작은수부터 구구단 출력하기

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단을 입력하세요");
		int number1 = scanner.nextInt();		
		
		System.out.println("단을 입력하세요");
		int number2 = scanner.nextInt();
		
		if(number1 > number2) {		
			System.out.println(number2 + "단");
			for(int i=1; i<=9; i++) {
				System.out.println(number2 + " X " + i + " = " + (number2*i));
			}			
		} 
			System.out.println(number1 + "단");
			for(int i=1; i<=9; i++) {
				System.out.println(number1 + " X " + i + " = " + (number1*i));
			}
		
		scanner.close();
		
		
		

	}

}


//public static void main(String[] args) throws Exception{
//	
//	Scanner sc = new Scanner(System.in);
//	
//	gugudanTwoNum num = new gugudanTwoNum();
//	
//	System.out.print("몇단부터 몇단까지 출력할까요");
//	gugudanTwoNum.calc(sc.nextInt(),sc.nextInt());
//	
//	sc.close();
//
//}
//
// static void calc(int y, int z) {
//	if (y<=z) {
//		for (int i=y; i<=z; i++) {
//			calcs(i);
//		}
//	} else {
//		for (int i=z; i<=y; i++) {
//			calcs(i);
//		}
//	}
// }
//
// private static void calcs(int number) {
//	System.out.println(number + "단");
//	for (int i=1; i<=9; i++) {
//		System.out.println(number + "X" + i + "=" + number*i);
//	}
//	System.out.println();
// }
//
//}

//void calc(int y, int i) { 처음에 만든 코드
//if(y<i) {
//	for(int j=y; j<=i; j++) {
//		for(int x=1; x<=9; x++) {
//			System.out.println(j+"X"+x+"="+j*x);
//		}
//	}
//}
//else if(y>i){
//	for(int j=i; j<=y; j++) {
//		for(int x=1; x<=9; x++) {
//			System.out.println(j+"X"+x+"="+j*x);
//		}
//	}
//}
//else {
//	for(int j=y; j<=y; j++) {
//		for(int x=1; x<=9; x++) {
//			System.out.println(y+"X"+x+"="+y*x);
//		}
//	}
//}
//					
//}
