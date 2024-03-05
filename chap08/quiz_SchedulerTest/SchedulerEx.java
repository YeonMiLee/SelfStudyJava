package quiz_SchedulerTest;

import java.util.Scanner;

public class SchedulerEx {

	public static void call(Scheduler schedule) {
		schedule.getNextCall();
		schedule.sendCallToAgent();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("전화 상담 배분방식을 선택하세요");
		System.out.println("R : 한명씩 차례대로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		
		String input = sc.next();
		
		if(input.equals("R") || input.equals("r")) { 
			call(new RoundRobin());
		} else if(input.equals("L") || input.equals("l")) {
			call(new LeastJob());
		} else if (input.equals("P") || input.equals("p")) {
			call(new PriorityAllocation());		
		} else {
			System.out.println("다시 입력하세요");
		}
				
		sc.close();
	}
		
}

