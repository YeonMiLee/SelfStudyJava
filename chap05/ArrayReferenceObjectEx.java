package sec02.exam;

public class ArrayReferenceObjectEx {

	public static void main(String[] args) {

//		String[] strArray = new String[3];
//		strArray[0] = "Java";
//		strArray[1] = "C++";
//		strArray[2] = "C#";
		
		
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		System.out.println();

	}

}
