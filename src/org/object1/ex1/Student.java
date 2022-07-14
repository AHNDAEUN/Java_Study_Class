package org.object1.ex1;

public class Student {

	
	String name;
	int num;
	int kor;
	int math;
	int eng;
	int total;
	int avg;

//총점계산 메서드 선언
	
	public void setTotal() {
						//갈색 지역변수
		//지역변수를 멤버변수로 쓰고 싶으면 total 뒤에 this.작성
		//이 메서드를 호출하면 국수영을 더해서 넣으려고함
//		toal = this.kor+eng+ math; //멤버변수  
//	
//		this.setavg();
//
//	public void setavg() {
//			this.avg =this.total/3.0;

}
}

//	멤버변수 메모리 영역 heap 
//	(매개)지역변수 메모리 영역 stack
//	그래서 같은 int total이라도 메모리 영역이 달라서 중복 작성 가능