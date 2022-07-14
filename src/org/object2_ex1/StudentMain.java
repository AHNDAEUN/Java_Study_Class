package org.object2_ex1;

import java.util.Scanner;

import org.object1.ex1.StudentSevice;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);		
		
		StudentSevice ss = new StudentSevice();
		
		System.out.println("프로그램 시작");
		
		StudentCotroller st = new StudentCotroller();
		st.start();
		

		
		
		System.out.println("프로그램 종료");
		//student controller의 start를 호출
	}
	
}
