package quiz;

public class AddTwoArr {
	public static void main(String[] args) {
		// 두배열의 같은 위치의 숫자를 합쳐서 하나의 배열로 만들고 출력
		// 같은 위치에 숫자가 없다면 해당 위치 숫자 그대로 출력
		
		int[] arr1 = new int[] {78, 54, 89, 57, 84};
		int[] arr2 = new int[] {95, 74, 91, 84};
		int[] arr3 = arrAdd(arr1, arr2);
		prt(arr3);
		
	}
	
	
	public static int[] arrAdd(int[]a, int[]b) {	
		int[] result = null;
		if(a.length > b.length) {
			result = new int[a.length];
			for(int i=0; i<a.length; i++) {
				if(i<b.length) {
					result[i] = a[i] + b[i];
				} else {
					result[i] = a[i];
				}
			}
		} else {
			result = new int[b.length];
			for(int i=0; i<b.length; i++) {
				if(i<a.length) {
					result[i] = a[i] + b[i];
				} else {
					result[i] = b[i];
				}
			}
		}
		return result;
	}
	
	public static void prt(int[] sum) {		
		for(int i=0; i<sum.length; i++) {
			System.out.print(sum[i] + ",");				
		}
	}
}

	

