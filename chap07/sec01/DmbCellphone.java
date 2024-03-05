package sec01.exam;

public class DmbCellphone extends Cellphone {
	//필드
	int channel;
	
	//생성자
	DmbCellphone(String model, String color, int channel) {
		super();		//자식 생성자의 맨 첫 줄에서 부모 생성자가 호출됨
		this.model = model;		//Cellphone클래스로부터 상속받은 필드
		this.color = color;		//Cellphone클래스로부터 상속받은 필드
		this.channel = channel;	
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDMB(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDMB() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
