package org.util.st;

import java.util.StringTokenizer;

public class StMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String str= "samsung-500-lg-600-google-900-kakao-700";
	
				//하나의 문자열 자르기
			//	1.spilt
			//	2.StringTokenizer
				
			
			StringTokenizer st =new StringTokenizer(str,"-");  // 기본생성자가 없어서 에러가 뜸
			
				System.out.println(st.countTokens()); // Tokens의 갯수를 담아둠 
						//멤버메서드 호출 : 참조메서드명.멤버메서드
	
				
			while (st.hasMoreTokens()) { //hasMore samsung 첫머리 여기서부터 500 전까지 자를 부분이 더 있나  있으면 true 후 계속 없으면 false 리턴  
				//자를 부분이 있으면 parsing 작업 
			String token =st.nextToken();
			System.out.println(token);
			
			token =st.nextToken();
			System.out.println(token);
			System.out.println("====================");
			}
	
	
	}

}
