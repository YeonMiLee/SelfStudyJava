package quiz;

public class MyTv {
	//필드 isPowerOn, channel, volume를 클래스 외부에서 접근할 수 없도록 제어자 붙이고
	//이 멤버 변수들의 값을 어디서나 읽고 변경할 수 있도로고 getter메소드, setter메소드 추가
	
	private boolean isPowerOn;
	private int channel;
	private int volume;
		
	public boolean getisPowerOn() {
		return isPowerOn;
	}
	public void setisPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getchannel() {
		return channel;
	}
	public void setchannel(int channel) {
		this.channel = channel;
	}
	public int getvolume() {
		return volume;
	}
	public void setisPowerOn(int volume) {
		this.volume = volume;
	}
	

}