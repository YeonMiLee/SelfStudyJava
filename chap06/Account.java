package quiz;

import java.util.Scanner;

public class Account {
	Scanner scan = new Scanner(System.in);
	
	String name;
	String accno;
	int balance;
	
	public void Account() {
		this.name = name;
		this.accno = accno;
		this.balance = balance;
	}
	
	public void deposit(int money) {			
		System.out.println(money +"원 입금합니다.");
		this.balance += money;
		System.out.println("입금완료");	
	}
	
	public void withdraw(int money) {				
		System.out.println(money +"원 출금합니다.");
		this.balance -= money;
		System.out.println("출금완료");		
	}
	
	public void check() {
		System.out.println("잔액을 조회합니다.");
		System.out.println("잔액: " + this.balance);
	}	

	public static boolean exit() {
		System.out.println("프로그램을 종료합니다.");
		return false;
	}
	

	
//	public void deposit(int money) {
//		System.out.println("입금 금액을 입력하세요.");
//		int in = scan.nextInt();		
//		a += in;
//		System.out.println(in +"원 입금합니다.");		
//		System.out.println("입금완료");	
//	}
//	
//	public static int withdraw(int a) {
//		System.out.println("출금 금액을 입력하세요.");
//		int out = scan.nextInt();
//		a -= out;
//		System.out.println(out +"원 출금합니다.");		
//		System.out.println("출금완료");
//		return out;	
//	}
//	
//	public static void check(int a) {
//		System.out.println("잔액을 조회합니다.");
//		System.out.println("잔액: " + a);
//	}
	
}





















