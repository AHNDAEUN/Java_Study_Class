package org.util.Calendar;

import java.util.Calendar;

public class CalendarMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar ca = Calendar.getInstance();
		
		ca.set(2022, 11, 12, 31, 59,50);
		
		System.out.println(ca.getTime()); //getTime을 통해 사람이 보기 편하게 자동으로 모자란 부분을 +1 해줌 ex) 11월을 입력했지만 -> 12월달로 출력 
		
		//10초뒤에 몇 년 되는지 시간흘리기, 내년 1월1일 
		
//		long now = ca.getTimeInMillis();
//		now =now+10000; //10초(10000) 더하기
//			
//		
//		//long타입으로 시간환산
//	 ca.setTimeInMillis(now); //long타입으로 된 것을 날짜로 셋팅  
//	 System.out.println(ca.getTime());
	
	}

}
