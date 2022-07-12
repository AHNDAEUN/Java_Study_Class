package org.object2;

public class Object2Main3 {

	
	public static void main(String[] args) {
	
		Method3 m3= new Method3();
		 
		//월급 입력
		int salary = 500;
		m3.sal(salary);//인자값 2, 선언하는게 아니라 메소드가 필요한 값을 넣어줌
		System.out.println(salary); 
		//m3.hap(10, 20);
	
		System.out.println();
	
		//
		
		
		m3.info("안다은", 11, "ddd@ddd"); //1
	
		
		member mm= new member();
			mm.name= "아아아아";
			mm.age= 27;
			mm.email= "nolboo@naver.com";
			m3.info2(mm);//2
	// 1은 필요할때마다 추가해야하지만 2는 class영역에만 추가하고 변경하지 않아도 된다.
	
	System.out.println(mm.age);
	}
}
