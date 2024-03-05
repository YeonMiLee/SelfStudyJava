package quiz;

public class BankBook {
	
		int total = 0;
		
		int deposit(int money_in) {
			this.total += money_in;		
			return money_in;			
		}
		
		int withdraw(int money_out) {			
			if(this.total <= money_out) {
				System.out.println("금액이 부족합니다.");
			}
			this.total -= money_out;
			return money_out;				
		}
		
		void showMoney() {			
			System.out.println("최종 잔액은: " + this.total + "");
		}
	

}
