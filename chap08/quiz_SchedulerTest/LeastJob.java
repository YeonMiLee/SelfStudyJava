package quiz_SchedulerTest;

public class LeastJob implements Scheduler {
	//2.짧은대기열 찾아 배분
	//getNextCall() 상담전화를 순서대로 대기열에서 가져오기
	//sendCallToAgent() 현재 상담업무가 없거나 상담대기가 적은 상담원에게 할당
	
	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");	
	}	
	
	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담업무가 없거나 상담대기가 적은 상담원에게 할당합니다.");	
	}

}
