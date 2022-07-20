package org.lang.String;

public class StringStudy3 {

	
	
	
	public void stringSplit3() {
		
		//기준을 통일해서 분리 
		
		String info = "서울, 대전-부산, 부산-제주, 광주-강릉";
		
		
		//데이터를 가공하기 전에 다듬는 과정 -전처리

		info = info.replace("-", ","); //replace =  (,) , (-)로 통일
		
		System.out.println(info);
		

		String[] city= info.split(",");
		
		for (String korea :city) {
			System.out.println(korea);
			
		}
	
	
	
	}
	
	
	
	
	
	public void stringSplit2() {
		
		//년도 월, 일 분리
		
		String info=" 1997 12 24";
	
		String [] infos = info.split(" ");
		
		for (String str : infos) {
			
			System.out.println(str );
		}
	
	}

	
	
	public void stringSplit() {
		
		String str = "iu,suzy, choa, hani";
		
		String [] names = str.split(","); //쉼표기준으로 분리 

		
		//for -> for(초기식;조건식;증감식){}
				//향상된 for문 
				//for(배열에모은데이터타입 변수명: 배열참조변수명){}
		
		
		for(int i=0; i<names.length; i++) { //기존 사용한 for문 ,인덱스번호로 설정하여 사용해야할때
			
			String name = names[i];
		}
		
			
		for (String name :names) { // 향상된 for문 , 인덱스번호가 필요 없을때
			System.out.println(name);
			
		}
		
	}
}
