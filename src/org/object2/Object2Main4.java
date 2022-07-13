package org.object2;

public class Object2Main4 {

	public static void main(String[] args) {
		member mm =new member();
		mm.name="aa";
		mm.age=18;
		mm.email="aaa@naver.com";
		
		
		
		member mm2 =new member();
		mm2.name="bb";
		mm2.age=10;
		mm2.email="bb@naver.com";
		
		
		
		member mm3 =new member();
		mm3.name="cc";
		mm3.age=9;
		mm3.email="cc@"
				+ "naver.com";
	
		member[] members= new member[3];  //멤버들을 담을 수 있는 3개 생성 
	
		members[0]=mm;
		members[1]=mm2;
		members[2]=mm3;
		
			Method4 m4 = new Method4();
			m4.info(members);
			
			System.out.println(members.length);
	}

}
