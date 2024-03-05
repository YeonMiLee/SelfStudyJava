package quiz;

public class CircleArray {
	public static void main(String[] args) {
		//circle 클래스로 객체5개를 가지는 배열 생성,
		//circle 객체의 반지름(매개변수)을 0에서 4까지 각각 지정한 후, 면적 출력
		//면적=3.14*반지름*반지름
		
			Circle[] c = new Circle[5];
			
			for(int i=0; i<c.length; i++)
				c[i] = new Circle(i);
			
			for(int i=0; i<c.length; i++) {
				System.out.print("반지름" + i +" ");
				System.out.print("원의 넓이 : "+ (int)(c[i].getArea()) + " ");
				System.out.println();
			}

		}
	
	}
	

