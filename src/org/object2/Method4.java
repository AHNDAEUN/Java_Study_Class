package org.object2;

public class Method4 {

	//info 
	//멤버들의 정보를 출력하는 메서드
	
	
	public void info(member[] members) {
		for (int i =0; i<members.length;i++) {
			
			System.out.println(members[i].name);// 멤버스의 데이터타입은 멤버의 배열타입 i번째까지는 멤버타입
			System.out.println(members[i].age);// 멤버스의 데이터타입은 멤버의 배열타입 i번째까지는 멤버타입
			System.out.println(members[i].email);// 멤버스의 데이터타입은 멤버의 배열타입 i번째까지는 멤버타입
		}
		
		members = new member[2];
		
	
}
}