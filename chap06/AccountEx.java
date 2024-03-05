package quiz;

import java.util.Scanner;

public class AccountEx {
	static Scanner scan = new Scanner(System.in);
	static Account[] member = new Account[100];
	
	public static void main(String[] args) {		
		
		boolean run = true;
		                                        
		while(run) {
			System.out.println("MIT 뱅크에 오신것을 환영합니다.");
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 계좌 업무");
			System.out.println("3. 종료");
			System.out.print("선택>");
			
			int selectNum = Integer.parseInt(scan.nextLine());
			
			switch(selectNum) {
				case 1:		//계좌생성			
					System.out.println("계좌를 생성합니다.");
					System.out.println("예금주 이름을 입력하세요.");
					System.out.print(">");
					String name = scan.next();								
					
					System.out.println("계좌 번호를 입력하세요.");
					System.out.print(">");
					String accno = scan.next();
					
					System.out.println("초기입금액을 입력하세요.");
					System.out.print(">");
					int balance = Integer.parseInt(scan.nextLine());					

					Account acc = new Account();
					
					for(int i=0;i<member.length;i++) {
						if(member[i]==null) {
							member[i]=acc;
							break;
							}
					}
					System.out.println("계좌 생성");
				case 2:			
					int chkAccIdx = -1;
					System.out.println("사용하고자 하는 계좌 번호를 입력하세요.");
					System.out.print(">");
					String selectAccountNum = scan.nextLine();
					
					for(int i=0;i<member.length;i++) {
						if(member[i] == null) {
							continue;
						}
					}					
					if(chkAccIdx == -1) {
						System.out.println("해당 계좌를 찾을수 없습니다.");
					}else {
						//bankFunction() 실행
						bankFunction(chkAccIdx);
					}					
					break;
				case 3: //종료
					System.out.println("프로그램 종료합니다.");
					run = false;
					break;
				default:
					System.out.println("잘못 입력했습니다.");
					System.out.println("다시 확인해 주세요.");					
			}
		}
	}
		private static void bankFunction(int chkAccIdx) {
			//실제 계좌를 가지고 업무를 사용하는 메서드
			while(true) {
				System.out.println(member[chkAccIdx].name+"님 환영합니다.");
				System.out.println("업무를 선택하세요.");
				System.out.println("1. 입금");
				System.out.println("2. 출금");
				System.out.println("3. 잔액 조회");
				System.out.println("0. 메인메뉴 돌아가기");
	 			System.out.print(">");
	 			
	 			int selectNum = Integer.parseInt(scan.nextLine());
				int money = 0;
				
				switch(selectNum) {
				case 1://입금
					System.out.println("입금 금액을 입력하세요.");
					money = Integer.parseInt(scan.nextLine());
					member[chkAccIdx].deposit(money);
					
					break;
				case 2://출금
					System.out.println("출금 금액을 입력하세요.");
					money = Integer.parseInt(scan.nextLine());
					member[chkAccIdx].withdraw(money);
					break;
				case 3://조회
					member[chkAccIdx].check();
					break;
				case 0:
					System.out.println("메인 메뉴로 돌아갑니다.");
					return;
				default:
					System.out.println("잘못 입력했습니다.");
					System.out.println("다시 확인해 주세요.");
				}
		}
			
			
		
	}
}

