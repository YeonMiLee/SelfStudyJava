package quiz;

import java.util.Scanner;

public class Quiz_TheaterResevation {

	public static void main(String[] args) {
		// 영화관 좌석예매(좌석 개수: 7개)
		// 1.좌석번호(index)를 입력받아 예매하는 시스템
		// 2.예매가 완료되면 해당 좌석 값을 1로 변경
		// 3.이미 예매가 완료된 좌석은 재구매불가
		// 4.좌석 가격은 12,000원
		// 5. 프로그램 종료 후, 해당 영화관의 총 매출액 출력
		
				int[] seat = {0,0,0,0,0,0,0};
				Scanner scan = new Scanner(System.in);
				int count = 0;
				boolean tf=true;
				
				while(tf) {
					System.out.println("=MIT영화관=");
					System.out.println("1.좌석 선택");
					System.out.println("2.종료");
					
					int sel = scan.nextInt();
					
					if(sel == 1) {
						System.out.println("[0~6] 좌석을 선택해주세요.");
						int num=scan.nextInt();
						
						if(num < 7) {
							if(seat[num]==1) {
								System.out.println("해당 좌석은 이미 예약되었습니다.");
							}
							else if (seat[num]==0) {
								seat[num]=1;
								count++;
							}
						}
						
						if(num >= 7) {
							System.out.println("해당 좌석은 존재하지 않습니다.");
						}
						
						
						System.out.println("좌석 현황: ");
						
						for(int i=0; i<seat.length; i++) {
							System.out.print(seat[i]);
						}
						
						System.out.println("");
					}
					
					if(sel == 2) {
						System.out.println("프로그램을 종료합니다.");
						tf = false;
					}
				}
				
				System.out.println("매출액: "+ count*12000);
				scan.close();
			}

		}
