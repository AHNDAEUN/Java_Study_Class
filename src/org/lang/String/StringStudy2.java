package org.lang.String;

public class StringStudy2 {
 
	
	public void studyIndexofEx1() {
		
		//1. names에는 몇개의 쉼표가 있는가?(쉼표가 있는 인덱스번호 송출)
				//2.총 몇명?
		
		String names ="iu, suzy, choa, hani"; //2,7,8, 
		
		
		boolean check =true;
		int count =0; //쉼표 갯수를 담을 변수  
		int index=0; //,의 찾은 인덱스 번호 저장
		while (check) {
			
			index = names.indexOf ( ",", index );
		
		if(index == -1) {
			break;
			
		}else { // 아니라면 찾으번호가 들어감
			count++; 
			index++;
			
		}
				
		}// while 의 끝
	
	System.out.println(" , 의 갯수 "+count );
	System.out.println(" 인원수 "+(count+1) );
	
	}
	
	// 리턴타입 int  indexOf(int ch)
	public void StudyIndexOf(int ch) {
		String str = "Hello Java";
		str.indexOf('j'); //  ch=> char e라는 인덱스 번호가 몇번인지 찾아 / 대소문자는 다른 데이터 타입임
		//System.out.println(index); 
		
//		리턴타입 int
//		indexOf(int ch, int fromIndex) ~부터 끝까지
		
		
		str.indexOf("ll");   
		//System.out.println(index);
		
	  String replace =	str.replace('l', 'w');
	
	System.out.println(replace);
	System.out.println(str);
	

	
	str= "Google에 입사지원동기는 .... Google에 입사하면 노예가....";
	System.out.println(str);

	str.replace("Google", "Samsung");
	
	System.out.println(str);
	
	str ="hi"; //2 글자
	String str2 =" hi "; // 4글자(띄어쓰기 포함) 
	str2 =str2.trim();
	str2 = str.replace("", ""); // spacebar를 없는 걸로 하자
	System.out.println(str.equals(str2)); // 공백도 하나의 문자열로 취급하기 때문에 글자가 다르다 인식

	
	
	
	
	
	
	
	}
}
