package quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.println("1.이름: ");
		String Name = scanner.nextLine();
		
		System.out.println("2.주민번호 앞 6자리: ");
		String Identity = scanner.nextLine();
		
		System.out.println("3.전화번호: ");
		String Phone = scanner.nextLine();
		
		System.out.println();
		
		
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름: " + Name);
		System.out.println("2. 주민번호 앞 6자리: " + Identity);
		System.out.println("3. 전화번호: " + Phone);
		
		scanner.close();

	}

}

