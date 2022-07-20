package org.lang;

import java.util.Scanner; // 이 패키지는 import java.util.Scanner; 선언된 클래스입니다. 

public class LangMain {

	public static void main(String[] args) {
	
	Object obj =new Object();
	
	
	String str= obj.toString();
	Member member =new Member();
	System.out.println(str);

	str= member.toString();
	
	System.out.println(str);
	
	MemberClient mc =new MemberClient();
	Car car = new Car();
	Car car2 = new Car();
	obj = member; 
	
	boolean check =car.equals(obj);//// car == car2
	System.out.println(car);
	System.out.println(car.toString());
	System.out.println(check);
	
	String name ="it";
	System.out.println(name);

	}

}
