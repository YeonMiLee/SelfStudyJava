package sec02.exam;

import java.text.SimpleDateFormat;		//내가 사용한 클래스에 대해서만
import java.util.Date;					//내가 사용한 클래스에 대해서만

//import java.text.*;	전체
//import java.util.*;	전체

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
