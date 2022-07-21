package org.util.Calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
//		Calendar now = Calendar.getInstance();//15시 06분
//		Calendar future = Calendar.getInstance(); //16시 01분
//		
//		future.set(Calendar.MINUTE, 15); // Calendar.MINUTE을 7분으로 바꿔
//
//			//  몇 초가 차이나는지 구하기
//			long n = now.getTimeInMillis(); //시간차이계산할때 씀
//			long f = future.getTimeInMillis();
//			
//			long result =f-n;
//			
//			System.out.println(result);
//			System.out.println(result/1000);
//			
//			//분단위로 환산
//			System.out.println(result/(1000*60));// 분= 60분 
		
		
		
		
		//과거로 부터 현재까지 며칠을 살고 있는지 대략적으로 계산 
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		
		// birth 날짜 수정
		birth.set(Calendar.YEAR, 1996);
		birth.set(Calendar.MONTH, 10); // 컴퓨터는 10으로 나오지만 달력으로는 11월데이터임 
		birth.set(Calendar.DATE,  07);
		
		
		
		long n = now.getTimeInMillis();
		long b = birth.getTimeInMillis();//b를 getTimeInMillis로 변경
		
		
		long result = n-b;
		
		result =result/(1000*60*60*24);
		result =result/465;
		System.out.println(result);
		
		
//		System.out.println(result/1000); // 초 단위
//		System.out.println(result/(1000*60)); //분 단위 
//		System.out.println(result/(1000*60*60)); //시 단위 
//		System.out.println(result/(1000*60*60*24)); //일 단위 
//		System.out.println(result/(1000*60*60*24*365)); //년 단위 
	
			Date data =now.getTime();
			System.out.println(data);
		
	}
}
