package org.object1.ex1;

import java.util.Scanner;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		Student [] students = new Student[3];
		//student 배열을 만들어서 student 3명을 모을거다
		
		for (int i=0; i<students.length;i++) {
			
			System.out.println("이름 입력");
			st.name= sc.next();//a,b,c
			students[i] =st;
			//st를 students의 i번째(0)에 넣음
		}
		for (int i=0; i<students.length; i++) {
			System.out.println(students[i].name);
		
		
		}
		
		
		System.out.println("프로그램 종료");
	}

}
