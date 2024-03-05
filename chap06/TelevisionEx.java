package quiz;

public class TelevisionEx {

	public static void main(String[] args) {
		
		Television myTv = new Television();
		
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;		
		
		System.out.println("나의 텔레비전 채널은 " + myTv.channel + ", 볼륨은 " + myTv.volume + ", 현재 상태는 " + myTv.onOff + " 입니다.");
		
	
		Television yourTv = new Television();
		
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		System.out.println("너의 텔레비전 채널은 " + yourTv.channel + ", 볼륨은 " + yourTv.volume + ", 현재 상태는 " + yourTv.onOff + " 입니다.");
	}

}

