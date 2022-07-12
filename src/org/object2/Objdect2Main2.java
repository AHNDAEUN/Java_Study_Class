package org.object2;

import java.util.Scanner;

public class Objdect2Main2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		AnimalSound as= new AnimalSound();
		System.out.println(" 1. dog 2. cat 3. tiger ");
		int select=sc.nextInt();
		
		System.out.println("횟수를 입력");
		int count = sc.nextInt();
		
		for (int i=0; i<count; i++) {
			if (select==1) {
			//for (int i=0; i<count; i++) {
			as.dogsound();
			//}1번 방법
		}else if(select==2) {
			as.catsound();
		
		}else {
			as.tigersound();
		}
			
		}
	}

}
