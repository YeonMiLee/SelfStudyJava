package quiz_loginsys;

import java.util.Scanner;

public class LoginSys {
	
	public static Member[] members = new Member[100];
	public static Scanner scan = new Scanner(System.in);
	public static int session = -1;
	
	static void main(String[] args) {
		
		//new Controller();
		Controller.init();		
		
	}
}
