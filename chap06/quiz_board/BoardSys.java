package quiz_board;

import java.util.Scanner;

public class BoardSys {
	//게시판작성프로그램 글 최대 50개까지
	
	public static Scanner sc = new Scanner(System.in);
	public static Board[] board = new Board[50];
	
	public static void main(String[] args) {
		Controller a = new Controller();
		a.init();
		sc.close();
	}
	
}
