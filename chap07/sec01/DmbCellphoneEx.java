package sec01.exam;

public class DmbCellphoneEx {
	public static void main(String[] args) {
		//DmbCellphone 객체 생성
		DmbCellphone dmbCellphone = new DmbCellphone("자바폰", "검정", 10);
		
		//Cellphone으로부터 상속받은 필드
		System.out.println("모델: " + dmbCellphone.model);
		System.out.println("색상: " + dmbCellphone.color);
		
		//DmbCellphone의 필드
		System.out.println("채널: " + dmbCellphone.channel);
		
		//Cellphone으로부터 상속받은 메소드 호출
		dmbCellphone.PowerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellphone.sendVoice("아~ 네 반갑습니다.");
		dmbCellphone.hangup();
		
		//DmbCellphone의 메소드 호출
		dmbCellphone.turnOffDMB();
		dmbCellphone.changeChannelDMB(12);
		dmbCellphone.turnOffDMB();
	}
}
