package sec02.exam;

public class ForMultiplicationTableEx {

	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			
			for (int n=1; n<=9; n++) {
				System.out.println(m + " X " + n + " = " + (m*n));
			}
			System.out.println();
		}

	}

}

