package org.util.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance(); // 현재시간
		System.out.println(ca.getTime());

//		ca.roll(Calendar.MINUTE, 20); // 내가 지정한 필드의 시간만 흐르게 하는 것 /Calendar.MINUTE를 20분 흐르게 할꺼야

		ca.add(Calendar.MINUTE, 20); //add는 앞자리까지 흐르게 하는 것 
		System.out.println(ca.getTime());
		
		
		System.out.println("================");
	
		ca = Calendar.getInstance();
		String parttern = "yyyy년 MM월 dd일 E";
		SimpleDateFormat sd = new SimpleDateFormat(parttern);
		String time = sd.format(ca.getTime());
		System.out.println(time); //Calendar를 데이터로 바꿔주는 것 gettime
	}

}
