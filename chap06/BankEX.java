package quiz;

public class BankEX {
	public static void main(String[] args) {	
		
		Bank bank1 = new Bank();
		int balance = 0;
		boolean run = true;
		
		System.out.println("안녕하세요. G Bank 입니다.");
		
		while(run) {
			int selectNum = bank1.menu();
			switch(selectNum) {
			case 1:
				balance = bank1.deposit(balance);
				break;
			case 2:
				balance = bank1.withdraw(balance);
				break;
			case 3:
				bank1.check(balance);
				break;
			case 4:
				run = bank1.exit();
				break;
			default :
				bank1.error();
			}
		}
	}		
	
}		

	

