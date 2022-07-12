package org.object1;

public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A=3,(구성요소) CLASS M1  OBJECT 
		//B=7,              M2
		//C=4               M3
		System.out.println("프로그램 시작");
		
		//object 생성
		//클래스명 변수명  =  (heap에 생성) new 클래스명();
		//데이터타입 변수명
		 
		Moster moster = new Moster();
	     //monster에는 실제 객체를 가리키는 주소값이 들어있음
        // stack 선언된 지역변수(중괄호 선언), heap 멤버변수 instence heap에 만들어진 애들은 값이 초기화됨
		// reference 주소 참조 = 문자의 초기값 null; (무한대, 알수없음, 비어있음으로 해석)
						//int 초기값 0;
		//멤버 접근
		//변수명, 멤버변수명
		System.out.println(moster.name);// ~.~ : ~의 
		System.out.println(moster.level);// 
		System.out.println(moster.hp);//
		
		moster.name="오크"; // monter의 이름값을 오크로 지정
	//	moster 데이터 타입은 Moster이고 출력했을땐 주소값이 출력됨 org.object1.Moster@626b2d4a
		moster.hp=5;
		moster.level=100;
		
		
		System.out.println(moster.name);
		System.out.println(moster.hp);
		System.out.println(moster.level);
	//=========================================================================
		Moster moster1 = new Moster();
		moster1.name="봉";
		moster1.hp=10;
		moster1.level=30;
		
		System.out.println(moster1.name);
		System.out.println(moster1.hp);
		System.out.println(moster1.level);
	
		
		
			System.out.println(moster);
System.out.println("프로그램 종료");
	}

}
