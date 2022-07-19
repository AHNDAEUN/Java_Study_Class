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
		String junmin ="971224-4234567";
		
		//this.check1(junmin);
		this.age(junmin);
		
		}
	
		private void check1(String jumin) {
	//1. 남자 여자 판단 
		//문자열 중에 하나의 글자를 빼내오는 charAt
			 char ch =jumin.charAt(7);  //'1'
			 
			if(ch=='1' || ch=='3' ) { //1 또는 3이라면
			
			System.out.println("남자");
			
			}else 	
				
				System.out.println("여자");

			}	
	
	
	
	




private void age(String jumin) {
	 //나이를 계산하려면 태어난 연도가 필요함 => 맨앞에 2자리를 숫자로 가져오기 2022-맨 앞자리
	//문자열에서 두자리를 빼내오고 싶을때 => substring
	
	String year = jumin.substring(0, 2);  //substring의 리턴타입이 string
	
	System.out.println(year);
	
}

}