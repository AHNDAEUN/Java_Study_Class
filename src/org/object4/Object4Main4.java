package org.object4;

public class Object4Main4 {

	public static void main(String[] args) {
		Resume re= new Resume();
					//Resume 생성자 호출


		//객체 생성시 멤버변수의 값을 초기화 하거나, 어떤 일을 하고 싶을 때 사용
		
//		car1.company="쌍용";②
//		car1.brand="토레스"; //->객체를 생성후 멤버변수에 값을 대입
//		car1.info();
		
		
		Car car2 = new Car("black");
		car2.info();
	
	}

}
