package org.util.Calendar;

import java.time.Year;
import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
	
		
		// 추상클래스라 객체는 못만듬 
		
		//Calendar ca = new GregorianCalendar(); // 다형성
		// 현재 년 월 일 시 분 초 밀리센컨즈
		Calendar ca = Calendar.getInstance();
		System.out.println(ca);
	
		
		//============= set
		ca.set(Calendar.YEAR, 2002);//Calendar, year를 2022으로 셋팅하고 싶음 
		ca.set(Calendar.MONTH, 11);
		ca.set(Calendar.DATE, 25); 
		
		//=================get
		int x =ca.get(ca.YEAR);  // <-- ②2022년의 변수를 넣어 YEAR-> 상수, 누어있으면 앞에 sataic이 있다고 볼 수 있음 
		int y =ca.get(ca.MONTH); // 7월인데 6월인 이유 - 달력은 1월부터인데 컴퓨터는 0부터 세기 때문에 6월임 
		//int z =ca.get(ca.DATE);
		int z =ca.get(ca.DAY_OF_MONTH);
		int h =ca.get(ca.HOUR); // 하루를 12시간으로 표기하는 형태 
		int o =ca.get(ca.HOUR_OF_DAY);  //하루를 24시간 형태를 표현
		int m = ca.get(ca.MINUTE);
		int n = ca.get(ca.SECOND);

		
		
		System.out.println(x); // ①2022년 현재를 빼내오자
		System.out.println(y+1);
		System.out.println(z);
		System.out.println(h);
		System.out.println(o);
		System.out.println(m);
		System.out.println(n);
	
	
		//================long
	long mills = ca.getTimeInMillis();
	
	System.out.println(mills);



	}

}

// 날짜, 현재시간을 담고 있음 , Calendar 호출
//java.util.GregorianCalendar[time=1658380726966,areFieldsSet=true,areAllFieldsSet=true,
//lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,
//transitions=30,lastRule=null],
//firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=30,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=202,
//DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=18,SECOND=46,MILLISECOND=966,ZONE_OFFSET=32400000,DST_OFFSET=0]
																		//객체가 만들어질때 시간 