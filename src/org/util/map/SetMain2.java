package org.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		// Random
		//1-45 중복되지 않는 숫자 6개 Set에 담아서 출력
		
		
		Random random =new Random();
		
		
		
		HashSet<Integer> nums =new HashSet<>(); // <-  한번 돌때 6개 담을때까지 
		
		     //반복인데 몇번 돌릴지 모를때 while
			while (nums.size() != 6){ //while (nums.size()<6)
		
			int num =random.nextInt(45)+1;  //0이상  45미만,  0 -> 1, 1 -> 2
				nums.add(num);   //HashSet에 꺼내온 num을 추가 
		
			
			}
	
	//	다 들어가는걸 순환
			Iterator <Integer> iterator =nums.iterator();
		
		

	}
	

}
