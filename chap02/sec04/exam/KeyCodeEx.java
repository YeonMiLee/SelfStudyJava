package sec04.exam;

public class KeyCodeEx {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
//		keyCode = System.in.read();
//		System.out.println("keyCode: " + keyCode);
//		
//		keyCode = System.in.read();
//		System.out.println("keyCode: " + keyCode);
//		
//		keyCode = System.in.read();
//		System.out.println("keyCode: " + keyCode);
		
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;
			}
		}
		System.out.println("종료");
	}

}
