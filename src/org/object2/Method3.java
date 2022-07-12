package org.object2;

public class Method3 {
	//sal
	
	public void sal(int salary) {// ()매개(연결)변수 선언 // 1.외부에서 메서드를 호출할때 필요한 변수를 선언// 다른 곳에서 받아야할때 선언되는 변수
					//메소드와 메인에서 선언된 변수타입은 같지만 변수는 저장된 메모리가 다르기 때문에 중복선언이 아님
		// 월급 계산
		System.out.println("월급 계산");
		System.out.println(salary*0.967);
		salary=20;// 매개변수값을 20으로 변경 , 값이 메인에 영향을 안주는 이유는 20값은 서로 다른 저장소에 저장되어 있기 때문
		
	}
	
	//hap= 누군가가 숫자를 2개 줬을때 더해주는 메서드
		public void hap(int num1, int num2) { // 매개변수 구분은 ,로 해주고 갯수제한은 없음
			System.out.println(num1+num2);
			
		}

		
		//info: 이름 나이 이메일주소를 받아서 출력

	public void info(String name, int age, String email) {
	System.out.println(name);
	System.out.println(age);
	System.out.println(email);
}
// 
	public void info2(member mm) { //멤버 타입 선언
		System.out.println(mm.name);
		System.out.println(mm.age);
		System.out.println(mm.email);
		
		mm.age=100;
	}

}
