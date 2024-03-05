package quiz;

import java.util.Scanner;

public class Quiz3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("연필자루 수: ");
		String Pencil = scanner.nextLine();
		
		System.out.println("학생 수: ");
		String People = scanner.nextLine();
		
		System.out.println("------------------------");
				
		int x = Integer.parseInt(Pencil);
		int y = Integer.parseInt(People);
		int result1 = x / y;
		int result2 = x % y;						
		
		System.out.println("학생 1명당 연필 갯수: " + result1);
		System.out.println("남는 연필 갯구: " + result2);				
		
		scanner.close();

	}

}
