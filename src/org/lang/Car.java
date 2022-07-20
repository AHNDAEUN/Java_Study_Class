package org.lang;

public class Car {

	// 참조변수 출력
	@Override
	public boolean equals(Object obj) {
		Car car =(Car)obj;
		return true;
	}
	
	//tostring 출력
	
	@Override
	public String toString() { //참조변수를 찍으면 주소가 나와야하는데 오버라이딩하면 오버라이딩한 내용이 나옴 
		// TODO Auto-generated method stub
		return "car에서 오버라이딩 함";
		
	}
}
