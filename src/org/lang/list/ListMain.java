package org.lang.list;

import java.util.ArrayList;

public class ListMain {

	
	
	public static void main(String[] args) {
		
		//1,2,3
		
		int [] nums = new int [3];
		nums[0] =1;
		
		//1 .List ->ArrayList 
		
		ArrayList ar =new ArrayList();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		ar.add(0); //데이터와 상관없이 순서 유지됨 
					// adds는 끝에 추가
		ar.add(1,"abc");// 1번 인덱스에 삽입
		ListView listView =new ListView();
		listView.view(ar);
		
		//renove = 특정 인덱스 번호의 요소를 삭제
		ar.remove(2); //내가 지우고 싶은 인덱스 번호를 넣던가 데이터를 넣음 
		ar.remove("abc");
		listView.view(ar);
		
		
		//2. set -특정 인덱스 번호에 요소를 수정 
	
		ar.set(1,'c');
		 //'c' 오토박싱되서 캐릭터로 들어감
		listView.view(ar);

		
		//clear - 모든 요소를 삭제 
		
		ar.clear();
		listView.view(ar);
	
	}
}
