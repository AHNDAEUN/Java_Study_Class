package org.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {

	
	//ex1
	//주민번호 입력 : 6-7 :971224-1234567
	//1. 남자 여자 판단
	//2. 현재 나이 출력
	//3. 3월 ~ 5월 : 봄
	//   6월 ~ 8월 : 여름
	//   9월 ~ 11월 : 가을
	//   12월 ~ 2월 : 겨울
	
		public void ex1() {
		
		//Scanner scanner= Scanner(System.in);
		
		System.out.println("주민번호입력");
		//String jumin = sc.next();
		String junmin ="970324-2234567";
		
		//this.check1(junmin);
		//this.age(junmin);
		this.season(junmin);
		
		}
	
		private void check1(String jumin) { // 주민번호 매개변수로 받음 
			//1. 남자 여자 판단 
			//문자열 중에 하나의 글자를 빼내오는 charAt
			 char ch =jumin.charAt(7);  //'1'
			 
			if(ch=='1' || ch=='3' ) { //1 또는 3이라면
			
			System.out.println("남자");
			
			}else 	
				
				System.out.println("여자");

			}	
	
	

		private void age(String jumin) {
			//나이를 계산하려면 태어난 연도가 필요함 => 맨앞에 2자리를 숫자로 가져오기(2022-맨 앞자리)
			//문자열에서 두자리를 빼내오고 싶을때 => substring
	
			String year = jumin.substring(0, 2);  //substring의 리턴타입이 string이여서 앞에 입력해야함
			char ch = jumin.charAt(7);//1900,2000,2
			String cen ="20";
			if(ch=='1'&& ch=='2') {
			cen="19";
			}

			year=cen+year;
			int y = Integer.parseInt(year);
			
			y=2022-y;
				
			System.out.println(year); // 문자열 97
		
			System.out.println("Age :"+y); // 문자열 97
		
			
		}

		private void season(String jumin) {
			
			
//			메서드 안에 선언된 변수들있음 매개변수안 주민은 주민번호가 들어올 예정
//			주민번호를 가지고 서브스트링할거임
//			주민으로 선언할 변수를 가공하고 안쓸거면 재활용해서 사용 가능 스트링타입이면 다른 스트링이 필요할때 
			jumin= jumin.substring(2,4);
			System.out.println(jumin);
			
			//int month=0;
			int month= Integer.parseInt(jumin);
			System.out.println(month);
			if(month>2 && month<6) {
				
				System.out.println("봄");
				
			}else if(month>5 && month< 9) {
			
				System.out.println("여름");
			}else if(month>8 && month< 12) {
			
			System.out.println("가을");
			}else {
		
		System.out.println("겨울");
	}
		
		
		
		
		}		
		
}