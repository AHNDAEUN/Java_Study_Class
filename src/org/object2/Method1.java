package org.object2;

public class Method1 {

		// class에 선언된  멤버 변수 선언 설계도 > method를 사용하려면 객체를 만들어야함
	
		// 외향적인 것 표현- 이름, 나이
		// 실제로하는 기능 method로 선언
		// 지난 시간 monster, student는 변수으로 선언
		// 멤버 메서드 선언
		//  멤버 변수 선언 공식
		// 접근지정자 [그외 지정자] 데이터타입 변수명;
		//  -[]를 쓸수도 있고 안쓸수도 있는 옵션
		//멤버 메서드 선언 공식 = 접근지정자 [그외 지정자] 리턴타입 메서트( 매개변수들 선언[]) {실행하야하는 코드 작성}  
		//  -[]가 없으면 필수로 사용

	
		// 접근지정자 : public
		//그외지정자 : 삭제
		//리턴타입 : void
		//메서드명 : 각자 생성 (첫글자는 소문자로 시작)
		//매개변수 : 생략
	
		//public(접근지정자) static(그외지정자) void(리턴타입)  메서드(main) ((매개변수) String[] args) {
										//소괄호안에 선언된 변수는 매개변수
		
	// 메서드명 test
	public void test () { //멤버 메서드 선언
		
	System.out.println("test method입니다. 실행하시오.");	
	int num=10;
	System.out.println(num);
	
	} 


	
}
