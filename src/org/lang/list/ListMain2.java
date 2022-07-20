package org.lang.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		
		ListView listView =new ListView();
	//	ArrayList ar =new ArrayList();
		ArrayList<String> ar =new ArrayList<>(); //<>앞에 넣은것도 뒤에 똑같이 들어감 ,뒤에는 생략가능   
		
		ar.add("fist");
//		ar.add(2); // Integer auto boxing
//		//  다형성때문에 모든 데이터 타입은 object 타입
//		ar.add('c'); // character auto boxing
//		ar.add(2.123);// Double auto boxing
		ar.add(null);
	
	 
	 //get- 특정 index의 요소 반환
	 String n1 =(String)ar.get(0); //만들어 질때는 fist였지만 들어갈때는 오브젝트로 들어감 
//	 int n2 = (Integer)ar.get(1);		//꺼낼때도 오브젝트로 꺼내짐 그 오브젝트는 다른 오브젝트들이 들어갈 수 있음 (String타입도 무수히 많음)
//	 char n3 = (Character)ar.get(2);	//꺼낼때도 같은 String으로 꺼내기위해서 ar.get에 String을 써주면됨
//	 double n4 = (double)ar.get(3);		
	 									// 다형성은 pirimitive(형변환) 제외 reference만 있음, 다형성은 부모 자식간에만 생성됨 
	 
	System.out.println(ar.get(0) instanceof String);							
	 System.out.println(n1);		
//	 System.out.println(n2);		
//	 System.out.println(n3);		
//	 System.out.println(n4);		
	
	 
	 //listView.view(ar);
	}

}
