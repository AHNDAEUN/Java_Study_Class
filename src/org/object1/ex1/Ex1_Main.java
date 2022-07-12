package org.object1.ex1;

import java.util.Scanner;

public class Ex1_Main {

	public static void main(String[] args) {
		
		
		
		
		System.out.println("프로그램 시작");
		
//		Student st1 = new Student();
//		Student st2 = new Student();
//		Student st3 = new Student();
//		
//		st1.name="안다은";
//		st1.num=010-8917-4013;
//		st1.kor=80;
//		st1.eng=20;
//		st1.math=80;
//		st1.total= kor + eng + math;
//		st1.evg= total/3;
//	
//		System.out.println(st1.name);
//		System.out.println(st1.num);
//		System.out.println(st1.kor);
//		System.out.println(st1.eng);
//		System.out.println(st1.math);
//		System.out.println(st1.total);
//		System.out.println(st1.evg);
		Scanner sc = new Scanner (System.in);
		
		    Student st = null;
		
			for (int i=0; i<3; i++) {
				
			st = new Student();
			System.out.println("이름 입력");
			st.name = sc.next(); 
			}
		
			System.out.println(st.name);
		
		System.out.println("프로그램 종료");
		
		
		
		
		
}
}
