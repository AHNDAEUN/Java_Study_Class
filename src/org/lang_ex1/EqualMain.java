package org.lang_ex1;

public class EqualMain {

	public static void main(String[] args) {
		
		
		Phone p1 = new Phone();
		p1.setPrice(100);
		p1.setSize(50);
	
		Phone p2 = new Phone();
			p2.setPrice(100);
			p2.setSize(50);
	
			System.out.println(p1==p2); // 주소를 비교하기 때문에 false 
			System.out.println(p1.equals(p2)); // p1을 기준으로 p2를 비교 
			System.out.println(p2.equals(p1));
			
							//p1호출하고 p2 주소 참조
			
			// 참조변수가 아닌 멤버변수를 비교
			
		
			
	}
	
}
