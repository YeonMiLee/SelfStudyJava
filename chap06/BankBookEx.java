package quiz;

import java.util.Scanner;

public class BankBookEx {

	public static void main(String[] args) {
		// BankBook library class 선언
		// deposit(int money_in), withdraw(int money_out),  showMoney()메소드 선언
		// deposit(int money_in) 입금/ withdraw(int money_out) 출금/ showMoney() 잔액출력
		// 입금액과 출금액 스캐너로 입력받아 2번의 입,출금 실행
		// 출금시 잔액보다 출금액이 많으면 메시지 호출 (금액이부족합니다.)

		Scanner scanner = new Scanner(System.in);
		
		BankBook bankbook = new BankBook();		
		
		bankbook.showMoney();
		
		for(int i=0; i<2; i++) {
			System.out.print("입금액: ");
			int in = scanner.nextInt();
			System.out.println(bankbook.deposit(in) + "원 입금\t");
			
			bankbook.showMoney();
			
			System.out.print("출금액: ");
			int out = scanner.nextInt();
			System.out.println(bankbook.withdraw(out) + "원 출금\t");
			
			bankbook.showMoney();
		}
		System.out.println("\n최종 잔액은 : " + bankbook.total + "원 입니다.");
		
	
		
		scanner.close();
	}

}


