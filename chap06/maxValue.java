package quiz;

public class maxValue {	
	public static void main(String[] args) {
	//주어진 배열 입력받아 가장 큰 수를 반환하는 메서드	
	
	int[] Array = new int[] {78, 54, 89, 57, 84, 95, 74, 91, 84, 67, 52, 94, 82};	
	int max = maxNumber(Array);
	
	System.out.print("최대값: " + max);
	
}

	public static int maxNumber(int[] a) {
		int max = 0;
		for(int i=0; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}				
		}
		return max;
	}
}